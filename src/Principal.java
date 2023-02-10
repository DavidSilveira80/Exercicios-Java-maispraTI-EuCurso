import utils.Menus;

import static utils.Entradas.entradaInteira;
import static utils.Exercicios.mostrarResultadoExercicio1;
import static utils.Exercicios.mostrarResultadoExercicio2;
import static utils.Exercicios.mostrarResultadoExercicio3;
import static utils.Exercicios.mostrarExercicioPoo1Jogador;
import static utils.Exercicios.mostrarExercicioPoo2Aluno;
import static utils.Exercicios.mostrarExercicioPoo3Aluno2;
import static utils.Exercicios.mostrarExecucaoExercicioPoo4Pedido;
import static utils.Exercicios.mostrarExecucaoExercicioPoo5Calculadora;


import static java.lang.System.out;

public class Principal {

    public static void main(String[] args){
        int loop = 0;
        while(loop == 0){
            int option;
            do{
                Menus.mostrarMenuPrincipal();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6
                   && option != 7 && option != 8 && option != 9);
            switch(option){
                case 1:
                    out.println();
                    out.println("EXERCÍCIO 1");
                    mostrarResultadoExercicio1();
                    break;
                case 2:
                    out.println();
                    out.println("EXERCÍCIO 2");
                    mostrarResultadoExercicio2();
                    break;
                case 3:
                    out.println();
                    out.println("EXERCÍCIO 3");
                    mostrarResultadoExercicio3();
                    break;
                case 4:
                    out.println("EXERCÍCIO POO 1");
                    out.println();
                    mostrarExercicioPoo1Jogador();
                    break;
                case 5:
                    out.println("EXERCÍCIO POO 2");
                    out.println();
                    mostrarExercicioPoo2Aluno();
                    break;
                case 6:
                    out.println("EXERCÍCIO P00 3");
                    out.println();
                    mostrarExercicioPoo3Aluno2();
                    break;
                case 7:
                    out.println("EXERCÍCIO POO 4");
                    out.println();
                    mostrarExecucaoExercicioPoo4Pedido();
                    break;
                case 8:
                    out.println("EXERCÍCIO POO 5");
                    out.println();
                    mostrarExecucaoExercicioPoo5Calculadora();
                    break;
                case 9:
                    out.println("SAINDO.");
                    loop = 1;
                    break;
            }
        }
    }
}
