package models;

import java.util.Locale;

public class Aluno2 {
    private String nome;
    private int matricula;
    private double nota1, nota2, nota3;
    private double somatorio = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
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
                """, this.nome, this.matricula, this.nota1, this.nota2, this.nota3);
    }
}
