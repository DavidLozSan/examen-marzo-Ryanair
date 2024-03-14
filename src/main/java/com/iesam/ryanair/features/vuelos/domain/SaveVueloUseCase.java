package com.iesam.ryanair.features.vuelos.domain;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.personas.domain.Pasajero;
import com.iesam.ryanair.features.personas.domain.Tripulante;

import java.util.ArrayList;

public class SaveVueloUseCase {
    public final VueloRepository vueloRepository;

    public SaveVueloUseCase(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }
// ArrayList<Pasajero> pasajeros, ArrayList<Tripulante> tripulantes, Avion avion
    public void execute(Vuelo vuelo) {
        //Vuelo vuelo = new Vuelo("1",avion,tripulantes,pasajeros,"","","","","")
        this.vueloRepository.save(vuelo);
    }
}
