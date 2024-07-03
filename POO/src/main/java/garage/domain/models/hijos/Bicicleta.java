package garage.domain.models.hijos;


import com.fasterxml.jackson.annotation.JsonProperty;
import garage.domain.models.clase_base.Vehiculo;

public class Bicicleta extends Vehiculo {

    @JsonProperty("type")
    private String type = "bicicleta";
    private boolean tieneCanasto;


    public Bicicleta() {}
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTieneCanasto() {
        return tieneCanasto;
    }

    public void setTieneCanasto(boolean tieneCanasto) {
        this.tieneCanasto = tieneCanasto;
    }
}
