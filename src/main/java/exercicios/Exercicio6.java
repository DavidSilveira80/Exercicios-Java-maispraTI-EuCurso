package exercicios;

import models.Aluno2;
import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Entradas.entradaInteira;
import static utils.Menus.mostrarEnunciadoExercicio6;

public class Exercicio6 {
    public static void executarExercicio6Poo3Aluno2() {

        mostrarEnunciadoExercicio6();
        int acao;
        do{
            out.println();
            Aluno2 aluno2 = new Aluno2();

            inserirDadosAluno(aluno2);

            mostrarBoletin(aluno2);

            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            acao = entradaInteira();
        }while(acao != 2);
    }

    //---------------------------------------Métodos auxiliares--------------------------------------------
    public static void chamadaExercicio6(){
        out.println("\nEXERCÍCIO P00 3\n");
        executarExercicio6Poo3Aluno2();
    }

    //FUNÇÃO RECURSIVA
    public static double validarNota(double nota, Aluno2 aluno) {
        if(aluno.getSomatorio() + nota >= 100){
            out.println("NÃO FOI POSSÍVEL ADICIONAR NOTA. SOMATÓRIO MAIOR OU IGUAL À 100 PONTOS.");
            out.print("INFORME A NOTA NOVAMENTE: ");
            nota = entradaDouble();
            nota = validarNota(nota, aluno);
        }else{
            aluno.setSomatorio(aluno.getSomatorio() + nota);
        }
        return nota;
    }

    public static void inserirDadosAluno(Aluno2 aluno2){
        out.print("INFORME O NOME DO ALUNO: ");
        String nome = entradaString();

        out.printf("INFORME A MATRICULA DO ALUNO ", aluno2.getNome() + "(ATÉ 4 DIGITOS) :");
        int matricula = entradaInteira();

        out.print("INFORMAR A 1ª NOTA: ");
        double nota1 = entradaDouble();
        validarNota(nota1, aluno2);

        System.out.print("INFORMAR A 2° NOTA: ");
        double nota2 = entradaDouble();
        validarNota(nota2, aluno2);

        out.print("INFORMAR A 3º NOTA: ");
        double nota3 = entradaDouble();
        validarNota(nota3, aluno2);

        registrarAluno(aluno2, nome, matricula, nota1, nota2, nota3 );
    }

    public static void registrarAluno(Aluno2 aluno2, String nome, int matricula, double nota1, double nota2,
                                      double nota3){
        aluno2.setMatricula(matricula);
        aluno2.setNome(nome);
        aluno2.setNota1(nota1);
        aluno2.setNota2(nota2);
        aluno2.setNota3(nota3);
    }

    public static void mostrarBoletin(Aluno2 aluno2){
        out.println();
        aluno2.mostrarBoletim();
        out.println();
    }
}
