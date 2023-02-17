package exercicios;

import main.java.models.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;

public class Exercicio9 {
    public static void executarExercicio9Poo6Funcionario1() {
        Scanner entrada = new Scanner(System.in);
        out.println("""
                Crie uma classe do tipo funcionário com os campos:
                nome
                função
                setor
                Crie uma lista com 10 objetos do tipo funcionário dentro dela.
                Depois exiba no console todas as informações de cada objeto.
                """);
        out.println();
        int option;
        do{
            out.println("-------------------------------------------");
            out.println("          CADASTRANDO 10 FUNCIONÁRIOS      ");


            List<Funcionario> funcionarios = new ArrayList<>();
            int contador = 0;
            while (contador < 10) {
                out.println();

                out.printf("INFORME O NOME DO %dº FUNCIONÁRIO: ", contador + 1);
                String nome = entrada.nextLine();

                out.print("INFORME A FUNÇÃO: ");
                String funcao = entrada.nextLine();

                out.print("INFORME O SETOR: ");
                String setor = entrada.nextLine();
                funcionarios.add(new Funcionario(nome, funcao, setor));
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
    public static void chamadaExercicio9(){
        out.println("\nEXERCÍCIO POO 6\n");
        executarExercicio9Poo6Funcionario1();
    }
}
