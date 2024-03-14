package com.iesam.ryanair.features.personas.domain;

public class Pasajero extends Persona {
    public final String localidad;

    public Pasajero(String dni, String nombre, String apellidos, String localidad) {
        super(dni, nombre, apellidos);
        this.localidad = localidad;
    }
}
