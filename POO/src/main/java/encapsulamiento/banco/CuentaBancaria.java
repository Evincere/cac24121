package main.java.encapsulamiento.banco;

public class CuentaBancaria {
    // toda clase puede tener propiedades y metodos
    private double saldo;
    private String titular;

    // si no hay un constructor definido, siempre hay un constructor vacio o por defecto
    // public CuentaBancaria(){}

    // constructor parametrizado
    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.confirmarApertura(titular);
    }

    public CuentaBancaria(String titular) {
        this(25000.00, titular);
        this.confirmarApertura(titular);
    }


    public void depositar(double cantidad) {
        if(cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ha depositado $ " + cantidad + " el nuevo saldo es: $ " + this.getSaldo());
        }else{
            System.out.println("La cantidad a depositar deber ser mayor a cero");
        }
    }

    public void retirar(double cantidad) {
        if(cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se ha retirado $ " + cantidad + " el nuevo saldo es: $ " + this.getSaldo());
        }else{
            System.out.println("La cantidad a retirar deber ser mayor a cero");
        }
    }

    private void confirmarApertura(String titular) {
        System.out.println("Se ha creado exitosamente la cuenta a nombre de: " + titular);
    }

    // getters y setters
    // publicos para complementar el encapsulamiento exponiendo de una manera controlada los atributos
    // getter
    public String getTitular() {
        return titular;
    }

    // setter
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // pero tambien podria crear "getter" y "setter" privados
    // getter
    private double getSaldo() {
        return this.saldo;
    }

    // setter
    private void setSaldo(double saldo) {
        if(saldo < 0) {
            return;
        }
        this.saldo += saldo;
    }


}
