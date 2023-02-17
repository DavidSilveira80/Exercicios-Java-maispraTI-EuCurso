package exercicios;

import main.java.models.Aluno2;

import java.util.Scanner;

import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Entradas.entradaInteira;

public class Exercicio6 {
    public static void executarExercicio6Poo3Aluno2() {
        Scanner entrada = new Scanner(System.in);
        out.println("""
                Crie uma classe Aluno com os campos nome, matrícula e notas[3].
                Essa classe deve ser encapsulada e no momento de adicionar uma nova nota,
                ela deve verificar se o somatório será maior que 100, caso for. Deixe uma
                mensagem que não foi possível e peça para adicionar novamente uma nota.
                """);
        int option;
        do{
            out.println();
            Aluno2 aluno2 = new Aluno2();

            out.print("INFORME O NOME DO ALUNO: ");
            String nomeAluno = entrada.nextLine();
            aluno2.setNomeAluno(nomeAluno);

            out.printf("INFORME A MATRICULA DO ALUNO ", aluno2.getNomeAluno() + "(ATÉ 4 DIGITOS) :");
            int matricula = entradaInteira();
            aluno2.setMatricula(matricula);

            out.println();
            out.println("------------------------------------------------");
            out.println("INFORMAR AS NOTAS DO ALUNO " + aluno2.getNomeAluno() + ".");
            out.println();

            out.print("INFORMAR A 1ª NOTA: ");
            double nota1 = entradaDouble();
            aluno2.setNota1(validarNotas(nota1, aluno2));

            System.out.print("INFORMAR A 2° NOTA: ");
            double nota2 = entradaDouble();
            aluno2.setNota2(validarNotas(nota2, aluno2));

            out.print("INFORMAR A 3º NOTA: ");
            double nota3 = entradaDouble();
            aluno2.setNota3(validarNotas(nota3, aluno2));

            out.println();
            aluno2.mostrarBoletim();
            out.println();
            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            option = entradaInteira();
        }while(option != 2);
    }
//---------------------------------------Métodos auxiliares--------------------------------------------
    public static void chamadaExercicio6(){
        out.println("\nEXERCÍCIO P00 3\n");
        executarExercicio6Poo3Aluno2();
    }
}
