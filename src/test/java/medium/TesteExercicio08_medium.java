package medium;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio08_medium {

    static Exercicio_07_08_medium exe08medium;
    static String[] vetorMesesEsperados;

    @BeforeClass
    public static void beforeClass(){
        exe08medium = new Exercicio_07_08_medium();
        vetorMesesEsperados = new String[12];

        vetorMesesEsperados[0] = "Janeiro";
        vetorMesesEsperados[1] = "Fevereiro";
        vetorMesesEsperados[2] = "Março";
        vetorMesesEsperados[3] = "Abril";
        vetorMesesEsperados[4] = "Maio";
        vetorMesesEsperados[5] = "Junho";
        vetorMesesEsperados[6] = "Julho";
        vetorMesesEsperados[7] = "Agosto";
        vetorMesesEsperados[8] = "Setembro";
        vetorMesesEsperados[9] = "Outubro";
        vetorMesesEsperados[10] = "Novembro";
        vetorMesesEsperados[11] = "Dezembro";
    }
    @Test
    public void testaCriaVetorMeses(){
        String[] valorAtual = exe08medium.criaVetorMeses();
        Assert.assertArrayEquals(vetorMesesEsperados,valorAtual);
    }

    @Test
    public void testaImpressaoMeses(){
        exe08medium.imprimeValorVetor(vetorMesesEsperados);
    }
}
