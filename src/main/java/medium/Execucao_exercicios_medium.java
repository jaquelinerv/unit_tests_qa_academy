package medium;

import javax.swing.*;
import java.text.DecimalFormat;

public class Execucao_exercicios_medium {
    public static void main(String[] args) {
        int selecionaExercicio;
        selecionaExercicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o exercício a ser executado: "));

        //exe01
        if (selecionaExercicio == 1){
            Exercicio_01_medium exe01m = new Exercicio_01_medium();
            exe01m.imparOuPar();
        }
        //exe02
        if (selecionaExercicio == 2){
            DecimalFormat df = new DecimalFormat("##,###.##");
            Exercicio_02_medium exe02m = new Exercicio_02_medium();
            double valorInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do investimento: "));
            double valorJuros = exe02m.retornaValorInvestimento(valorInvestimento);
            System.out.println("O Valor investido foi de: " + df.format(valorInvestimento));
            System.out.println("O valor final do investimento  após 10 anos (5% a.a) é: " + df.format(exe02m.retornaValorInvestimento(valorInvestimento)));
            System.out.println("O recebimento de juros foi de: " + df.format (exe02m.calculaValorTotalInvestimento(valorInvestimento, valorJuros)));
        }

        if (selecionaExercicio == 3){
            Exercicio_03_medium ex03_medium = new Exercicio_03_medium();
            ex03_medium.somarNumerosAcumulados();
        }

        //exe06
        if (selecionaExercicio == 6) {
        Exercicio_06_medium ex06_medium = new Exercicio_06_medium();
        int fatorial = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para descobrir o fatorial: "));
        System.out.println(ex06_medium.calculaFatorial(fatorial));
    }
}
}
