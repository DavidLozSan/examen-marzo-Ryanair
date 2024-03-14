package com.iesam.ryanair.features.personas.domain;

public interface PasajeroRepository {
    void save(Pasajero pasajero);
    Pasajero obtain(String dni);
}
