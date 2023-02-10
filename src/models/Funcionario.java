package models;

import static java.lang.System.out;

public class Funcionario {
    private String nome, funcao, setor;

    public Funcionario(String nome, String funcao, String setor){
        this.nome = nome;
        this.funcao = funcao;
        this.setor = setor;
    }

    public void mostrarFuncionario(){
        out.println();
        out.println("DESCRIÇÃO DO FUNCIONÁRIO");
        out.println();
        out.printf("NOME: %s\n", this.nome);
        out.printf("FUNÇÂO: %s\n", this.funcao);
        out.printf("SETOR: %s\n", this.setor);
    }
}
