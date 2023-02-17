package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Entradas.informarFluxo1E2;
import static utils.Menus.mostrarEnunciadoExercicio1;

public class Exercicio1 {
    public static void executarExercicio1() {
        int option;
        do{
            mostrarEnunciadoExercicio1();

            List<Integer> numerosInformados = new ArrayList<>();

            out.println(maiorEMenorNumeros(informarNumeros(numerosInformados)));

            option = informarFluxo1E2();
        }while(option != 2);
    }
    //-----------------------------------MÉTODOS AUXILIARES--------------------------------------------

    public static List<Integer> informarNumeros(List<Integer> numerosInformados){

        for(int contador=0; contador < 3; contador++) {
            out.printf("INFORME O %dº NÚMERO: ", contador + 1);
            numerosInformados.add(entradaInteira());
        }
        return numerosInformados;
    }

    public static String maiorEMenorNumeros(List<Integer> numeros){

        int maiorNumero = Collections.max(numeros); int menorNumero = Collections.min(numeros);

        return String.format("\nO MAIOR NÚMERO É: %d\n" +
                "O MENOR NÚMERO É: %d\n\n", maiorNumero, menorNumero);
    }

    public static void chamadaExercicio1(){
        out.println("\nEXERCÍCIO 1\n");
        executarExercicio1();
    }
}
