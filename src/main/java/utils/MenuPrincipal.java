package utils;

import main.java.models.MinhaExceptionExercicio10;
import java.util.HashMap;
import java.util.Map;

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
    public static void executarMenu(int option) {
        Map<Integer, Runnable> chamadas = new HashMap<>();

        adicionarChamadasExercicios(chamadas);

        chamarExercicios(chamadas, option);
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

    public static void adicionarChamadasExercicios(Map<Integer, Runnable> chamadas){
        chamadas.put(1, () -> chamadaExercicio1());  chamadas.put(7, () -> chamadaExercicio7());
        chamadas.put(2, () -> chamadaExercicio2());  chamadas.put(8, () -> chamadaExercicio8());
        chamadas.put(3, () -> chamadaExercicio3());  chamadas.put(9, () -> chamadaExercicio9());
        chamadas.put(4, () -> chamadaExercicio4());  chamadas.put(10, () -> chamadaExercicio10());
        chamadas.put(5, () -> chamadaExercicio5());  chamadas.put(11, () -> chamadaExercicio11());
        chamadas.put(6, () -> chamadaExercicio6());   chamadas.put(12, () -> chamadaExercicio12());
        chamadas.put(14, () -> chamadaExercicio14());  chamadas.put(16, () -> chamadaExercicio16());
        chamadas.put(15, () -> chamadaExercicio15());  chamadas.put(17, () -> chamadaExercicio17());

        chamadas.put(13, () -> {
            try {
                chamadaExercicio13();
            } catch (MinhaExceptionExercicio10 e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void chamarExercicios(Map<Integer, Runnable> chamadas, int option){
          chamadas.get(option).run();
    }
}
