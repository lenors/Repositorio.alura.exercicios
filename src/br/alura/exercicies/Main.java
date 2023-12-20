package br.alura.exercicies;

import br.alura.exercicies.CalcularLivro.Calculavel;
import br.alura.exercicies.CalcularLivro.Livro;
import br.alura.exercicies.CalcularLivro.ProdutoFisico;

public class Main {
    public static void main(String[] args) {
        Calculavel livro = new Livro(50.0, 0.1);
        Calculavel produtoFisico = new ProdutoFisico(30.0, 0.2);

        System.out.println("O preço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("O preço final do Produto Fisico: " + produtoFisico.calcularPrecoFinal());
    }
}
