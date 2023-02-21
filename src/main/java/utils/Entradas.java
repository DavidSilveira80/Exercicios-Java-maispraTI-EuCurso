package utils;

import static java.lang.System.out;
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
                out.println("ENTRADA COM VALOR INVÁLIDO. TENTE NOVAMENTE.");
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
                out.println("ENTRADA COM VALOR INVÁLIDO. TENTE NOVAMENTE.");
            }
        }
        return entraDouble;
    }

    public static String entradaString(){
        Scanner entrada =  new Scanner(System.in);
        return entrada.nextLine();
    }

    public static int informarFluxo1E2(){
        out.print("\nQUER CONTINUAR(1-SIM/2-NÃO): ");
        return entradaInteira();
    }
}
