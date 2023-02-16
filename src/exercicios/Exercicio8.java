package exercicios;

import models.Calculadora;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Menus.mostrarmenuCalculadora;

public class Exercicio8 {
    public static void executarExercicio8Poo5Calculadora() {
        out.println();
        out.println("      CALCULADORA PARA 2 DIGITOS        ");
        out.println();
        out.println("""
                Crie uma classe Calculadora com os métodos das operações matemáticas
                estáticos.
                Soma, Subtração, Multiplicação e Divisão.
                Use essa classe sem instanciar ela.
                """);
        out.println();
        int loop = 0;
        int option;
        while (loop == 0) {
            do {
                mostrarmenuCalculadora();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();

                switch (option) {
                    case 1:
                        out.println("ADIÇÃO");
                        Calculadora.somar();
                        break;
                    case 2:
                        out.println("SUBTRAÇÃO");
                        Calculadora.subtrair();
                        break;
                    case 3:
                        out.println("MULTIPLICAÇÃO");
                        Calculadora.multiplicar();
                        break;
                    case 4:
                        out.println("DIVISÃO");
                        Calculadora.dividir();
                        break;
                    case 5:
                        out.println("SAINDO");
                        loop = 1;
                        break;
                    default:
                        out.println("OPÇÃO INVÁLIDA");
                }
            } while (option != 5);
        }
    }
}
