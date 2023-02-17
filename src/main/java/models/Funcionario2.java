package main.java.models;

public abstract class Funcionario2 {
    public String nome;
    public int totalHoras;
    public double valorHoras;

    public Funcionario2(String nome, int totalHoras, double valorHoras){
        this.nome = nome;
        this.totalHoras = totalHoras;
        this.valorHoras = valorHoras;
    }

   public abstract double retornaValorTotal();

    public abstract String mostrarRelatorio();

}
