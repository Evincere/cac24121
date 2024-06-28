package main.java.herencia.infrastructure.persistencia;

import java.util.ArrayList;
import main.java.herencia.domain.models.clase_base.Vehiculo;

public class PersistenciaMySQL implements IPersistencia {

    @Override
    public void guardarVehiculos(ArrayList<Vehiculo> vehiculos) {
        System.out.println("Guardando en una base de datos MySQL ...");
    }

    @Override
    public ArrayList<Vehiculo> traerRegistrosVehiculos() {
        return null;
    }
}
