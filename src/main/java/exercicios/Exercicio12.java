package exercicios;

import models.ContaBancaria;
import models.ContaCorrente;
import models.ContaPoupanca;
import models.ContaSalario;
import java.util.HashMap;
import java.util.Map;
import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Enunciados.mostrarEnunciadoExercicio12;
import static utils.Menus.*;

public class Exercicio12 {
    public static void executarExercicio12Poo9InterfaceBanco() {

        mostrarEnunciadoExercicio12();

        int paradaPrincipal = 0;
        while (paradaPrincipal == 0) {
            int option1;
            do {
                mostrarMenuPrincipalBancoInterface();
                out.print("INFORME SUA ESCOLHA: ");
                option1 = entradaInteira();
            } while (option1 != 1 && option1 != 2 && option1 != 3 && option1 != 4);
            if (option1 == 4) {
                out.println("SAIR");
                out.println();
                out.println("ENCERRANDO");
                paradaPrincipal = 1;
            } else {
                rodarCaixa(option1);
            }
        }
    }

    //---------------------------------------Métodos auxiliares-----------------------------------------

    public static void rodarCaixa(int tipoConta) {
        out.print("INFORME NO NÚMERO DA CONTA: ");
        int numeroConta = entradaInteira();
        out.print("INFORME O NOME DO TITULAR DA CONTA: ");
        String nomeTitularConta = entradaString();

        executarConta(numeroConta, nomeTitularConta, tipoConta);
    }

    public static void executarConta(int numeroConta, String nomeTitularConta, int tipoConta){
        Map<Integer, Runnable> contas = new HashMap<>();
        // () -> expressao lambda para um método que está na mesma classe
        contas.put(1, () -> rodarContaCorrente(numeroConta, nomeTitularConta));
        contas.put(2, () -> rodarContaPoupanca(numeroConta, nomeTitularConta));
        contas.put(3, () -> rodarContaSalario(numeroConta, nomeTitularConta));

        contas.get(tipoConta).run();
    }

    public static void rodarContaCorrente(int numeroConta, String nomeTitularConta){
        out.println("CONTA CORRENTE");
        ContaBancaria contaC = new ContaCorrente(numeroConta, nomeTitularConta);
        rodarFluxoServicos(contaC);
        //return null;
    }

    public static void rodarContaPoupanca(int numeroConta, String nomeTitularConta){
        out.println("CONTA POUPANÇA");
        ContaBancaria contaP = new ContaPoupanca(numeroConta,
                nomeTitularConta);
        rodarFluxoServicos(contaP);
        //return null;
    }

    public static void rodarContaSalario(int numeroConta, String nomeTitularConta){
        out.println("CONTA SALÁRIO");
        ContaBancaria contaS = new ContaSalario(numeroConta,
                nomeTitularConta);
        rodarFluxoServicos(contaS);
        //return null;
    }

    public static void rodarFluxoServicos(ContaBancaria conta){
        int paradaFluxo = 0;
        while (paradaFluxo == 0) {

            int servico;
            do {

                mostrarMenuSecundarioBancoInterface();
                out.print("INFORME SUA ESCOLHA: ");
                servico = entradaInteira();
            } while (servico != 1 && servico != 2 &&
                    servico != 3 && servico != 4);

            if(servico == 4){
                out.println("VOLTAR");
                out.println();
                paradaFluxo = 1;
            }else{
                executarServicos(servico, conta);
            }
        }
    }

    public static void executarServicos(int tipoServico, ContaBancaria contaBancaria){
        Map<Integer, Runnable> servicos = new HashMap<>();
        servicos.put(1, () -> depositar(contaBancaria));
        servicos.put(2, () -> sacar(contaBancaria));
        servicos.put(3, () -> verExtrato(contaBancaria));
        servicos.get(tipoServico).run();
    }

    public static void depositar(ContaBancaria contaBancaria){
       out.print("INFORME O VALOR DO DEPOSITO: R$ ");
       double valorDeposito = entradaDouble();
       contaBancaria.depositar(valorDeposito);
   }

    public static void sacar(ContaBancaria contaBancaria){
        out.print("INFORME O VALOR DO SAQUE: R$ ");
        double valorSaque = entradaDouble();
        contaBancaria.sacar(valorSaque);
    }

    public static void verExtrato(ContaBancaria contaBancaria){
        out.print(contaBancaria.verExtrato());
    }

    public static void chamadaExercicio12(){
        out.println("\nEXERCÍCIO POO 9\n");
        executarExercicio12Poo9InterfaceBanco();
        out.println();
    }
}
