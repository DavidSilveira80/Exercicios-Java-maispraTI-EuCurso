package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Entradas.informarFluxo1E2;

public class Exercicio1 {
    public static void executarExercicio1() {
        int option;
        do{
            out.println("Escreva um programa para ler 3 valores e printe o " +
                        "maior e o menor entre eles.\n");

            List<Integer> numerosInformados = new ArrayList<>();

            maiorEMenorNumeros(informarNumeros(numerosInformados));

            option = informarFluxo1E2();
        }while(option != 2);
    }

    //-----------------------------------MÉTODOS AUXILIARES--------------------------------------------

    public static List<Integer> informarNumeros(List<Integer> listavazia){

        for(int contador=0; contador < 3; contador++) {
            out.printf("INFORME O %dº NÚMERO: ", contador + 1);
            listavazia.add(entradaInteira());
        }
        return listavazia;
    }

    public static void maiorEMenorNumeros(List<Integer> numeros){

        int maiorNumero = Collections.max(numeros);
        int menorNumero = Collections.min(numeros);

        out.printf("\nO MAIOR NÚMERO É: %d\nO MENOR NÚMERO É: %d\n\n", maiorNumero, menorNumero);
    }
}
