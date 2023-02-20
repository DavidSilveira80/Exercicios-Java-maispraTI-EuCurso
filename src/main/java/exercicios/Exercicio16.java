package exercicios;

import models.Aluno3Streams;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Menus.mostrarEnunciadoExercicio16;

public class Exercicio16 {
    public static void executarExercicio16Map1Aluno(){
        mostrarEnunciadoExercicio16();

        Map<String, Aluno3Streams> mapaAluno = new HashMap<>();

        int loop;
        do {
            chamarLoopCadastroAluno(mapaAluno);

            listarAlunos(mapaAluno);

            chamarLoopRemoverAluno(mapaAluno);

            out.print("\n");
            loop = informarFluxo1E2();

        }while(loop != 2);
    }
    //-------------------------------------Métodos auxiliares--------------------------------------------

    public static void chamarLoopCadastroAluno(Map<String, Aluno3Streams> mapaAluno){
        int option;
        do {
            cadastrarAluno(mapaAluno);

            out.print("\nQUER ADICIONAR OUTRO ALUNO(1-SIM/2-NÃO): ");
            option = entradaInteira();
        } while (option != 2);
    }

    public static void cadastrarAluno(Map<String, Aluno3Streams> mapaAluno){
        out.println("\nCADASTRO DE ALUNOS\n");
        out.print("INFORME A MATRÍCULA DO ALUNO: "); String matricula = entradaString();
        out.print("INFORME O NOME DO ALUNO: ");  String nome = entradaString();

        mapaAluno.put(matricula, new Aluno3Streams(matricula, nome));
    }

    public static void listarAlunos(Map<String, Aluno3Streams> mapaAluno){
        out.println("\nSEGUE OS ALUNOS CADASTRADOS");

        for(Aluno3Streams aluno : mapaAluno.values()){
            out.println(aluno.toString());
        }
    }

    public static void chamarLoopRemoverAluno(Map<String, Aluno3Streams> mapaAluno){
        int loopExcluir;
        do{
            removerAlunos(mapaAluno);

            out.print("\nQUER EXCLUIR OUTRO ALUNO(1-SIM/2-NÃO): ");
            loopExcluir = entradaInteira();
        }while(loopExcluir != 2);
    }

    public static void removerAlunos(Map<String,Aluno3Streams> mapaAluno){
        out.println("\nEXCLUSÃO DE ALUNOS");
        out.print("\nINFORME A MATRICULA DO ALUNO QUE QUER EXCLUIR: ");
        String matriculaParaRemover = entradaString();

        Aluno3Streams alunoParaRemover = mapaAluno.get(matriculaParaRemover);
        mapaAluno.remove(alunoParaRemover.getMatricula());

        if(mapaAluno.isEmpty()){
            out.println("\nTODOS ALUNOS REMOVIDOS.");
        }else{
            for(Aluno3Streams alunosQueRestam : mapaAluno.values()){
                out.println(alunosQueRestam.toString());
            }
        }
    }

    public static void chamadaExercicio16(){
        out.println("\nEXERCÍCIO STREAM 2\n");
        executarExercicio16Map1Aluno();
    }
}
