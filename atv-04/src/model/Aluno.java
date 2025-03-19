package model;

public class Aluno {
    private double notaFinal;

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void verificarAprovacao() {
        if (notaFinal >= 6) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }
    }
}
