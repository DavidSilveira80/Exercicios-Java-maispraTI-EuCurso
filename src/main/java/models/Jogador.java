package main.java.models;

import static java.lang.System.out;

public class Jogador {
    String nomeJogador;
    int gols, assistencia;

    public Jogador(String nomeJogador){
        this.nomeJogador = nomeJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void adicionarGol(int gol){
        this.gols += gol;
        out.println();
        out.println("ADICIONANDO " + gols + " GOL(S).");
    }

    public void adicionarAssistencia(int assistencia){
        this.assistencia += assistencia;
        out.println();
        out.println("ADICIONANDO " + assistencia + " ASSITÊNCIA(S).");
    }

    public void mostrarNumerosDeGols(){
        out.println("JOGADOR " + this.nomeJogador + " MARCOU: ");
        out.println("NÚMERO DE GOLS " + this.gols);
    }

    public void mostrarNumeroDeAssistencias(){
        out.println("JOGADOR " + this.nomeJogador + " FEZ: ");
        out.println("NÚMERO DE ASSISTÊNCIAS " + this.assistencia);
    }

    public void mostrarNumeroDeGolsEAssistencias(){
        out.println("JOGADOR " + this.nomeJogador + " FEZ: ");
        out.println("NÚMERO DE GOLS: " + this.gols);
        out.println("NÚMERO DE ASSISTÊNCIAS: " + this.assistencia);
    }
}
