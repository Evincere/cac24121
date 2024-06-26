package main.java.herencia.hijos;

import main.java.herencia.clase_base.Vehiculo;

public class Moto extends Vehiculo implements Arrancable {
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
        this.toString();
    }
    @Override
    public String toString() {
        System.out.println(super.toString());
        System.out.println("Sidecar " + this.tieneSideCar);
        return "";
    }

    @Override
    public void arrancar() {
        System.out.println("La moto arranca dandole patadas ...");
    }
}
