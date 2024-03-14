package com.iesam.ryanair.features.aviones.domain;

public class Avion {
    public final String codigoAvion;
    public final String nombre;
    public final String modelo;
    public final String asientos;

    public Avion(String codigoAvion, String nombre, String modelo, String asientos) {
        this.codigoAvion = codigoAvion;
        this.nombre = nombre;
        this.modelo = modelo;
        this.asientos = asientos;
    }

    public String getCodigoAvion() {
        return codigoAvion;
    }
}
