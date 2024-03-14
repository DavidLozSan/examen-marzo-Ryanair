package com.iesam.ryanair.features.aviones.presentation;

import com.iesam.ryanair.features.aviones.data.AvionDataRepository;
import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.GetAvionUseCase;
import com.iesam.ryanair.features.aviones.domain.SaveAvionUseCase;

public class AvionPresentation {
    public static void save(Avion avion) {
        SaveAvionUseCase saveAvionUseCase = new SaveAvionUseCase(new AvionDataRepository());
        saveAvionUseCase.execute(avion);
    }

    public static Avion obtain(String codigoAvion) {
        GetAvionUseCase getAvionUseCase = new GetAvionUseCase(new AvionDataRepository());
        Avion avion = getAvionUseCase.execute(codigoAvion);
        return avion;
    }
}
