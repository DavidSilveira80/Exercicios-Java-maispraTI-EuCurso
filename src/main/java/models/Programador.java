package models;

import java.util.Locale;

public class Programador extends Funcionario2 {
    final double BONIFICACAO = 0.05;

    public Programador(String nome, int totalHoras, double valorHoras){
        super(nome, totalHoras, valorHoras);
        this.nome = nome;
        this.totalHoras = totalHoras;
        this.valorHoras = valorHoras;
    }

    @Override
    public double retornaValorTotal() {
        double pagamentoTotalhoras = this.totalHoras * this.valorHoras;
        return pagamentoTotalhoras + (pagamentoTotalhoras * this.BONIFICACAO);
    }

    @Override
    public String mostrarRelatorio() {
        Locale.setDefault(Locale.US);
        return String.format("""
                
                PROFISSIONAL : %s
                PERCENTUAL DE BONIFICAÇÃO: 5 PORCENTO
                TOTAL HORAS TRABALHADAS: %d
                VALOR POR HORA TRABALHADA: R$ %.2f
                TOTAL COM BONIFICAÇÃO: R$ %.2f 
                """, this.nome, this.totalHoras, this.valorHoras, retornaValorTotal());
    }
}
