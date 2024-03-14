package com.iesam.ryanair.features.personas.domain;

public class Persona {
    public final String dni;
    public final String nombre;
    public final String apellidos;
    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }
}
