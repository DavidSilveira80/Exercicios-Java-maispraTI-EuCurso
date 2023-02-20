package models;

public interface ContaBancaria {

    void depositar(double valorDeposito);

    public String verExtrato();

    public void sacar(double valorsaque);
}
