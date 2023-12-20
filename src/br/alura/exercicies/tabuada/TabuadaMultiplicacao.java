package br.alura.exercicies.tabuada;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int t) {
        for (int i = 0; i <= 50 ; i++) {
            int res = i * t;
            System.out.println(t + " x " + i + " = " + res);
        }
    }
}
