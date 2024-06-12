package main.java.modificadores.paqueteUno;

// como modificador de acceso puede ser public o default
public class ClaseEnPaqueteUno {

    // atributos
    private double saldoEnCuentaBancaria = 25.566;
    private String nombre = "Semper";

    // metodos
    // la firma de los metodos tienen:
    // modificador de acceso + tipo de retorno + nombre del metodo (firma del metodo)
    public void metodoPublico(String cadena) {
        System.out.println(
            "se invoca el metodo publico y se paso el valor: " + convierteAMayuscula(cadena));
    }

    private String convierteAMayuscula(String cadena) {
        return cadena.toUpperCase();
    }
    // getter y setter

    public double getSaldoEnCuentaBancaria() {
        return saldoEnCuentaBancaria;
    }

    public void setSaldoEnCuentaBancaria(double saldoEnCuentaBancaria) {
        this.saldoEnCuentaBancaria = saldoEnCuentaBancaria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
