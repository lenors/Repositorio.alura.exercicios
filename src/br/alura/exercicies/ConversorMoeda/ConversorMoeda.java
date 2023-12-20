package br.alura.exercicies.ConversorMoeda;
import java.text.DecimalFormat;
public class ConversorMoeda implements ConversaoFinanceira {


  @Override
    public void converterDolarParaReal(double dolar) {
       double real = 4.87;
       double conversorDolarReal = dolar * real;

        System.out.println("A conversão é: " + dolar + "dolar para real é de: " + new DecimalFormat("0.##").format(conversorDolarReal));

    }
}
