package com.iesam.ryanair.features.personas.domain;

public interface TripulanteRepository {
    void save(Tripulante tripulante);
    Tripulante obtain(String dni);
}
