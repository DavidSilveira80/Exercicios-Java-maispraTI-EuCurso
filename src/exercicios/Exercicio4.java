package exercicios;

import models.Jogador;

import java.util.Scanner;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Menus.mostrarMenuJogador;

public class Exercicio4 {
    public static void executarExercicio4Poo1Jogador() {
        Scanner entrada = new Scanner(System.in);
        out.println("""
                 Criar uma classe Jogador que tenha as propriedades nome, gols, assistências.
                 E os métodos adicionarGol e adicionarAssistencia que receba como argumento os
                 quantidade de gols/assistências.
                 Também criar dois métodos  para ver o número de gols e assistências.
                """);
        out.println();
        out.print("INFORME O NOME DO JOGADOR: ");
        String nome = entrada.nextLine();
        Jogador jogador = new Jogador(nome);

        int loop = 0;
        while (loop == 0) {
            int option;
            do {
                out.println();
                out.println("JOGADOR: " + jogador.getNomeJogador());
                mostrarMenuJogador();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            } while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6);
            switch (option) {
                case 1:
                    out.println();
                    out.println("ADICIONAR GOLS.");
                    out.println();
                    out.print("INFORME QUANTOS GOLS QUER ADICIONAR: ");
                    int gol = entradaInteira();
                    jogador.adicionarGol(gol);
                    break;
                case 2:
                    out.println();
                    out.println("ADICIONAR ASSISTÊNCIAS.");
                    out.println();
                    out.print("INFORME QUANTAS ASSISTÊNCIAS QUER ADICIONAR: ");
                    int assistencia = entradaInteira();
                    jogador.adicionarAssistencia(assistencia);
                    break;
                case 3:
                    out.println();
                    out.println("MOSTRAR NÚMERO DE GOLS.");
                    out.println();
                    jogador.mostrarNumerosDeGols();
                    break;
                case 4:
                    out.println();
                    out.println("MOSTRAR NÚMERO DE ASSISTÊNCIAS.");
                    out.println();
                    jogador.mostrarNumeroDeAssistencias();
                    break;
                case 5:
                    out.println();
                    out.println("MOSTRAR NÚMERO DE GOLS E ASSISTÊNCIAS.");
                    out.println();
                    jogador.mostrarNumeroDeGolsEAssistencias();
                    break;
                case 6:
                    out.println();
                    out.println("SAINDO.");
                    loop = 1;
                    break;
            }
        }
    }
}
