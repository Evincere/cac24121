package garage.infrastructure.persistencia;

import com.fasterxml.jackson.databind.ObjectMapper;
import garage.domain.models.clase_base.Vehiculo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersistenciaArchivo implements IPersistencia {

    private static final String RUTA_AL_ARCHIVO = "data/vehiculo.json";
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public void guardarVehiculos(ArrayList<Vehiculo> vehiculos) {

        try { // try catch with resources
            FileWriter writer = new FileWriter(RUTA_AL_ARCHIVO);
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(vehiculos);

            writer.write(json);
            System.out.println("Los vehiculos se ha guardado en un archivo ...");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error al guardar los vehiculos: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Vehiculo> traerRegistrosVehiculos() {
        return null;
    }

    @Override
    public void actualizarModelo(String modeloNuevo, int anio) {

    }

    @Override
    public void borrarVehiculo(int id) {

    }
}
