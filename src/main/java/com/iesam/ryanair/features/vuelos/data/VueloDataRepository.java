package com.iesam.ryanair.features.vuelos.data;

import com.iesam.ryanair.features.vuelos.data.local.VueloMemLocalDataSource;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;
import com.iesam.ryanair.features.vuelos.domain.VueloRepository;

public class VueloDataRepository implements VueloRepository {
    private VueloMemLocalDataSource vueloMemLocalDataSource;

    public VueloDataRepository() {
        this.vueloMemLocalDataSource = vueloMemLocalDataSource.newInstance();
    }

    @Override
    public void save(Vuelo vuelo) {
        vueloMemLocalDataSource.save(vuelo);
    }
}
