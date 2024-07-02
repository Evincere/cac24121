package main.java.garage.domain.models.hijos;

import main.java.garage.domain.models.clase_base.Vehiculo;

public class Bicicleta extends Vehiculo {
    private boolean tieneCanasto;

    public Bicicleta(String marca, String modelo, int anio, boolean tieneCanasto) {
        super(marca, modelo, anio);
        this.tieneCanasto = tieneCanasto;
    }

    public void pedalear() {
        System.out.println("La bicicleta está en movimiento ...");
    }

    @Override
    public void mostrarDetalles() {
        this.toString();
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
          "tieneCanasto=" + tieneCanasto +
          ", marca='" + marca + '\'' +
          ", modelo='" + modelo + '\'' +
          ", anio=" + anio +
          '}';
    }
}
