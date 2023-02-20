package exercicios;

import models.MinhaExceptionExercicio10;
import static java.lang.System.out;
import static utils.Entradas.entradaDouble;
import static utils.Entradas.entradaInteira;
import static utils.Menus.mostrarMenuExercicioPoo10Excecao1;

public class Exercicio13 {
    public static void executarExercicio13Poo10Excecao1() throws MinhaExceptionExercicio10 {
        out.println("""
                Seguindo o exercício 1…
                Crie uma exceção personalizada que deverá ser lançada nesses casos:
                Ao tentar fazer saque maior que o saldo.
                Ao tentar fazer um depósito maior que 10 mil.
                Trate essas exceções.
                """);
        out.println();
        out.println("NESTE EXERCÍCIO TANTO O EXEMPLO DE SAQUE E O DE DEPÓSITO IRÃO DERRUBAR O SISTEMINHA.\n" +
                "PARA CONTINUAR EXECUNTANDO O PROGRAMA VOCÊ TERÁ DE EXECUTA-LO NOVAMENTE.");
        int parada = 0;
        while (parada == 0) {
            int option;
            do {
                mostrarMenuExercicioPoo10Excecao1();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
                switch (option) {
                    case 1:
                        out.println("SACAR");
                        out.println("SAQUE ONDE LANÇARÁ UMA EXCEÇÃO.");
                        double saldo = 480;
                        out.print("INFORME O VALOR DO SAQUE: R$ ");
                        double saque = entradaDouble();

                        if (saque > saldo) {
                            throw new MinhaExceptionExercicio10("SALDO INSUFICIENTE PARA O SAQUE.\n" +
                                    "saldo == " + saldo + " saque == " + saque);
                        }
                        break;
                    case 2:
                        out.println("DEPOSITAR");
                        out.println();
                        double tetoDeposito = 10000;
                        out.print("INFORME O VALOR DO DEPÓSITO: R$ ");
                        double valorDeposito = entradaDouble();

                        if (valorDeposito > tetoDeposito) {
                            throw new MinhaExceptionExercicio10("O VALOR DO DEPÓSITO É MAIOR QUE SEU TETO.\n" +
                                    "tetoDeposito == " + tetoDeposito + " valorDeposito == " + valorDeposito);
                        }
                        break;
                    case 3:
                        out.println("SAINDO.....");
                        parada = 1;
                        break;
                    default:
                        out.println("OPÇÃO INVÁLIDA");
                        break;
                }
            }while(option != 3);
        }
    }
    //---------------------------------------Métodos auxiliares----------------------------------------
    public static void chamadaExercicio13() throws MinhaExceptionExercicio10 {
        out.println("\nEXERCÍCIO POO 10\n");
        executarExercicio13Poo10Excecao1();
    }
}

