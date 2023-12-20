package br.alura.exercicies.CalculadoraRetangular;

public class CalculadoraSalaRetangula implements CalculoGeometrico{
int base = 0;
    @Override
    public void calcularArea(int b, int h) {
        base = b;
        System.out.println("O calculo da area é: " + b * h + " m²");
    }

    @Override
    public void calcularPerimetro(int b) {
        base = b;
        System.out.println("A soma dos lados é: " + b * 4);
    }
}
