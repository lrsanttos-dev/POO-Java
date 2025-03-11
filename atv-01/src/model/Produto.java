package model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            quantidadeEmEstoque++;
        }
        System.out.println("Produto: " + this.nome);
        System.out.println("## Estoque atualizado ##");
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Produto: " + this.nome);
            System.out.println("## Estoque atualizado ##");
            System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
        } else {
            System.out.println("Produto: " + this.nome);
            System.out.println("## Erro ##");
            System.out.println("Não há estoque suficiente!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
}
