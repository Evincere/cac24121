package main.java.herencia;

import java.util.ArrayList;
import java.util.Random;
import main.java.herencia.domain.models.RegistroAutomotor;
import main.java.herencia.domain.models.clase_base.Vehiculo;
import main.java.herencia.domain.models.hijos.Bicicleta;
import main.java.herencia.domain.models.hijos.Coche;
import main.java.herencia.domain.models.hijos.Moto;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Random random = new Random();

        String[] marcas = {"Toyota", "Honda", "Yamaha", "Harley-Davidson", "Giant", "Kawasaki", "BMW", "Mercedes-Benz", "Nissan", "Suzuki"};
        String[] modelos = {"Corolla", "Civic", "YZF-R1", "Street 750", "Talon", "Z250", "X5", "GLC", "Sentra", "GSX-R1000", "CBR600RR", "CR-V", "Altima", "Versa", "Titanium", "Outlander", "RAV4", "Camry", "Accord", "Fortuner"};
        int[] anos = {2010, 2015, 2020, 2018, 2013, 2019, 2016, 2017, 2014, 2021};
        boolean[] tieneCanasto = {true, false, true, false, true, false, true, false, true, false};
        boolean[] tieneSideCar = {false, false, false, true, false, false, false, false, false, true};

        for (int i = 0; i < 10; i++) {
            String marca = marcas[random.nextInt(marcas.length)];
            String modelo = modelos[random.nextInt(modelos.length)];
            int anio = anos[random.nextInt(anos.length)];
            if (true) { // Decide si es Coche o Bicicleta/Moto
                int nroDePuertas = random.nextInt(5) + 2; // Entre 2 y 6 puertas
                if (nroDePuertas >= 4) { // Si es Coche
                    vehiculos.add(new Coche(marca, modelo, anio, nroDePuertas));
                } else { // Si es Bicicleta o Moto
                    boolean tieneExtra = random.nextBoolean();
                    if (tieneExtra) {
                        vehiculos.add(new Bicicleta(marca, modelo, anio, tieneCanasto[i]));
                    } else {
                        vehiculos.add(new Moto(marca, modelo, anio, tieneSideCar[i]));
                    }
                }
            }
        }

        // Imprimir todos los vehículos generados
//        for (Vehiculo vehiculo : vehiculos) {
//            System.out.println(vehiculo.toString());
//        }

        RegistroAutomotor registroAutomotor = new RegistroAutomotor();
        registroAutomotor.guardarVehiculos(vehiculos);

        // Jackson

    }
}
