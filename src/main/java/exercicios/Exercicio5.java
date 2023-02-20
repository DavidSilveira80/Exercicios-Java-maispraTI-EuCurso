package exercicios;

import models.Aluno;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Menus.mostrarEnunciadoExercicio5;

public class Exercicio5 {
    public static void executarExercicio5Poo2Aluno() {
        Locale.setDefault(Locale.US);

        mostrarEnunciadoExercicio5();
        int option;
        do{
            Aluno aluno = new Aluno();

            informarNomeAluno(aluno);
            informarNotasDoAluno(aluno);
            aluno.somarNotas();

            if (aluno.getNotasSomadas() <= 100) {
                executaMetodosDoAluno(aluno);

            } else {
                out.println("A SOMA TOTAL DAS NOTAS ULTRAPASSA 100 PONTOS.");
            }
            option = informarFluxo1E2();
        }while(option != 2);
    }
//--------------------------------MÉTODOS AUXILIARES-----------------------------------

    public static void informarNomeAluno(Aluno aluno){
        Scanner entrada = new Scanner(System.in);
        out.print("\nINFORME O NOME DO ALUNO: ");
        aluno.setNomeAluno(entrada.nextLine());
    }
    public static void informarNotasDoAluno(Aluno aluno){
        out.print("INFORME O PRIMEIRA NOTA DO ALUNO: ");
        aluno.setNota1(entradaDouble());

        out.print("INFORME A SEGUNDA NOTA DO ALUNO: ");
        aluno.setNota2(entradaDouble());

        out.print("INFORME A TERCEIRA NOTA DO ALUNO: ");
        aluno.setNota3(entradaDouble());
    }

    public static void executaMetodosDoAluno(Aluno aluno){
        aluno.calcularMedia(); aluno.acharMaiorNota(); aluno.acharMenorNota();
        out.println(aluno.mostrarBoletimAluno());
    }

    public static void chamadaExercicio5(){
        out.println("\nEXERCÍCIO POO 2\n");
        executarExercicio5Poo2Aluno();
    }
}
