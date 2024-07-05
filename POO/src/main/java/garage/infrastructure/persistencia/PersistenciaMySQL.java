package garage.infrastructure.persistencia;

import garage.domain.models.clase_base.Vehiculo;
import garage.domain.models.hijos.Bicicleta;
import garage.domain.models.hijos.Coche;
import garage.domain.models.hijos.Moto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersistenciaMySQL implements IPersistencia {

    private Connection conexion = DatabaseConnection.getConnection();


    @Override
    public void guardarVehiculos(ArrayList<Vehiculo> vehiculos) {
        // PRIMER PASO OBTENER CONEXION
        String insertSQL = "INSERT INTO vehiculos (marca, modelo, anio, tipo) VALUES (?,?,?,?)";
        try {
            // PASO DOS PREPARAR LA QUERY
            PreparedStatement preparador = conexion.prepareStatement(insertSQL);

            for (Vehiculo vehiculo: vehiculos) {
                preparador.setString(1, vehiculo.getMarca());
                preparador.setString(2, vehiculo.getModelo());
                preparador.setInt(3, vehiculo.getAnio());
                preparador.setString(4, vehiculo.getClass().getSimpleName().toLowerCase());
                preparador.addBatch();
            }

            // EJECUTAR LA QUERY
            preparador.executeBatch();
            System.out.println("VEHICULOS GUARDADOS EN BASE DE DATOS ...");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Vehiculo> traerRegistrosVehiculos() {
        String selectSQL = "SELECT * FROM vehiculos";
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        try {
            PreparedStatement preparador = conexion.prepareStatement(selectSQL);
            ResultSet tablaSet = preparador.executeQuery();

            while (tablaSet.next()) {
                String marca = tablaSet.getString("marca");
                String modelo = tablaSet.getString("modelo");
                int anio = tablaSet.getInt("anio");
                String tipo = tablaSet.getString("tipo");

                Vehiculo vehiculo;
                switch (tipo){
                    case "coche":
                        vehiculo = new Coche();
                        vehiculo.setMarca(marca);
                        vehiculo.setModelo(modelo);
                        vehiculo.setAnio(anio);
                        vehiculos.add(vehiculo);
                        break;
                    case "bicicleta":
                        vehiculo = new Bicicleta();
                        vehiculo.setMarca(marca);
                        vehiculo.setModelo(modelo);
                        vehiculo.setAnio(anio);
                        vehiculos.add(vehiculo);
                        break;
                    case "moto":
                        vehiculo = new Moto();
                        vehiculo.setMarca(marca);
                        vehiculo.setModelo(modelo);
                        vehiculo.setAnio(anio);
                        vehiculos.add(vehiculo);
                        break;
                }


            }
            return vehiculos;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void actualizarModelo(String modeloNuevo, int anio) {
        String upadteSQL = "UPDATE vehiculos SET modelo = ? WHERE anio = ?";

        try {
            PreparedStatement preparador = conexion.prepareStatement(upadteSQL);
            preparador.setString(1, modeloNuevo);
            preparador.setInt(2, anio);
            int filasAfectadas = preparador.executeUpdate();
            String ANSI_GREEN = "\u001B[32m";
            System.out.printf(ANSI_GREEN + "Se han actualizado %d registros", filasAfectadas);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void borrarVehiculo(int id) {
        String deleteSQL = "DELETE FROM vehiculos WHERE id = ?";

        try {
            PreparedStatement preparador = conexion.prepareStatement(deleteSQL);
            preparador.setInt(1, id);
            preparador.executeUpdate();

            System.out.println("Se ha borrado al vehiculo con id " + id);


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
