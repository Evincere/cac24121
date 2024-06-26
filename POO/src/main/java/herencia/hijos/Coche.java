package main.java.herencia.hijos;

import main.java.herencia.clase_base.Vehiculo;

public final class Coche extends Vehiculo implements Arrancable {
    int nroDePuertas;

    public Coche(String marca, String modelo, int anio, int nroDePuertas) {
        super(marca, modelo, anio);
        this.nroDePuertas = nroDePuertas;
    }

    public void tocarBocina() {
        // al estar el atributo marca con "protected" en la clase base
        // permite a los hijos acceder a esos atributos
        System.out.println("El coche " + marca + " toca la bocina ... ");
    }

    @Override
    public void mostrarDetalles() {
        this.toString();
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        System.out.println("Cantidad de puertas: " + this.nroDePuertas);
        return "";
    }

    @Override
    public void arrancar() {
        System.out.println("El vehiculo arranca activando el motor ...");
    }
}
