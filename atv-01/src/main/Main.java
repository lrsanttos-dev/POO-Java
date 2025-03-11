package main;

import model.Produto;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 4999, 10);

        p1.adicionarEstoque(5);
        System.out.println("\n--------------\n");
        p1.removerEstoque(4);
        System.out.println("\n--------------\n");
        p1.removerEstoque(12);
    }
}
