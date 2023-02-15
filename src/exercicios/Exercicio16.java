package exercicios;

import models.Aluno3Streams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;

public class Exercicio16 {
    public static void executarExercicio16Map1Aluno(){
        Scanner entrada = new Scanner(System.in);
        out.println();
        out.println("""
                Crie um sistema utilizando do-while que insira alunos em um Map. A chave
                (Key) deverá ser a matrícula do aluno e o valor (Value) deverá ser o próprio
                objeto Aluno.
                Depois crie uma funcionalidade para remover alunos deste Map através da
                chave
                """);
        out.println();

        Map<String, Aluno3Streams> mapaAluno = new HashMap<>();

        int loop;
        do {
            int option;
            do {
                out.println("CADASTRO DE ALUNOS");
                out.println();

                out.print("INFORME A MATRÍCULA DO ALUNO: ");
                String matricula = entrada.nextLine();

                out.print("INFORME O NOME DO ALUNO: ");
                String nome = entrada.nextLine();

                mapaAluno.put(matricula, new Aluno3Streams(matricula, nome));

                out.println();
                out.print("QUER ADICIONAR OUTRO ALUNO(1-SIM/2-NÃO): ");
                option = entradaInteira();
            } while (option != 2);

            out.println();
            out.println("SEGUE OS ALUNOS CADASTRADOS");

            for(Aluno3Streams aluno : mapaAluno.values()){
                out.println(aluno.toString());
            }

            out.println();
            int loopExcluir;
            do{

                out.println("EXCLUSÃO DE ALUNOS");
                out.print("INFORME A MATRICULADO ALUNO QUE QUER EXCLUIR: ");
                String matriculaParaRemover = entrada.nextLine();

                Aluno3Streams alunoParaRemover = mapaAluno.get(matriculaParaRemover);

                mapaAluno.remove(alunoParaRemover.getMatricula());

                out.println();
                if(mapaAluno.isEmpty()){
                    out.println("TODOS ALUNOS REMOVIDOS.");
                }else{

                    for(Aluno3Streams alunosQueRestam : mapaAluno.values()){
                        out.println(alunosQueRestam.toString());
                    }
                }

                out.println();
                out.print("QUER EXCLUIR OUTRO ALUNO(1-SIM/2-NÃO): ");
                loopExcluir = entradaInteira();
            }while(loopExcluir != 2);

            out.print("QUER EXECUTAR O PROGRAMA NOVAMENTE(1-SIM/2-NÃO): ");
            loop = entradaInteira();

        }while(loop != 2);
    }
}
