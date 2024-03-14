package com.iesam.ryanair.features.personas.domain;

public class SavePasajeroUseCase {
    public final PasajeroRepository pasajeroRepository;

    public SavePasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    public void exexcute(Pasajero pasajero) {
        this.pasajeroRepository.save(pasajero);
    }
}
