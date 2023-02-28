package exercicios;

import models.Funcionario;
import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Entradas.entradaString;
import static utils.Enunciados.mostrarEnunciadoExercicio9;

public class Exercicio9 {
    public static void executarExercicio9Poo6Funcionario1() {
        mostrarEnunciadoExercicio9();

        out.println();
        int option;
        do{
            out.println("-------------------------------------------");
            out.println("          CADASTRANDO 10 FUNCIONÁRIOS      ");

            List<Funcionario> funcionarios = new ArrayList<>();
            int contador = 0;
            while (contador < 10) {
                out.println();
                adicionarFuncionarios(funcionarios, contador);
                contador++;
            }
            out.println("LISTANDO OS 10 FUNCIONÁRIOS E SEUS ATRIBUTOS");
            for (Funcionario funcionario : funcionarios) {
                funcionario.mostrarFuncionario();
            }
            out.println();
            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            option = entradaInteira();
        }while(option != 2);
    }

//-----------------------------------------Métodos auxiliares-------------------------------------------

    public static void adicionarFuncionarios(List<Funcionario> funcionarios, int contador){
        out.printf("INFORME O NOME DO %dº FUNCIONÁRIO: ", contador + 1);
        String nome = entradaString();

        out.print("INFORME A FUNÇÃO: ");
        String funcao = entradaString();

        out.print("INFORME O SETOR: ");
        String setor = entradaString();
        funcionarios.add(new Funcionario(nome, funcao, setor));
    }

    public static void chamadaExercicio9(){
        out.println("\nEXERCÍCIO POO 6\n");
        executarExercicio9Poo6Funcionario1();
    }
}
