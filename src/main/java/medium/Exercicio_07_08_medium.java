package medium;
public class Exercicio_07_08_medium {
    public String[] criaVetorMeses() {

        String vetorMeses[] = new String[12];

        vetorMeses[0] = "Janeiro";
        vetorMeses[1] = "Fevereiro";
        vetorMeses[2] = "Março";
        vetorMeses[3] = "Abril";
        vetorMeses[4] = "Maio";
        vetorMeses[5] = "Junho";
        vetorMeses[6] = "Julho";
        vetorMeses[7] = "Agosto";
        vetorMeses[8] = "Setembro";
        vetorMeses[9] = "Outubro";
        vetorMeses[10] = "Novembro";
        vetorMeses[11] = "Dezembro";

        return vetorMeses;
    }
    public void imprimeValorVetor(String[] vetorMeses){
        int i = 0;
        while (i < 12 ){
            System.out.println("O mes : " + (i+1) + " - " + vetorMeses[i]);
            i++;
        }

    }
}

/*Exercício 7 - Faça um algoritmo para ler todos os meses do ano, armazene em um vetor.
Exercício 8 - Faça um algoritmo para exibir todos os meses digitados anteriormente*/
