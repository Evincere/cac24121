package main.java.herencia.infrastructure.persistencia;

import java.util.ArrayList;
import main.java.herencia.domain.models.clase_base.Vehiculo;

public interface IPersistencia {

    void guardarVehiculos(ArrayList<Vehiculo> vehiculos);
    ArrayList<Vehiculo> traerRegistrosVehiculos();
}
