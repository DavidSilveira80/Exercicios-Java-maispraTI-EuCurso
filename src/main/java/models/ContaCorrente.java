package models;

import static java.lang.System.out;
import static utils.Entradas.entradaDouble;

public class ContaCorrente implements ContaBancaria {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    final double taxaDeSaque = 10;
    final double acrescimoDeDeposito = 0.01;
    final double tetoParaAcrescimoDeposito = 10000;


    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }


    @Override
    public void depositar() {
        out.print("INFORME O VALOR DO DEPÓSITO: R$ ");
        double valorDeposito = entradaDouble();
        if(valorDeposito <= this.tetoParaAcrescimoDeposito){
            this.saldo += valorDeposito + (valorDeposito * this.acrescimoDeDeposito);
            out.printf("%.2f R$ DEPOSITADO COM SUCESSO.\n", valorDeposito);
            out.println();
        }else{
            this.saldo += valorDeposito;
            out.printf("%.2f R$ DEPOSITADO COM SUCESSO.\n", valorDeposito);
            out.println();
        }

    }

    @Override
    public void sacar() {
        out.print("INFORME O VALOR DO SAQUE: R$ ");
        double valorDoSaque = entradaDouble();
        if(this.saldo == 0 || this.saldo < valorDoSaque){
            out.println("SALDO INSUFICIENTE PARA SAQUE.");
            out.println();
        }else{
            this.saldo -= valorDoSaque - this.taxaDeSaque;
            out.printf("%.2f R$ DEPOSITADO COM SUCESSO.\n", valorDoSaque);
            out.println();
        }

    }

    @Override
    public String verExtrato() {

        return String.format("""
                CONTA Nº: %d
                TIPO DA CONTA: CORRENTE
                TITULAR DA CONTA: %s
                SALDO: R$ %.2f
                """, this.numeroDaConta, this.nomeDoTitular, this.saldo);
    }
}
