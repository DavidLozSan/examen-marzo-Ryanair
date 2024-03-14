package com.iesam.ryanair.features.vuelos.presentation;

import com.iesam.ryanair.features.vuelos.data.VueloDataRepository;
import com.iesam.ryanair.features.vuelos.domain.GetAvionInVueloUseCase;
import com.iesam.ryanair.features.vuelos.domain.SaveVueloUseCase;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;

public class VueloPresentation {
    public static void save(Vuelo vuelo) {
        SaveVueloUseCase saveVueloUseCase = new SaveVueloUseCase(new VueloDataRepository());
        saveVueloUseCase.execute(vuelo);
    }

    public static void obtain(String codigoAvion) {
        GetAvionInVueloUseCase getAvionInVueloUseCase = new GetAvionInVueloUseCase(new VueloDataRepository());
        if (getAvionInVueloUseCase.execute().size() == 0) {
            System.out.println("El avion esta disponible");
        } else {
            System.out.println("El avion esta ocupado");
        }
    }
}
