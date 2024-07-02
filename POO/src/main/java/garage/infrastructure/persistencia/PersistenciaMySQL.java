package garage.infrastructure.persistencia;

import garage.domain.models.clase_base.Vehiculo;
import java.util.ArrayList;

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
