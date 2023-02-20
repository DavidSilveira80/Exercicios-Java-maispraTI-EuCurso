package exercicios;

import models.Aluno2;

import java.util.Scanner;

import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Entradas.entradaInteira;
import static utils.Menus.mostrarEnunciadoExercicio6;

public class Exercicio6 {
    public static void executarExercicio6Poo3Aluno2() {

        mostrarEnunciadoExercicio6();
        int option;
        do{
            out.println();
            Aluno2 aluno2 = new Aluno2();

            inserirDadosAluno(aluno2);

            inserirNotasAluno(aluno2);

            mostrarBoletin(aluno2);

            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            option = entradaInteira();
        }while(option != 2);
    }

    //---------------------------------------Métodos auxiliares--------------------------------------------
    public static void chamadaExercicio6(){
        out.println("\nEXERCÍCIO P00 3\n");
        executarExercicio6Poo3Aluno2();
    }

    //FUNÇÃO RECURSIVA
    public static double validarNotas(double nota, Aluno2 aluno) {
        if(aluno.getSomatorio() + nota >= 100){
            out.println("NÃO FOI POSSÍVEL ADICIONAR NOTA. SOMATÓRIO MAIOR OU IGUAL À 100 PONTOS.");
            out.print("INFORME A NOTA NOVAMENTE: ");
            nota = entradaDouble();
            nota = validarNotas(nota, aluno);
        }else{
            aluno.setSomatorio(aluno.getSomatorio() + nota);
        }
        return nota;
    }

    public static void inserirDadosAluno(Aluno2 aluno2){
        Scanner entrada = new Scanner(System.in);
        out.print("INFORME O NOME DO ALUNO: ");
        String nomeAluno = entrada.nextLine();
        aluno2.setNomeAluno(nomeAluno);

        out.printf("INFORME A MATRICULA DO ALUNO ", aluno2.getNomeAluno() + "(ATÉ 4 DIGITOS) :");
        int matricula = entradaInteira();
        aluno2.setMatricula(matricula);
    }

    public static void inserirNotasAluno(Aluno2 aluno2){
        out.print("INFORMAR A 1ª NOTA: ");
        double nota1 = entradaDouble();
        aluno2.setNota1(validarNotas(nota1, aluno2));

        System.out.print("INFORMAR A 2° NOTA: ");
        double nota2 = entradaDouble();
        aluno2.setNota2(validarNotas(nota2, aluno2));

        out.print("INFORMAR A 3º NOTA: ");
        double nota3 = entradaDouble();
        aluno2.setNota3(validarNotas(nota3, aluno2));
    }

    public static void mostrarBoletin(Aluno2 aluno2){
        out.println();
        aluno2.mostrarBoletim();
        out.println();
    }
}
