package exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;

public class Exercicio15 {
    public static void executarExercicio15StreamsFrutas() {

        out.println("""
                Nós temos uma lista com várias frutas: 
                Maçã, Laranja, Limão, Pêra, Abacate,
                Morango, Ameixa, Manga, Maracujá.
                                
                Utilizando stream, crie uma nova lista sem as frutas que 
                começam com a letra
                "M"
                """);
        int parada;
        do {
            List<String> listaDeFrutas1 = new ArrayList<>(Arrays.asList("Maçã", "Laranja",
                    "Limão", "Pêra", "Abacate", "Morango", "Ameixa", "Manga", "Maracujá"));

            List<String> lsiatDeFrutas2 = listaDeFrutas1.stream().filter(elemento ->
                    !elemento.startsWith("M")).collect(Collectors.toList());

            out.println(listaDeFrutas1);
            out.println(lsiatDeFrutas2);

            out.println("""
                                    
                    A execução acima é resultado deste código:
                                    
                    List<String> listaDeFrutas1 = new ArrayList<>(Arrays.asList("Maçã", "Laranja",
                                    "Limão", "Pêra", "Abacate", "Morango", "Ameixa", "Manga", "Maracujá"));
                                    
                            List<String> lsiatDeFrutas2 = listaDeFrutas1.stream().filter(elemento ->\s
                                    !elemento.startsWith("M")).collect(Collectors.toList());
                                    
                            out.println(listaDeFrutas1);
                            out.println(lsiatDeFrutas2);
                                    
                                    
                    """);
            out.print("OBSERVE O RESULTADO DA EXECUÇÃO. PARA SAIR DIGITE 1: ");
            parada = entradaInteira();
        } while (parada != 1);
    }
    //-----------------------------Método auxiliares----------------------------------------------------
    public static void chamadaExercicio15(){
        out.println("\nEXERCÍCIO STREAMS 1\n");
        executarExercicio15StreamsFrutas();
    }
}
