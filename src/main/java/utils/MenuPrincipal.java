package utils;

import exercicios.*;
import models.MinhaExceptionExercicio10;

import java.util.HashMap;
import java.util.Map;


import static exercicios.Exercicio13.chamadaExercicio13;


public class MenuPrincipal {
    public static void executarMenu(int option) {
        Map<Integer, Runnable> chamadas = new HashMap<>();

        adicionarChamadasExercicios(chamadas);

        chamarExercicios(chamadas, option);
    }
    //-----------------------------------------Métodos auxiliares-------------------------------------------------------
    // :: expressão lambda que faz referência ao método que está em outra Classe
    public static void adicionarChamadasExercicios(Map<Integer, Runnable> chamadas){
        chamadas.put(1, Exercicio1::chamadaExercicio1);  chamadas.put(7, Exercicio7::chamadaExercicio7);
        chamadas.put(2, Exercicio2::chamadaExercicio2);  chamadas.put(8, Exercicio8::chamadaExercicio8);
        chamadas.put(3, Exercicio3::chamadaExercicio3);  chamadas.put(9, Exercicio9::chamadaExercicio9);
        chamadas.put(4, Exercicio4::chamadaExercicio4);  chamadas.put(10, Exercicio10::chamadaExercicio10);
        chamadas.put(5, Exercicio5::chamadaExercicio5);  chamadas.put(11, Exercicio11::chamadaExercicio11);
        chamadas.put(6, Exercicio6::chamadaExercicio6);   chamadas.put(12, Exercicio12::chamadaExercicio12);
        chamadas.put(14, Exercicio14::chamadaExercicio14);  chamadas.put(16, Exercicio16::chamadaExercicio16);
        chamadas.put(15, Exercicio15::chamadaExercicio15);  chamadas.put(17, Exercicio17::chamadaExercicio17);

        // Aqui a ide pediu para fazer o try catch pra tratar a exception simulada
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
