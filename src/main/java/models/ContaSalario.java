package models;

public class ContaSalario extends ContaCorrente{
    private int numeroDaConta;
    private String nomeDoTitular;
    private double saldo;

    final double taxaDeSaque = 0.0;
    final double acrescimoDeDeposito = 0.0;


    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
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
