import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercicios {
    public static void mostrarResultadoExercicio1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Escreva um programa para ler 3 valores e printe o maior e o menor entre eles.");
        System.out.println();
        List<Integer> tresInteiros = new ArrayList<>();
        int contador = 0;

        while (contador < 3) {
            System.out.printf("Informe o 1º número: ", contador + 1);
            tresInteiros.add(entrada.nextInt());
            contador++;
        }
        int maior = Collections.max(tresInteiros);
        int menor = Collections.min(tresInteiros);
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }

    public static void mostrarResultadoExercicio2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("""
                As maçãs custam 0,30 cada se forem compradas menos que uma dúzia e 0,25
                se forem comprados pelo menos uma dúzia.
                Escreva um programa que leia a quantidade de maçãs compradas e depois
                imprima o valor total da compra no console.
                """);

        System.out.print("Informe a quantidade de maçãs que você quer comprar: ");
        int quantidadeMacas = entrada.nextInt();

        double valorApartirDeUmaDuzia = 0.25;
        double valorAbaixoDeUmaDuzia = 0.30;

        if(quantidadeMacas >= 12){
            System.out.printf("Valor total das %d maçãs é de R$ %.2f\n", quantidadeMacas, quantidadeMacas *
                    valorApartirDeUmaDuzia);
        }else{
            System.out.printf("Valor total das %d maçãs é de R$ %.2f\n", quantidadeMacas, quantidadeMacas *
                    valorAbaixoDeUmaDuzia);
        }
    }
    public static void mostrarResultadoExercicio3(){
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("""
                Escreva um programa que leia o salário bruto de um funcionário e mostre o
                valor líquido.
                Se o salário for menor que
                 R$ 1.000 o desconto é 6%
                Até R$ 2.500 é 8%
                Até R$ 4.800 é 10%
                Maior que 4.800 é 15%
                """);

        System.out.print("Informe o seu salário bruto: R$ ");
        double salarioBruto = entrada.nextDouble();

        if(salarioBruto < 1000){
            double salarioLiquido = salarioBruto - ((6 * salarioBruto) / 100);
            System.out.printf("Seu salário bruto é R$ %.2f", salarioBruto);
            System.out.printf("Salário liquido é R$ %.2f", salarioLiquido);
        }else if(salarioBruto > 1000 && salarioBruto <= 2500){
            double salarioLiquido = salarioBruto - ((8 * salarioBruto) / 100);
            System.out.printf("Salário liquido é R$ %.2f", salarioLiquido);
        }else if(salarioBruto > 2500 && salarioBruto <= 4800){
            double salarioLiquido = salarioBruto - ((10 * salarioBruto) / 100);
            System.out.printf("Salário liquido é R$ %.2f", salarioLiquido);
        }else if(salarioBruto > 4800){
            double salarioLiquido = salarioBruto - ((15 * salarioBruto) / 100);
            System.out.printf("Salário liquido é R$ %.2f", salarioLiquido);
        }

    }
}



