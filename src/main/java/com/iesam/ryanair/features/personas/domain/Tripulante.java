package com.iesam.ryanair.features.personas.domain;

public class Tripulante extends Persona {
    public final String cargo;

    public Tripulante(String dni, String nombre, String apellidos, String cargo) {
        super(dni,nombre,apellidos);
        this.cargo = cargo;
    }
}
