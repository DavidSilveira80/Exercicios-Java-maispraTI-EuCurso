package utils;

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

public class MenuPrincipal {
    public static int executarMenu(int option) throws main.java.models.MinhaExceptionExercicio10 {
        switch (option) {
            case 1:
                chamadaExercicio1();
                return 0;

            case 2:
                chamadaExercicio2();
                return 0;

            case 3:
                chamadaExercicio3();
                return 0;

            case 4:
                chamadaExercicio4();
                return 0;

            case 5:
                chamadaExercicio5();
                return 0;

            case 6:
                chamadaExercicio6();
                return 0;

            case 7:
                chamadaExercicio7();
                return 0;

            case 8:
                chamadaExercicio8();
                return 0;

            case 9:
                chamadaExercicio9();
                return 0;

            case 10:
                chamadaExercicio10();
                return 0;

            case 11:
                chamadaExercicio11();
                return 0;

            case 12:
                chamadaExercicio12();
                return 0;

            case 13:
                chamadaExercicio13();
                return 0;

            case 14:
                chamadaExercicio14();
                return 0;

            case 15:
                chamadaExercicio15();
                return 0;

            case 16:
                chamadaExercicio16();
                return 0;

            case 17:
                chamadaExercicio17();
                return 0;

            case 18:
                out.println("SAINDO");
                return 1;

            default:
                mostrandoOpcaoInvalida();
                break;
        }
        return 0;
    }
    //-----------------------------------------Métodos auxiliares-------------------------------------------------------
    public static void mostrandoOpcaoInvalida(){
        int encerra;
        do{
            out.println("OPÇÃO INVÁLIDA.");
            out.print("PARA CONTINUAR DIGITE 1: ");
            encerra = entradaInteira();
        }while(encerra != 1);
    }
}
