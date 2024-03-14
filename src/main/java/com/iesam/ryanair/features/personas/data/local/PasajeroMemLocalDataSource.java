package com.iesam.ryanair.features.personas.data.local;

import com.iesam.ryanair.features.personas.domain.Pasajero;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class PasajeroMemLocalDataSource {
    private PasajeroMemLocalDataSource instance = null;

    private Map<String, Pasajero> dataStore = new TreeMap<>();

    public void save(Pasajero model) {
        dataStore.put(model.getDni(), model);
    }

    public void saveList(List<Pasajero> models) {
        for (Pasajero Pasajero : models) {
            save(Pasajero);
        }
    }

    public Pasajero findById(String dni) {
        return dataStore.get(dni);
    }

    public List<Pasajero> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelDni) {
        dataStore.remove(modelDni);
    }

    public PasajeroMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new PasajeroMemLocalDataSource();
        }
        return instance;
    }
}
