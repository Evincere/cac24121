package garage.infrastructure.persistencia;

import garage.domain.models.clase_base.Vehiculo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersistenciaArchivo implements IPersistencia {

    private static final String RUTA_AL_ARCHIVO = "src/main/resources/data/vehiculo.txt";


    @Override
    public void guardarVehiculos(ArrayList<Vehiculo> vehiculos) {

        try { // try catch with resources
            FileWriter writer = new FileWriter(RUTA_AL_ARCHIVO);

            for(Vehiculo vehiculo: vehiculos) {
                writer.write(String.valueOf(vehiculo));
                writer.write("\n");
            }
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
}
