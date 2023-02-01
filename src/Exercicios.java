import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Exercicios {
    public static void mostrarResultadoExercicio1() {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Escreva um programa para ler 3 valores e printe o maior e o menor entre eles.");
        System.out.println();
        List<Integer> tresInteiros = new ArrayList<>();
        int contador = 0;

        while (contador < 3) {
            System.out.printf("Informe o %dº número: ", contador + 1);
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
        Locale.setDefault(Locale.US);
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
            System.out.printf("Seu salário bruto é R$ %.2f\n", salarioBruto);
            System.out.printf("Salário liquido é R$ %.2f\n", salarioLiquido);
        }else if(salarioBruto >= 1000 && salarioBruto <= 2500){
            double salarioLiquido = salarioBruto - ((8 * salarioBruto) / 100);
            System.out.printf("Salário liquido é R$ %.2f\n", salarioLiquido);
        }else if(salarioBruto >= 2500 && salarioBruto <= 4800){
            double salarioLiquido = salarioBruto - ((10 * salarioBruto) / 100);
            System.out.printf("Salário liquido é R$ %.2f\n", salarioLiquido);
        }else if(salarioBruto > 4800) {
            double salarioLiquido = salarioBruto - ((15 * salarioBruto) / 100);
            System.out.printf("Salário liquido é R$ %.2f\n", salarioLiquido);
        }
    }
    public static void mostrarExercicioPoo1Jogador(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                            Criar uma classe Jogador que tenha as propriedades nome, gols, assistências.
                            E os métodos adicionarGol e adicionarAssistencia que receba como argumento os
                            quantidade de gols/assistências.
                            Também criar dois métodos  para ver o número de gols e assistências.
                            """);
        int loop = 0;
        while(loop == 0){

            System.out.println();
            System.out.print("INFORME O NOME DO JOGADOR: ");
            String nome = entrada.nextLine();
            Jogador jogador = new Jogador(nome);
            int option;
            do{
                System.out.println();
                System.out.println("JOGADOR: " + jogador.getNomeJogador());
                Menus.mostrarMenuJogador();
                System.out.print("INFORME SUA ESCOLHA: ");
                option = entrada.nextInt();
            }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5);
            switch(option){
                case 1:
                    System.out.println();
                    System.out.println("ADICIONAR GOLS.");
                    System.out.println();
                    System.out.print("INFORME QUANTOS GOLS QUER ADICIONAR: ");
                    int gol = entrada.nextInt();
                    jogador.adicionarGol(gol);

                    break;
                case 2:
                    System.out.println();
                    System.out.println("ADICIONAR ASSISTÊNCIAS.");
                    System.out.println();
                    System.out.print("INFORME QUANTAS ASSISTÊNCIAS QUER ADICIONAR: ");
                    int assistencia = entrada.nextInt();
                    jogador.adicionarAssistencia(assistencia);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("MOSTRAR NÚMERO DE GOLS.");
                    System.out.println();
                    jogador.mostrarNumerosDeGols();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("MOSTRAR NÚMERO DE ASSISTÊNCIAS.");
                    System.out.println();
                    jogador.mostrarNumeroDeAssistencias();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("SAINDO.");
                    loop = 1;
                    break;
            }

        }

    }
    public static void mostrarExercicioPoo2Aluno(){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        System.out.println("""
                Criar uma classe aluno que receba um nome, nota1, nota2 e nota3, onde o montante das 
                notas podem chegar no máximo 100.
                Cria um método que retorne o nome do aluno, sua média, a maior e menor nota
                """);
        System.out.println();
        System.out.print("INFORME O NOME DO ALUNO: ");
        String nome = entrada.nextLine();
        System.out.print("INFORME O PRIMEIRA NOTA DO ALUNO: ");
        double nota1 = entrada.nextDouble();
        System.out.print("INFORME A SEGUNDA NOTA DO ALUNO: ");
        double nota2 = entrada.nextDouble();
        System.out.print("INFORME A TERCEIRA NOTA DO ALUNO: ");
        double nota3 = entrada.nextDouble();
        System.out.println();
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        aluno.somarNotas();
        if(aluno.getNotasSomadas() <= 100){
            aluno.calcularMedia();
            aluno.acharMaiorNota();
            aluno.acharMenorNota();
            System.out.println(aluno.mostrarBoletimAluno());
        }else{
            System.out.println("A SOMA TOTAL DAS NOTAS ULTRAPASSA 100 PONTOS.");
        }
    }

}
