package exercicios;

import main.java.models.Administrador;
import main.java.models.Contador;
import main.java.models.Programador;

import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Menus.mostrarEnunciadoExercicioFuncionario2;
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
            switch (option) {
                case 1:
                    out.println("PROGRAMADOR");
                    out.println();

                    gerarProgramador();

                    break;
                case 2:
                    out.println("CONTADOR");

                    gerarContador();

                    break;
                case 3:
                    out.println("ADMINISTRADOR");
                    out.println();

                    gerarAdministrador();

                    break;
            }
            out.print("QUER CONTINUAR(1-SIM/2-NÃO): ");
            loop = entradaInteira();
        }while(loop != 2);
    }
    //---------------------------------------Métodos auxiliares-----------------------------------------

    public static void gerarProgramador(){
        out.println();

        out.print("INFORME O NOME DO PROFISSIONAL: ");
        String nomeProgramador = entradaString();

        out.print("INFORME O TOTAL DE HORAS TRABALHADAS: ");
        int totalHorasProgramador = entradaInteira();

        out.print("INFORME O VALOR POR HORA TRABALHADA: ");
        double valorHorasProgramador = entradaDouble();

        Programador programador = new Programador(nomeProgramador, totalHorasProgramador,
                valorHorasProgramador);
        out.println(programador.mostrarRelatorio());
    }

    public static void gerarContador(){
        out.println();

        out.print("INFORME O NOME DO PROFISSIONAL: ");
        String nomeContador = entradaString();

        out.print("INFORME O TOTAL DE HORAS TRABALHADAS: ");
        int totalHorasContador = entradaInteira();

        out.print("INFORME O VALOR POR HORA TRABALHADA: ");
        double valorHorasContador = entradaDouble();

        Contador contador = new Contador(nomeContador, totalHorasContador, valorHorasContador);
        out.println(contador.mostrarRelatorio());
    }

    public static void gerarAdministrador(){
        out.println();

        out.print("INFORME O NOME DO PROFISSIONAL: ");
        String nomeAdministrador = entradaString();

        out.print("INFORME O TOTAL DE HORAS TRABALHADAS: ");
        int totalHorasAdministrador = entradaInteira();

        out.print("INFORME O VALOR POR HORA TRABALHADA: ");
        double valorHorasAdministrador = entradaDouble();

        Administrador administrador = new Administrador(nomeAdministrador, totalHorasAdministrador,
                valorHorasAdministrador);
        out.println(administrador.mostrarRelatorio());
    }

    public static void chamadaExercicio10(){
        out.println("\nEXERCÍCIO POO 7\n");
        executarExercicio10Poo7Funcionario2();
    }
}
