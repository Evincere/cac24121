package main.java.herencia.hijos;

import main.java.herencia.clase_base.Vehiculo;

public class Moto extends Vehiculo {
    boolean tieneSideCar;

    public Moto(String marca, String modelo, int anio, boolean tieneSideCar) {
        super(marca, modelo, anio);
        this.tieneSideCar = tieneSideCar;
    }

    public void hacerCaballito() {
        System.out.println("La moto está haciendo wheeling ...");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + this.tieneSideCar);
    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        System.out.println("Sidecar " + this.tieneSideCar);
        return "";
    }
}
