package com.iesam.ryanair.features.vuelos.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;

import java.util.ArrayList;

public class GetAvionInVueloUseCase {
    public final VueloRepository vueloRepository;

    public GetAvionInVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    public ArrayList<Vuelo> execute(String codigoAvion) {
        return vueloRepository.obtain(codigoAvion);
    }
}
