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
        System.out.println();
        System.out.println("ADICIONANDO " + gols + " GOL(S).");
    }

    public void adicionarAssistencia(int assistencia){
        this.assistencia += assistencia;
        System.out.println();
        System.out.println("ADICIONANDO " + assistencia + " ASSITÊNCIA(S).");
    }

    public void mostrarNumerosDeGols(){
        System.out.println("JOGADOR " + this.nomeJogador + " MARCOU: ");
        System.out.println("NÚMERO DE GOLS " + this.gols);
    }

    public void mostrarNumeroDeAssistencias(){
        System.out.println("JOGADOR " + this.nomeJogador + " FEZ: ");
        System.out.println("NÚMERO DE ASSISTÊNCIAS " + this.assistencia);
    }
}
