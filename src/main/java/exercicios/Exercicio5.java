package exercicios;

import models.Aluno;
import java.util.Locale;
import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Enunciados.mostrarEnunciadoExercicio5;

public class Exercicio5 {
    public static void executarExercicio5Poo2Aluno() {
        Locale.setDefault(Locale.US);

        mostrarEnunciadoExercicio5();
        int acao;
        do{
            Aluno aluno = new Aluno();
            informarDadosDoAluno(aluno);
            aluno.somarNotas();

            if (aluno.getNotasSomadas() <= 100) {
                executaMetodosDoAluno(aluno);
            } else {
                out.println("A SOMA TOTAL DAS NOTAS ULTRAPASSA 100 PONTOS.");
            }
            acao = informarFluxo1E2();
        }while(acao != 2);
    }
//--------------------------------MÉTODOS AUXILIARES-----------------------------------

    public static void informarDadosDoAluno(Aluno aluno){
        out.print("\nINFORME O NOME DO ALUNO: ");
        String nome = entradaString();
        out.print("INFORME O PRIMEIRA NOTA DO ALUNO: ");
        double nota1 = entradaDouble();
        out.print("INFORME A SEGUNDA NOTA DO ALUNO: ");
        double nota2 = entradaDouble();
        out.print("INFORME A TERCEIRA NOTA DO ALUNO: ");
        double nota3 = entradaDouble();
        cadastrarAluno(aluno, nome, nota1, nota2, nota3);
    }

    public static void cadastrarAluno(Aluno aluno, String nome, double nota1, double nota2, double nota3){
        aluno.setNomeAluno(nome);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        aluno.setNota3(nota3);
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
