package main.java.herencia;

import main.java.herencia.hijos.Coche;
import main.java.herencia.hijos.Moto;

public class Main {

    public static void main(String[] args) {

        Moto motoUno = new Moto("Honda", "XR", 2020, true);
        Coche cocheUno = new Coche("BMW", "CF", 2022, 2);

        motoUno.mostrarDetalles();
        System.out.println(motoUno); // println llama de manera implicita al metodo toString()

        System.out.println(cocheUno.toString());
        cocheUno.tocarBocina();
        // cocheUno.marca; //no puede acceder porque main no es hija ni tampoco se encuentra en el mismo paquete
    }
}
