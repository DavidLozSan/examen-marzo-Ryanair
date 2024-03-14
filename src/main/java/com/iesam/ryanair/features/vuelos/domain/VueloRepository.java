package com.iesam.ryanair.features.vuelos.domain;

import java.util.ArrayList;

public interface VueloRepository {
    void save(Vuelo vuelo);
    ArrayList<Vuelo> obtain(String codigoAvion);
}
