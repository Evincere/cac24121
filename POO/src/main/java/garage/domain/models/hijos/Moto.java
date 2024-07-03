package garage.domain.models.hijos;

import com.fasterxml.jackson.annotation.JsonProperty;
import garage.domain.models.clase_base.Vehiculo;

public class Moto extends Vehiculo implements Arrancable {
    @JsonProperty("type")
    private String type = "moto";
    boolean tieneSideCar;

    public Moto() {}
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTieneSideCar() {
        return tieneSideCar;
    }

    public void setTieneSideCar(boolean tieneSideCar) {
        this.tieneSideCar = tieneSideCar;
    }
}
