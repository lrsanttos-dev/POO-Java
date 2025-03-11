package main;

import model.ContaBancaria;

public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("João", 0.00);

        c1.depositar(1000);
        System.out.println("\n###########################\n");
        c1.sacar(500);
        System.out.println();
        System.out.println("\n###########################\n");
        c1.sacar(600);
    }
}
