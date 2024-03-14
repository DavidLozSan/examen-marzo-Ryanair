package com.iesam.ryanair.features.personas.data.local;

import com.iesam.ryanair.features.personas.domain.Tripulante;

import java.util.*;

public class TripulanteMemLocalDataSource {
    private TripulanteMemLocalDataSource instance = null;

    private Map<String, Tripulante> dataStore = new TreeMap<>();

    public void save(Tripulante model) {
        dataStore.put(model.getDni(), model);
    }

    public void saveList(List<Tripulante> models) {
        for (Tripulante tripulante : models) {
            save(tripulante);
        }
    }

    public Tripulante findById(String id) {
        return dataStore.get(id);
    }

    public List<Tripulante> findAll() {
        return dataStore.values().stream().toList();
    }

    public void delete(String modelId) {
        dataStore.remove(modelId);
    }

    public TripulanteMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new TripulanteMemLocalDataSource();
        }
        return instance;
    }
}
