package com.iesam.ryanair.features.vuelos.presentation;

import com.iesam.ryanair.features.vuelos.data.VueloDataRepository;
import com.iesam.ryanair.features.vuelos.domain.SaveVueloUseCase;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;

public class VueloPresentation {
    public static void save(Vuelo vuelo) {
        SaveVueloUseCase saveVueloUseCase = new SaveVueloUseCase(new VueloDataRepository());
        saveVueloUseCase.execute(vuelo);
    }
}
