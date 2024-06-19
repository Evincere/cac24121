package main.java.herencia.clase_base;

public class Vehiculo {
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

    public void arrancar() {
        System.out.println("El vehiculo está arrancando ...");
    }

    public void detener() {
        System.out.println("El vehiculo está detenido ...");
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año:" + anio);
    }

    @Override // con esta anotacion indicamos que estamos sobreescribiendo un metodo heredado
    public String toString() {
        return "Vehiculo {" +
            "marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", anio=" + anio +
            '}';
    }
}
