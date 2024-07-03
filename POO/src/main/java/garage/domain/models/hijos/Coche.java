package garage.domain.models.hijos;


import com.fasterxml.jackson.annotation.JsonProperty;
import garage.domain.models.clase_base.Vehiculo;

public final class Coche extends Vehiculo implements Arrancable {
    @JsonProperty("type")
    private String type = "coche";
    int nroDePuertas;

    public Coche() {}
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
        return "Coche{" +
          "nroDePuertas=" + nroDePuertas +
          ", marca='" + marca + '\'' +
          ", modelo='" + modelo + '\'' +
          ", anio=" + anio +
          '}';
    }

    @Override
    public void arrancar() {
        System.out.println("El vehiculo arranca activando el motor ...");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNroDePuertas() {
        return nroDePuertas;
    }

    public void setNroDePuertas(int nroDePuertas) {
        this.nroDePuertas = nroDePuertas;
    }
}
