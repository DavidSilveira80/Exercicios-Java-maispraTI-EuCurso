package exercicios;

import java.util.Locale;

import static java.lang.System.out;
import static utils.Entradas.entradaDouble;
import static utils.Entradas.entradaInteira;

public class Exercicio3 {
    public static void executarExercicio3() {
        Locale.setDefault(Locale.US);

        out.println();
        out.println("""
                Escreva um programa que leia o salário bruto de um funcionário e mostre o
                valor líquido.
                Se o salário for menor que
                 R$ 1.000 o desconto é 6%
                Até R$ 2.500 é 8%
                Até R$ 4.800 é 10%
                Maior que 4.800 é 15%
                """);
        out.println();

        int option;
        do{
            out.print("INFORME O SEU SALÁRIO BRUTO: R$ ");
            double salarioBruto = entradaDouble();
            if (salarioBruto < 1000) {

                double salarioLiquido = salarioBruto - ((6 * salarioBruto) / 100);
                out.printf("O SEU SALÁRIO BRUTO É R$ %.2f\n", salarioBruto);
                out.printf("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);

            } else if (salarioBruto >= 1000 && salarioBruto <= 2500) {

                double salarioLiquido = salarioBruto - ((8 * salarioBruto) / 100);
                out.printf("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);

            } else if (salarioBruto >= 2500 && salarioBruto <= 4800) {

                double salarioLiquido = salarioBruto - ((10 * salarioBruto) / 100);
                out.printf("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);

            } else if (salarioBruto > 4800) {

                double salarioLiquido = salarioBruto - ((15 * salarioBruto) / 100);
                out.printf("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);
            }

            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            option = entradaInteira();
        }while(option != 2);
    }
}
