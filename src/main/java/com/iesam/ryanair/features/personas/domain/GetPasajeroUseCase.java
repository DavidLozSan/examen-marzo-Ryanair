package com.iesam.ryanair.features.personas.domain;

public class GetPasajeroUseCase {
    public final PasajeroRepository pasajeroRepository;

    public GetPasajeroUseCase(PasajeroRepository pasajeroRepository) {
        this.pasajeroRepository = pasajeroRepository;
    }

    public Pasajero execute(String dni) {
        return pasajeroRepository.obtain(dni);
    }
}
