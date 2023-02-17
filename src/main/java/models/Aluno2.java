package main.java.models;

import java.util.Locale;

public class Aluno2 {
    private String nomeAluno;
    private int matricula;
    private double nota1, nota2, nota3;
    private double somatorio = 0;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getSomatorio() {
        return somatorio;
    }

    public void setSomatorio(double somatorio) {
        this.somatorio = somatorio;
    }

    public void mostrarBoletim(){
        Locale.setDefault(Locale.US);
        System.out.printf("""
                BOLETIM ESCOLAR
                NOME DO ALUNO: %S
                NÚMERO DA MATRICULA: %d
                NOTA 1: %.1f
                NOTA 2: %.1f
                NOTA 3: %.1f
                """, this.nomeAluno, this.matricula, this.nota1, this.nota2, this.nota3);
    }
}
