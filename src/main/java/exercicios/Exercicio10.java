package exercicios;

import models.Administrador;
import models.Contador;
import models.Programador;
import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Enunciados.mostrarEnunciadoExercicioFuncionario2;
import static utils.Menus.mostrarMenuExercicioFuncionario2;

public class Exercicio10 {
    public static void executarExercicio10Poo7Funcionario2() {
        mostrarEnunciadoExercicioFuncionario2();
        out.println();
        int loop;
        do{
            int option;
            do {
                mostrarMenuExercicioFuncionario2();

                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            } while (option != 1 && option != 2 && option != 3);

            gerarProfissional(option);

            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            loop = entradaInteira();
        }while(loop != 2);
    }
    //---------------------------------------Métodos auxiliares-----------------------------------------

    public static void gerarProfissional(int tipoProfissional) {
        out.println();

        out.print("INFORME O NOME DO PROFISSIONAL: ");
        String nome = entradaString();

        out.print("INFORME O TOTAL DE HORAS TRABALHADAS: ");
        int horasTrabalhadas = entradaInteira();

        out.print("INFORME O VALOR POR HORA TRABALHADA: ");
        double valorHora = entradaDouble();

        montarProfissional(nome, horasTrabalhadas, valorHora, tipoProfissional);
    }

    public static void montarProfissional(String nome, int horasTrabalhadas, double valorHora,
                                          int tipoProfissional){
        if (tipoProfissional == 1) {
            out.println("PROGRAMADOR");
            Programador programador = new Programador(nome, horasTrabalhadas,
                    valorHora);
            out.println(programador.mostrarRelatorio());

        } else if (tipoProfissional == 2) {
            out.println("CONTADOR");
            Contador contador = new Contador(nome, horasTrabalhadas, valorHora);
            out.println(contador.mostrarRelatorio());

        } else if (tipoProfissional == 3) {
            out.println("ADMINISTRADOR");
            Administrador administrador = new Administrador(nome, horasTrabalhadas,
                    valorHora);
            out.println(administrador.mostrarRelatorio());
        }
    }

    public static void chamadaExercicio10(){
        out.println("\nEXERCÍCIO POO 7\n");
        executarExercicio10Poo7Funcionario2();
    }
}
