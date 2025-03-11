package model;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Titular: " + this.titular);
        System.out.println("---------------------------");
        System.out.println("Saldo atualizado: " + this.saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Titular: " + this.titular);
            System.out.println("---------------------------");
            System.out.println("Saldo atualizado: " + this.saldo);
        } else {
            System.out.println("Titular: " + this.titular);
            System.out.println("---------------------------");
            System.out.println("Não é possível sacar o valor solicitado!");
        }
    }
}
