package medium;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TesteExercicio06_medium {

    static Exercicio_06_medium exe06_medium;
    @BeforeClass
    public static void beforeClass(){
        exe06_medium = new Exercicio_06_medium();
        }
    @Test
    public void testeCalculaFatorial(){
        int valorEsperado = 3628800;
        int valorAtual = (exe06_medium.calculaFatorial(10));
        Assert.assertEquals("resultado fatorial diferente do esperado", valorEsperado, valorAtual);
    }
}





