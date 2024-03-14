package com.iesam.ryanair.features.personas.presentation;

import com.iesam.ryanair.features.personas.data.PasajeroDataRepository;
import com.iesam.ryanair.features.personas.domain.GetPasajeroUseCase;
import com.iesam.ryanair.features.personas.domain.Pasajero;
import com.iesam.ryanair.features.personas.domain.SavePasajeroUseCase;

public class PasajeroPresentation {
    public static void save(Pasajero pasajero) {
        SavePasajeroUseCase savePasajeroUseCase = new SavePasajeroUseCase(new PasajeroDataRepository());
        savePasajeroUseCase.exexcute(pasajero);
    }

    public static Pasajero obtain(String dni) {
        GetPasajeroUseCase getPasajeroUseCase = new GetPasajeroUseCase(new PasajeroDataRepository());
        Pasajero pasajero = getPasajeroUseCase.execute(dni);
        return pasajero;
    }
}
