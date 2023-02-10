package models;

import static utils.Entradas.entradaInteira;

import static java.lang.System.out;

public class Calculadora {

    public static void somar(){
        out.print("INFORME O PRIMEIRO NÚMERO: ");
        int a = entradaInteira();
        out.print("IFORME O PRIMEIRO NÚMERO: ");
        int b = entradaInteira();
        out.printf("%d + %d = %d\n", a, b, a + b);
    }

    public static void subtrair(){
        out.print("INFORME O PRIMEIRO NÚMERO: ");
        int a = entradaInteira();
        out.print("IFORME O PRIMEIRO NÚMERO: ");
        int b = entradaInteira();
        out.printf("%d - %d = %d\n", a, b, a - b);
    }

    public static void multiplicar(){
        out.print("INFORME O PRIMEIRO NÚMERO: ");
        int a = entradaInteira();
        out.print("IFORME O PRIMEIRO NÚMERO: ");
        int b = entradaInteira();
        out.printf("%d X %d = %d\n", a, b, a * b);
    }

    public static void dividir(){
        out.print("INFORME O PRIMEIRO NÚMERO: ");
        int a = entradaInteira();
        out.print("IFORME O PRIMEIRO NÚMERO: ");
        int b = entradaInteira();
        try {
            double divisao = a / b;
            out.printf("%d / %d = %.0f\n", a, b, divisao);
        } catch (ArithmeticException e) {
            out.println();
            out.println("NÃO É POSSÍVEL REALIZAR UMA DIVISÃO POR ZERO.");
        }
    }
}
