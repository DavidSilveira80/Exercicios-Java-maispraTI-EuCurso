package exercicios;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;

public class Exercicio2 {
    public static void executarExercicio2() {
        out.println();
        out.println("""
                As maçãs custam 0,30 cada se forem compradas menos que uma dúzia e 0,25
                se forem comprados pelo menos uma dúzia.
                Escreva um programa que leia a quantidade de maçãs compradas e depois
                imprima o valor total da compra no console.
                """);
        out.println();
        int option;
        do{
            out.print("INFORME A QUANTIDADE DE MAÇÃS QUE VOCÊ QUER COMPRAR: ");
            int quantidadeMacas = entradaInteira();

            double valorApartirDeUmaDuzia = 0.25;
            double valorAbaixoDeUmaDuzia = 0.30;

            if (quantidadeMacas >= 12) {
                out.printf("O VALOR TOTAL DAS %d MAÇÃS É DE R$ %.2f\n", quantidadeMacas, quantidadeMacas *
                        valorApartirDeUmaDuzia);
            } else {
                out.printf("O VALOR TOTAL DAS %d MAÇÃS É DE R$ %.2f\n", quantidadeMacas, quantidadeMacas *
                        valorAbaixoDeUmaDuzia);
            }
            out.println();
            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            option = entradaInteira();
        }while(option != 2);

    }
}
