package com.iesam.ryanair.features.vuelos.data.local;

import com.iesam.ryanair.features.vuelos.domain.Vuelo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VueloMemLocalDataSource {
    private VueloMemLocalDataSource instance = null;

    private Map<String, Vuelo> dataStore = new TreeMap<>();

    public void save(Vuelo model) {
        dataStore.put(model.getCodigo(), model);
    }

    public void saveList(List<Vuelo> models) {
        for (Vuelo Vuelo : models) {
            save(Vuelo);
        }
    }

    public Vuelo findById(String codigo) {
        return dataStore.get(codigo);
    }

    public List<Vuelo> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelCodigo) {
        dataStore.remove(modelCodigo);
    }

    public VueloMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new VueloMemLocalDataSource();
        }
        return instance;
    }
}
