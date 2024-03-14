package com.iesam.ryanair.features.aviones.domain;

public interface AvionRepository {
    void save(Avion avion);
    Avion obtain(String codigoAvion);
}
