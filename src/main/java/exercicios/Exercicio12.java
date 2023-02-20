package exercicios;

import models.ContaBancaria;
import models.ContaCorrente;
import models.ContaPoupanca;
import models.ContaSalario;

import static java.lang.System.out;
import static utils.Entradas.*;
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
                rodarServicosDoBanco(option1);
            }
        }
    }

    //---------------------------------------Métodos auxiliares-----------------------------------------

    public static void rodarServicosDoBanco(int tipoConta){
        out.print("INFORME NO NÚMERO DA CONTA: ");
        int numeroConta = entradaInteira();
        out.print("INFORME O NOME DO TITULAR DA CONTA: ");
        String nomeTitularConta = entradaString();

        if(tipoConta == 1){
            out.println("CONTA CORRENTE");
            ContaBancaria contaC = new ContaCorrente(numeroConta, nomeTitularConta);
            rodarFluxoContasBancarias(contaC);
        }else if(tipoConta == 2){
            out.println("CONTA POUPANÇA");
            ContaBancaria contaP = new ContaPoupanca(numeroConta,
                    nomeTitularConta);
            rodarFluxoContasBancarias(contaP);
        }else if(tipoConta == 3){
            out.println("CONTA SALÁRIO");
            ContaBancaria contaS = new ContaSalario(numeroConta,
                    nomeTitularConta);
            rodarFluxoContasBancarias(contaS);
        }
    }

    public static void rodarFluxoContasBancarias(ContaBancaria conta){
        int paradaFluxo = 0;
        while (paradaFluxo == 0) {
            int servico;
            do {
                mostrarMenuSecundarioBancoInterface();
                out.print("INFORME SUA ESCOLHA: ");
                servico = entradaInteira();
            } while (servico != 1 && servico != 2 &&
                    servico != 3 && servico != 4);
            switch (servico) {
                case 1:
                    depositar(conta);
                    break;
                case 2:
                    sacar(conta);
                    break;
                case 3:
                    verExtrato(conta);
                    break;
                case 4:
                    out.println("VOLTAR");
                    out.println();
                    paradaFluxo = 1;
            }
        }
    }

    public static void depositar(ContaBancaria contaBancaria){
        out.print("INFORME O VALOR DO DEPÓSITO: R$ ");
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
