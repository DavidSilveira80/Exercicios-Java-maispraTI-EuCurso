package models;

import static java.lang.System.out;

public class ContaSalario implements ContaBancaria{
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    public ContaSalario(int numeroDaConta, String nomeDoTitular) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    @Override
    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
        out.printf("%.2f R$ DEPOSITADO COM SUCESSO.\n", valorDeposito);
        out.println();
    }

    @Override
    public void sacar(double valorSaque) {
        if(this.saldo == 0 || this.saldo < valorSaque){
            out.println("SALDO INSUFICIÊNTE PARA EXECUTAR O SAQUE.");
        }else{
            this.saldo -= valorSaque;
            out.printf("%.2f R$ SACADO COM SUCESSO.\n", valorSaque);
            out.println();
        }
    }

    @Override
    public String verExtrato() {
        return String.format("""
                CONTA Nº: %d
                TIPO DA CONTA: SALÁRIO
                TITULAR DA CONTA: %s
                SALDO: R$ %.2f
                """, this.numeroDaConta, this.nomeDoTitular, this.saldo);
    }
}
