package easy;

import easy.Exercicio_02_easy;
import org.junit.Test;
import org.junit.Assert;

    public class TesteExercicio02_easy {

        @Test
        public void testRetornaPalavra(){
            Exercicio_02_easy ex02_easy = new Exercicio_02_easy();
            String msgEsperada = "O usuario digitou: Teste";
            String msgAtual = ex02_easy.retornarPalavra("Teste");

            Assert.assertEquals("Mensagem esperada, diferente da atual", msgEsperada, msgAtual);
        }
    }

