package main.java.garage.domain.models;

import java.util.ArrayList;
import main.java.garage.domain.models.clase_base.Vehiculo;
import main.java.garage.services.RegistroAutomotorService;

public class RegistroAutomotor {

    private RegistroAutomotorService service = new RegistroAutomotorService();

    public void guardarVehiculos(ArrayList<Vehiculo> vehiculos) {
        service.guardarVehiculos(vehiculos);
    }

    public ArrayList<Vehiculo> traerRegistrosVehiculos() {
        return new ArrayList<>();
    }
}
