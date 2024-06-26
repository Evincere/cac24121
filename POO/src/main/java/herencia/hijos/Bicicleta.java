package main.java.herencia.hijos;

import main.java.herencia.clase_base.Vehiculo;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    public void pedalear() {
        System.out.println("La bicicleta está en movimiento ...");
    }

    @Override
    public void mostrarDetalles() {

    }
}
