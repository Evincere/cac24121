package main.java.garage.services;

import java.util.ArrayList;
import main.java.garage.domain.models.clase_base.Vehiculo;
import main.java.garage.infrastructure.persistencia.IPersistencia;
import main.java.garage.infrastructure.persistencia.PersistenciaArchivo;

public class RegistroAutomotorService implements IPersistencia {

    private IPersistencia sistemaDePersistencia = new PersistenciaArchivo();

    @Override
    public void guardarVehiculos(ArrayList<Vehiculo> vehiculos) {
        sistemaDePersistencia.guardarVehiculos(vehiculos);
    }

    @Override
    public ArrayList<Vehiculo> traerRegistrosVehiculos() {
        return null;
    }
}
