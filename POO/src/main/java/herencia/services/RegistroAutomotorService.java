package main.java.herencia.services;

import java.util.ArrayList;
import main.java.herencia.domain.models.clase_base.Vehiculo;
import main.java.herencia.infrastructure.persistencia.IPersistencia;
import main.java.herencia.infrastructure.persistencia.PersistenciaArchivo;
import main.java.herencia.infrastructure.persistencia.PersistenciaMySQL;

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
