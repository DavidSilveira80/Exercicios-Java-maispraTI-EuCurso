package exercicios;

import models.ContaCorrente;
import models.ContaPoupanca;
import models.ContaSalario;

import java.util.Scanner;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Menus.mostrarMenuPrincipalBancoInterface;
import static utils.Menus.mostrarMenuSecundarioBancoInterface;

public class Exercicio12 {
    public static void executarExercicio12Poo9InterfaceBanco() {
        Scanner entrada = new Scanner(System.in);
        out.println();
        out.println("""
                Criar uma interface ContaBancaria com as funcionalidades: sacar, ver extrato e depositar.
                Depois crie classes que usarão esta Interface.
                Exemplos de classe: ContaCorrente, ContaPoupanca, ContaSalario;
                No método de saque, a conta corrente deverá ter um taxa de 10, conta poupança de 5 e
                conta salário 0.
                No método para depósito a conta corrente deverá ter um acréscimo de 1% até 10.000,
                conta poupança de 3% até 3.000 e na conta salário não ter.
                No método para ver Extrato deverá aparecer informações do titular e qual tipo de conta
                                            
                """);
        out.println();

        int paradaPrincipal = 0;
        while (paradaPrincipal == 0) {
            int option1;
            do {
                mostrarMenuPrincipalBancoInterface();
                out.print("INFORME SUA ESCOLHA: ");
                option1 = entradaInteira();
            } while (option1 != 1 && option1 != 2 && option1 != 3 && option1 != 4);
            switch (option1) {
                case 1:
                    out.println("CONTA CORRENTE");
                    out.println();
                    ContaCorrente contaC = new ContaCorrente();

                    out.print("INFORME NO NÚMERO DA CONTA: ");
                    int numeroContaCorrente = entradaInteira();
                    out.print("INFORME O NOME DO TITULAR DA CONTA: ");
                    String nomeTitularContaCorrente = entrada.nextLine();
                    contaC.setNumeroDaConta(numeroContaCorrente);
                    contaC.setNomeDoTitular(nomeTitularContaCorrente);

                    int paradaContaCorrente = 0;
                    while (paradaContaCorrente == 0) {
                        int optionContaCorrente;
                        do {
                            mostrarMenuSecundarioBancoInterface();
                            out.println("INFORME SUA ESCOLHA: ");
                            optionContaCorrente = entradaInteira();
                        } while (optionContaCorrente != 1 && optionContaCorrente != 2 &&
                                optionContaCorrente != 3 && optionContaCorrente != 4);
                        switch (optionContaCorrente) {
                            case 1:
                                out.println("DEPOSITAR");
                                out.println();
                                contaC.depositar();
                                break;
                            case 2:
                                out.println("SACAR");
                                out.println();
                                contaC.sacar();
                                break;
                            case 3:
                                out.println("EXTRATO");
                                out.println();
                                out.print(contaC.verExtrato());
                                break;
                            case 4:
                                out.println("VOLTAR");
                                out.println();
                                paradaContaCorrente = 1;
                        }
                    }
                    break;
                case 2:
                    out.println("CONTA POUPANÇA");
                    out.println();
                    ContaPoupanca contaP = new ContaPoupanca();

                    out.print("INFORME NO NÚMERO DA CONTA: ");
                    int numeroContaPoupanca = entradaInteira();
                    out.print("INFORME O NOME DO TITULAR DA CONTA: ");
                    String nomeTitularContaPoupanca = entrada.nextLine();
                    contaP.setNumeroDaConta(numeroContaPoupanca);
                    contaP.setNomeDoTitular(nomeTitularContaPoupanca);

                    int paradaContaPoupanca = 0;
                    while (paradaContaPoupanca == 0) {
                        int optionContaPoupanca;
                        do {
                            mostrarMenuSecundarioBancoInterface();
                            out.println("INFORME SUA ESCOLHA: ");
                            optionContaPoupanca = entradaInteira();
                        } while (optionContaPoupanca != 1 && optionContaPoupanca != 2 &&
                                optionContaPoupanca != 3 && optionContaPoupanca != 4);
                        switch (optionContaPoupanca) {
                            case 1:
                                out.println("DEPOSITAR");
                                contaP.depositar();
                                break;
                            case 2:
                                out.println("SACAR");
                                contaP.sacar();
                                break;
                            case 3:
                                out.println("EXTRATO");
                                out.print(contaP.verExtrato());
                                break;
                            case 4:
                                out.println("VOLTAR");
                                out.println();
                                paradaContaPoupanca = 1;
                        }
                    }
                    break;
                case 3:
                    out.println("CONTA SALÁRIO");
                    out.println();
                    ContaSalario contaS = new ContaSalario();

                    out.print("INFORME NO NÚMERO DA CONTA: ");
                    int numeroContaSalario = entradaInteira();
                    out.print("INFORME O NOME DO TITULAR DA CONTA: ");
                    String nomeTitularContaSalario = entrada.nextLine();
                    contaS.setNumeroDaConta(numeroContaSalario);
                    contaS.setNomeDoTitular(nomeTitularContaSalario);

                    int paradaContaSalario = 0;
                    while (paradaContaSalario == 0) {
                        int optionContaSalario;
                        do {
                            mostrarMenuSecundarioBancoInterface();
                            out.println("INFORME SUA ESCOLHA: ");
                            optionContaSalario = entradaInteira();
                        } while (optionContaSalario != 1 && optionContaSalario != 2 &&
                                optionContaSalario != 3 && optionContaSalario != 4);
                        switch (optionContaSalario) {
                            case 1:
                                out.println("DEPOSITAR");
                                contaS.depositar();
                                break;
                            case 2:
                                out.println("SACAR");
                                contaS.sacar();
                                break;
                            case 3:
                                out.println("EXTRATO");
                                out.print(contaS.verExtrato());
                                break;
                            case 4:
                                out.println("VOLTAR");
                                out.println();
                                paradaContaSalario = 1;
                        }
                    }
                    break;
                case 4:
                    out.println("SAIR");
                    out.println();
                    out.println("ENCERRANDO");
                    paradaPrincipal = 1;
            }
        }
    }
    //---------------------------------------Métodos auxiliares-----------------------------------------
    public static void chamadaExercicio12(){
        out.println("\nEXERCÍCIO POO 9\n");
        executarExercicio12Poo9InterfaceBanco();
        out.println();
    }
}
