package utils;

import models.Aluno2;

import java.util.Scanner;

public class Entradas {

    public static int entradaInteira() {
        Scanner entrada = new Scanner(System.in);
        boolean continuarLeitura = true;
        int numero = 0;
        while (continuarLeitura) {
            try {
                numero = Integer.parseInt(entrada.nextLine());
                continuarLeitura = false;
            } catch (NumberFormatException e) {
                System.out.println("ENTRADA COM VALOR INVÁLIDO. TENTE NOVAMENTE.");
            }
        }
        return numero;
    }

    public static double entradaDouble() {
        Scanner entrada = new Scanner(System.in);
        boolean continuarLeitura = true;
        double entraDouble = 0.0;
        while (continuarLeitura) {
            try {
                entraDouble = Double.parseDouble(entrada.nextLine());
                continuarLeitura = false;
            } catch (NumberFormatException e) {
                System.out.println("ENTRADA COM VALOR INVÁLIDO. TENTE NOVAMENTE.");
            }
        }
        return entraDouble;
    }

    //FUNÇÃO RECURSIVA
    public static double validarNotas(double nota, Aluno2 aluno) {

        if(aluno.getSomatorio() + nota >= 100){
            System.out.println("NÃO FOI POSSÍVEL ADICIONAR NOTA. SOMATÓRIO MAIOR OU IGUAL À 100 PONTOS.");
            System.out.print("INFORME A NOTA NOVAMENTE: ");
            nota = entradaDouble();
            nota = validarNotas(nota, aluno);
        }else{
            aluno.setSomatorio(aluno.getSomatorio() + nota);
        }
        return nota;
    }
}
