package main.java.herencia.domain.models.clase_base;

public abstract class Vehiculo {
    // el modificador de acceso protected permite la visibilidad desde las clases hijas
    // sin importar donde se encuentren
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void detener() {
        System.out.println("El vehiculo está detenido ...");
    }

    public abstract void mostrarDetalles();

}
