package com.iesam.ryanair.features.aviones.data;

import com.iesam.ryanair.features.aviones.data.local.AvionMemLocalDataSource;
import com.iesam.ryanair.features.aviones.domain.Avion;
import com.iesam.ryanair.features.aviones.domain.AvionRepository;

public class AvionDataRepository implements AvionRepository {
    private AvionMemLocalDataSource avionMemLocalDataSource;

    public AvionDataRepository() {
        this.avionMemLocalDataSource = avionMemLocalDataSource.newInstance();
    }

    @Override
    public void save(Avion avion) {
        avionMemLocalDataSource.save(avion);
    }

    @Override
    public Avion obtain(String codigoAvion) {
        return avionMemLocalDataSource.findById(codigoAvion);
    }
}
