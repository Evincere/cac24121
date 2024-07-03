package garage.domain.models.clase_base;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import garage.domain.models.hijos.Bicicleta;
import garage.domain.models.hijos.Coche;
import garage.domain.models.hijos.Moto;

@JsonTypeInfo(
  use = Id.NAME,
  property = "type"
)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Coche.class, name = "coche"),
  @JsonSubTypes.Type(value = Bicicleta.class, name = "bicicleta"),
  @JsonSubTypes.Type(value = Moto.class, name = "moto")
})
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo() {}
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
