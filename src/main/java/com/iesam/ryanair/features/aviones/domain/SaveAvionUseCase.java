package com.iesam.ryanair.features.aviones.domain;

public class SaveAvionUseCase {
    public final AvionRepository avionRepository;

    public SaveAvionUseCase(AvionRepository avionRepository) {
        this.avionRepository = avionRepository;
    }

    public void execute(Avion avion) {
        this.avionRepository.save(avion);
    }
}
