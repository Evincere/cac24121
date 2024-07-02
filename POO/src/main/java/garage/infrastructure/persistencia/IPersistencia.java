package garage.infrastructure.persistencia;

import garage.domain.models.clase_base.Vehiculo;
import java.util.ArrayList;

public interface IPersistencia {

    void guardarVehiculos(ArrayList<Vehiculo> vehiculos);
    ArrayList<Vehiculo> traerRegistrosVehiculos();
}
