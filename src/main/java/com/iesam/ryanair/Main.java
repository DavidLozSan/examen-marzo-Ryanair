package com.iesam.ryanair;

import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.presentation.AvionPresentation;
import com.iesam.ryanair.features.personas.domain.Pasajero;
import com.iesam.ryanair.features.personas.domain.Tripulante;
import com.iesam.ryanair.features.personas.presentation.PasajeroPresentation;
import com.iesam.ryanair.features.personas.presentation.TripulantePresentation;
import com.iesam.ryanair.features.vuelos.domain.Vuelo;
import com.iesam.ryanair.features.vuelos.presentation.VueloPresentation;

public class Main {
    public static void main(String[] args) {
        TripulantePresentation.save(new Tripulante("700001", "Empleado1", "EmpleadoApellido1", "Piloto"));
        TripulantePresentation.save(new Tripulante("700002", "Empleado2", "EmpleadoApellido2", "Piloto"));
        TripulantePresentation.save(new Tripulante("700003", "Empleado3", "EmpleadoApellido3", "Azafata"));

        PasajeroPresentation.save(new Pasajero("800001", "Pasajero1", "PasajeroApellido1", "Avila Provincia"));
        PasajeroPresentation.save(new Pasajero("800002", "Pasajero2", "PasajeroApellido2", "Avila Provincia"));

        AvionPresentation.save(new Avion("100001", "Pajarito", "Boing701", "200"));
        AvionPresentation.save(new Avion("100002", "Nube", "Boing705", "250"));
        AvionPresentation.save(new Avion("100003", "Rayo", "Boing710", "100"));

        // VueloPresentation.save(new Vuelo("1",""));
    }
}