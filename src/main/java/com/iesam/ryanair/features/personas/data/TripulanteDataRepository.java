package com.iesam.ryanair.features.personas.data;

import com.iesam.ryanair.features.personas.data.local.TripulanteMemLocalDataSource;
import com.iesam.ryanair.features.personas.domain.Tripulante;
import com.iesam.ryanair.features.personas.domain.TripulanteRepository;

public class TripulanteDataRepository implements TripulanteRepository {
    private TripulanteMemLocalDataSource tripulanteMemLocalDataSource;

    public TripulanteDataRepository() {
        this.tripulanteMemLocalDataSource = tripulanteMemLocalDataSource.newInstance();
    }

    @Override
    public void save(Tripulante tripulante) {
        tripulanteMemLocalDataSource.save(tripulante);
    }

    @Override
    public Tripulante obtain(String dni) {
        return tripulanteMemLocalDataSource.findById(dni);
    }
}
