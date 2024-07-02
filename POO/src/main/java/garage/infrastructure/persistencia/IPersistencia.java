package main.java.garage.infrastructure.persistencia;

import java.util.ArrayList;
import main.java.garage.domain.models.clase_base.Vehiculo;

public interface IPersistencia {

    void guardarVehiculos(ArrayList<Vehiculo> vehiculos);
    ArrayList<Vehiculo> traerRegistrosVehiculos();
}
