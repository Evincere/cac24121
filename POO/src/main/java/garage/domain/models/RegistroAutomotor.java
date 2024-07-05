package garage.domain.models;

import garage.domain.models.clase_base.Vehiculo;
import garage.services.RegistroAutomotorService;
import java.util.ArrayList;

public class RegistroAutomotor {

    private RegistroAutomotorService service = new RegistroAutomotorService();

    public void guardarVehiculos(ArrayList<Vehiculo> vehiculos) {
        service.guardarVehiculos(vehiculos);
    }

    public ArrayList<Vehiculo> traerRegistrosVehiculos() {
        return service.traerRegistrosVehiculos();
    }

    public void actualizarModelo(String modelo, int anio) {
        service.actualizarModelo(modelo, anio);
    }

    public void borrarVehiculo(int id) {
        service.borrarVehiculo(id);
    }
}
