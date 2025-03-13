package main;

import model.Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("O resultado da soma com 2 valores é: " + calc.somar(10, 20));
        System.out.println("O resultado da soma com 3 valores é: " + calc.somar(10, 20, 30));
    }
}
