import exercicios.Exercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercicio2Test {

    @Test
    public void valorTotalDe5MacasTest() {

        double expectativa = 1.50;

        double saida = Exercicio2.calcularValorTotalMacas(
                5);
        Assertions.assertEquals(expectativa, saida);
    }
    @Test
    public void valorTotalDe11MacasTest(){

        double expectativa = 3.30;

        double saida = Exercicio2.calcularValorTotalMacas(11);

        Assertions.assertEquals(expectativa, saida);
    }

    @Test
    public void valorTotalDe12MacasTest(){
        double expectativa = 3.0;

        double saida = Exercicio2.calcularValorTotalMacas(12);

        Assertions.assertEquals(expectativa, saida);
    }

    @Test
    public void valorTotalDe24MacasTest(){
        double expectativa = 6.0;

        double saida = Exercicio2.calcularValorTotalMacas(24);

        Assertions.assertEquals(expectativa, saida);
    }
}











