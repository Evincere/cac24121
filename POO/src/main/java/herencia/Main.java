package main.java.herencia;

import java.util.ArrayList;
import main.java.herencia.clase_base.Vehiculo;
import main.java.herencia.hijos.Arrancable;
import main.java.herencia.hijos.Coche;
import main.java.herencia.hijos.Moto;

public class Main {

    public static void main(String[] args) {

        Moto motoUno = new Moto("Honda", "XR", 2020, true);
        Coche cocheUno = new Coche("BMW", "CF", 2022, 2);

        motoUno.mostrarDetalles();
        motoUno.hacerCaballito();
        // System.out.println(motoUno); // println llama de manera implicita al metodo toString()


        cocheUno.tocarBocina();
        cocheUno.mostrarDetalles();
        // cocheUno.marca; //no puede acceder porque main no es hija ni tampoco se encuentra en el mismo paquete

        Vehiculo motoDos = new Moto("marca", "XX", 2010, true);
        Vehiculo cocheDos = new Coche("marca", "XX", 2010, 2);

        motoDos.mostrarDetalles();
        if(motoDos instanceof Moto) {
            ((Moto) motoDos).hacerCaballito();
        }

        // String[] arrayString = new String[3];

        // arrayString[0]= "45";

        ArrayList<Coche> coleccionDeAutos = new ArrayList<>();
        coleccionDeAutos.add(cocheUno);
        ArrayList<Moto> coleccionDeMotos = new ArrayList<>();
        coleccionDeMotos.add(motoUno);
        coleccionDeMotos.add(motoUno);
        // cocheDos.mostrarDetalles();

        ArrayList<Vehiculo> coleccionDeVehiculos = new ArrayList<>();
        coleccionDeVehiculos.add(motoUno);
        coleccionDeVehiculos.add(motoDos);
        coleccionDeVehiculos.add(cocheUno);
        coleccionDeVehiculos.add(cocheDos);

        System.out.println("Hay un total de " + coleccionDeVehiculos.size() + " vehiculos guardados");

        for(Vehiculo vehiculo : coleccionDeVehiculos){
            vehiculo.mostrarDetalles();
            if(vehiculo instanceof Arrancable) {
                ((Arrancable) vehiculo).arrancar();
            }

        }



        // Vehiculo cocheTres = new Vehiculo();








    }
}
