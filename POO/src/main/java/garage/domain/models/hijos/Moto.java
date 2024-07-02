package main.java.garage.domain.models.hijos;

import main.java.garage.domain.models.clase_base.Vehiculo;

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
        return "Moto{" +
          "tieneSideCar=" + tieneSideCar +
          ", marca='" + marca + '\'' +
          ", modelo='" + modelo + '\'' +
          ", anio=" + anio +
          '}';
    }

    @Override
    public void arrancar() {
        System.out.println("La moto arranca dandole patadas ...");
    }
}
