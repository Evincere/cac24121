package main.java.modificadores;


import main.java.modificadores.paqueteUno.ClaseEnPaqueteUno;

public class Main {

    public static void main(String[] args) {

        ClaseEnPaqueteUno objeto = new ClaseEnPaqueteUno();
        objeto.metodoPublico("Hola Comision 24121");
        objeto.getSaldoEnCuentaBancaria();
        objeto.setSaldoEnCuentaBancaria(25895.25);

    }
}
