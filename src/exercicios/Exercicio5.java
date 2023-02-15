package exercicios;

import models.Aluno;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;
import static utils.Entradas.entradaDouble;
import static utils.Entradas.entradaInteira;

public class Exercicio5 {
    public static void executarExercicio5Poo2Aluno() {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        out.println("""
                Criar uma classe aluno que receba um nome, nota1, nota2 e nota3, onde o montante das 
                notas podem chegar no máximo 100.
                Cria um método que retorne o nome do aluno, sua média, a maior e menor nota
                """);
        int option;
        do{
            out.println();
            out.print("INFORME O NOME DO ALUNO: ");
            String nome = entrada.nextLine();

            out.print("INFORME O PRIMEIRA NOTA DO ALUNO: ");
            double nota1 = entradaDouble();

            out.print("INFORME A SEGUNDA NOTA DO ALUNO: ");
            double nota2 = entradaDouble();

            out.print("INFORME A TERCEIRA NOTA DO ALUNO: ");
            double nota3 = entradaDouble();

            out.println();
            Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
            aluno.somarNotas();

            if (aluno.getNotasSomadas() <= 100) {
                aluno.calcularMedia();
                aluno.acharMaiorNota();
                aluno.acharMenorNota();
                out.println(aluno.mostrarBoletimAluno());

            } else {
                out.println("A SOMA TOTAL DAS NOTAS ULTRAPASSA 100 PONTOS.");
            }
            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            option = entradaInteira();
        }while(option != 2);

    }
}
