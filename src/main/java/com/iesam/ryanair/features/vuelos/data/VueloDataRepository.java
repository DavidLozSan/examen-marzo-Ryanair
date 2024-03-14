package com.iesam.ryanair.features.vuelos.data;

import com.iesam.ryanair.features.vuelos.data.local.VueloMemLocalDataSource;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;
import com.iesam.ryanair.features.vuelos.domain.VueloRepository;

import java.util.ArrayList;
import java.util.List;

public class VueloDataRepository implements VueloRepository {
    private VueloMemLocalDataSource vueloMemLocalDataSource;

    public VueloDataRepository() {
        this.vueloMemLocalDataSource = vueloMemLocalDataSource.newInstance();
    }

    @Override
    public void save(Vuelo vuelo) {
        vueloMemLocalDataSource.save(vuelo);
    }

    @Override
    public ArrayList<Vuelo> obtain(String codigoAvion) {
        ArrayList<Vuelo> vuelos = new ArrayList<>();
        for (Vuelo vuelo : vueloMemLocalDataSource.findAll()) {
            if (vuelo.getAvion().getCodigoAvion() == codigoAvion) {
            vuelos.add(vuelo);
            }
        }
        return vuelos;

    }
}
