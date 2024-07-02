package garage.services;

import garage.domain.models.clase_base.Vehiculo;
import garage.infrastructure.persistencia.IPersistencia;
import garage.infrastructure.persistencia.PersistenciaArchivo;
import java.util.ArrayList;

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
