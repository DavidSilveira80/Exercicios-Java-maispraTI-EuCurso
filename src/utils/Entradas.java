package utils;

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
}
