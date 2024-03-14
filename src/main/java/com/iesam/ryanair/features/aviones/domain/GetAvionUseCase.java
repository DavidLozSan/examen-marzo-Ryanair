package com.iesam.ryanair.features.aviones.domain;

public class GetAvionUseCase {
    public final AvionRepository avionRepository;

    public GetAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }
    public Avion execute(String codigoAvion) {
        return avionRepository.obtain(codigoAvion);
    }
}
