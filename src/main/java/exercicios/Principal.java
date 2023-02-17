package exercicios;

import main.java.models.MinhaExceptionExercicio10;

import static exercicios.Exercicio1.chamadaExercicio1;
import static exercicios.Exercicio10.chamadaExercicio10;
import static exercicios.Exercicio11.chamadaExercicio11;
import static exercicios.Exercicio12.chamadaExercicio12;
import static exercicios.Exercicio13.chamadaExercicio13;
import static exercicios.Exercicio14.chamadaExercicio14;
import static exercicios.Exercicio15.chamadaExercicio15;
import static exercicios.Exercicio16.chamadaExercicio16;
import static exercicios.Exercicio17.chamadaExercicio17;
import static exercicios.Exercicio2.chamadaExercicio2;
import static exercicios.Exercicio3.chamadaExercicio3;
import static exercicios.Exercicio4.chamadaExercicio4;
import static exercicios.Exercicio5.chamadaExercicio5;
import static exercicios.Exercicio6.chamadaExercicio6;
import static exercicios.Exercicio7.chamadaExercicio7;
import static exercicios.Exercicio8.chamadaExercicio8;
import static exercicios.Exercicio9.chamadaExercicio9;
import static java.lang.System.out;
import static utils.Entradas.entradaInteira;

public class Principal {

    public static void main(String[] args) throws MinhaExceptionExercicio10 {
        int loop = 0;
        while (loop == 0) {
            int option;
            do {
                utils.Menus.mostrarMenuPrincipal();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
                switch (option) {
                    case 1:
                        chamadaExercicio1();
                        break;
                    case 2:
                        chamadaExercicio2();
                        break;
                    case 3:
                        chamadaExercicio3();
                        break;
                    case 4:
                        chamadaExercicio4();
                        break;
                    case 5:
                        chamadaExercicio5();
                        break;
                    case 6:
                        chamadaExercicio6();
                        break;
                    case 7:
                        chamadaExercicio7();
                        break;
                    case 8:
                        chamadaExercicio8();
                        break;
                    case 9:
                        chamadaExercicio9();
                        break;
                    case 10:
                        chamadaExercicio10();
                        break;
                    case 11:
                        chamadaExercicio11();
                        break;
                    case 12:
                        chamadaExercicio12();
                        break;
                    case 13:
                        chamadaExercicio13();
                        break;
                    case 14:
                        chamadaExercicio14();
                        break;
                    case 15:
                        chamadaExercicio15();
                        break;
                    case 16:
                        chamadaExercicio16();
                        break;
                    case 17:
                        chamadaExercicio17();
                        break;
                    case 18:
                        loop = 1;
                        break;
                    default:
                        out.println("OPÇÃO INVÁLIDA.");
                        break;
                }
            } while (option != 18);
        }
    }
    //--------------------------------Métodos auxiliares---------------------------------------------------
}
