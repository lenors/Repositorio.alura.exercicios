package br.alura.exercicies.CalcularLivro;

public class ProdutoFisico implements Calculavel {
    private double precoBase;
    private double taxaAdcional;

    public ProdutoFisico(double precoBase, double taxaAdcional){
        this.precoBase = precoBase;
        this.taxaAdcional = taxaAdcional;
    }
    public double calcularPrecoFinal(){
        return precoBase * (1 + taxaAdcional);
    }
}
