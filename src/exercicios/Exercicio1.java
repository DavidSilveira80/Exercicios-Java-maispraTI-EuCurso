package exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;

public class Exercicio1 {
    public static void executarExercicio1() {
        int option;
        do{
            out.println();
            out.println("Escreva um programa para ler 3 valores e printe o maior e o menor entre eles.");
            out.println();

            List<Integer> tresInteiros = new ArrayList<>();

            int contador = 0;

            while (contador < 3) {
                out.printf("INFORME O %dº NÚMERO: ", contador + 1);
                tresInteiros.add(entradaInteira());
                contador++;
            }
            int maior = Collections.max(tresInteiros);
            int menor = Collections.min(tresInteiros);
            out.println();
            out.println("O MAIOR NÚMERO É: " + maior);
            out.println("O MENOR NÚMERO É: " + menor);
            out.println();
            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            option = entradaInteira();
        }while(option != 2);

    }
}
