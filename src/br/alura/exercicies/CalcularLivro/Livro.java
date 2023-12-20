package br.alura.exercicies.CalcularLivro;

public class Livro implements Calculavel {
private double precoBase;
private double desconto;
public Livro(double precoBase, double desconto){
    this.precoBase = precoBase;
    this.desconto = desconto;
}

    @Override
    public double calcularPrecoFinal() {
        return  precoBase * (1 - desconto);
    }
}
