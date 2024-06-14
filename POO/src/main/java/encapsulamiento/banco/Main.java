package main.java.encapsulamiento.banco;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuentaA = new CuentaBancaria(2500.00, "Semper Evincere");
//        System.out.println("El saldo inicial es: " + cuentaA.getSaldo());
//        cuentaA.setSaldo(-2500.00);
//        System.out.println("El saldo despues es: " + cuentaA.getSaldo());
        cuentaA.depositar(7500.00);
        cuentaA.retirar(6000);
        System.out.println(cuentaA.getTitular());
        cuentaA.retirar(10000);
    }
}
