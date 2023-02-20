package models;

import static java.lang.System.out;

public  class ContaCorrente implements ContaBancaria {
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;


    final double taxaDeSaque = 10;
    final double acrescimoDeDeposito = 0.01;
    final double tetoParaAcrescimoDeposito = 10000;

    public ContaCorrente(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    @Override
    public void depositar(double valorDeposito) {
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
    public void sacar(double valorSaque) {
        if(this.saldo == 0 || this.saldo < valorSaque){
            out.println("SALDO INSUFICIENTE PARA SAQUE.");
            out.println();
        }else{
            this.saldo -= valorSaque - this.taxaDeSaque;
            out.printf("%.2f R$ SACADO COM SUCESSO.\n", valorSaque);
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
