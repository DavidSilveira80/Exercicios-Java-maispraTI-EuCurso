package exercicios;

import models.Jogador;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Entradas.entradaString;
import static utils.Menus.mostrarEnunciadoExercicio4;
import static utils.Menus.mostrarMenuJogador;

public class Exercicio4 {
    public static void executarExercicio4Poo1Jogador() {
        mostrarEnunciadoExercicio4();

        Jogador jogador = instanciarJogador();

        int loop = 0;
        while (loop == 0) {
            int acao;
            do {
                out.println("\nJOGADOR: " + jogador.getNomeJogador());
                mostrarMenuJogador();
                out.print("INFORME SUA ESCOLHA: ");
                acao = entradaInteira();

                switch (acao) {
                    case 1:
                        adicionarGols(jogador);
                        break;
                    case 2:
                        adicionarAssistencia(jogador);
                        break;
                    case 3:
                        out.println("\nMOSTRAR NÚMERO DE GOLS.\n");
                        jogador.mostrarNumerosDeGols();
                        break;
                    case 4:
                        out.println("\nMOSTRAR NÚMERO DE ASSISTÊNCIAS.\n");
                        jogador.mostrarNumeroDeAssistencias();
                        break;
                    case 5:
                        out.println("\nMOSTRAR NÚMERO DE GOLS E ASSISTÊNCIAS.\n");
                        jogador.mostrarNumeroDeGolsEAssistencias();
                        break;
                    case 6:
                        out.println("\nSAINDO.\n");
                        loop = 1;
                        break;
                    default:
                        out.println("\nOPÇÃO INVÁLIDA\n");
                }
            } while (acao != 6);
        }
    }
//---------------------------------MÉTODOS AUXILIARES------------------------------------
    public static Jogador instanciarJogador(){
        out.print("\nINFORME O NOME DO JOGADOR: ");
        String nome = entradaString();
        Jogador jogador = new Jogador(nome);
        return jogador;
    }

    public static void adicionarGols(Jogador jogador){
        out.println("\nADICIONAR GOLS.\n");
        out.print("INFORME QUANTOS GOLS QUER ADICIONAR: ");
        int gol = entradaInteira();
        jogador.adicionarGol(gol);
    }

    public static void adicionarAssistencia(Jogador jogador){
        out.println("\nADICIONAR ASSISTÊNCIAS.\n");
        out.print("INFORME QUANTAS ASSISTÊNCIAS QUER ADICIONAR: ");
        int assistencia = entradaInteira();
        jogador.adicionarAssistencia(assistencia);
    }

    public static void chamadaExercicio4(){
        out.println("\nEXERCÍCIO POO 1\n");
        executarExercicio4Poo1Jogador();
    }
}
