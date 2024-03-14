package com.iesam.ryanair.features.aviones.data.local;

import com.iesam.ryanair.features.aviones.domain.Avion;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AvionMemLocalDataSource {
    private AvionMemLocalDataSource instance = null;

    private Map<String, Avion> dataStore = new TreeMap<>();

    public void save(Avion model) {
        dataStore.put(model.getCodigoAvion(), model);
    }

    public void saveList(List<Avion> models) {
        for (Avion Avion : models) {
            save(Avion);
        }
    }

    public Avion findById(String codigoAvion) {
        return dataStore.get(codigoAvion);
    }

    public List<Avion> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelDni) {
        dataStore.remove(modelDni);
    }

    public AvionMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new AvionMemLocalDataSource();
        }
        return instance;
    }
}
