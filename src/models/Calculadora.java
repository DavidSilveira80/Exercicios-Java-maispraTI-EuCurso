package models;

import utils.Entradas;

public class Calculadora {

    public static void somar(){
        System.out.print("INFORME O PRIMEIRO NÚMERO: ");
        int a = Entradas.entradaInteira();
        System.out.print("IFORME O PRIMEIRO NÚMERO: ");
        int b = Entradas.entradaInteira();
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    public static void subtrair(){
        System.out.print("INFORME O PRIMEIRO NÚMERO: ");
        int a = Entradas.entradaInteira();
        System.out.print("IFORME O PRIMEIRO NÚMERO: ");
        int b = Entradas.entradaInteira();
        System.out.printf("%d - %d = %d\n", a, b, a - b);
    }

    public static void multiplicar(){
        System.out.print("INFORME O PRIMEIRO NÚMERO: ");
        int a = Entradas.entradaInteira();
        System.out.print("IFORME O PRIMEIRO NÚMERO: ");
        int b = Entradas.entradaInteira();
        System.out.printf("%d X %d = %d\n", a, b, a * b);
    }

    public static void dividir(){
        System.out.print("INFORME O PRIMEIRO NÚMERO: ");
        int a = Entradas.entradaInteira();
        System.out.print("IFORME O PRIMEIRO NÚMERO: ");
        int b = Entradas.entradaInteira();
        try {
            double divisao = a / b;
            System.out.printf("%d / %d = %.0f\n", a, b, divisao);
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("NÃO É POSSÍVEL REALIZAR UMA DIVISÃO POR ZERO.");
        }
    }
}
