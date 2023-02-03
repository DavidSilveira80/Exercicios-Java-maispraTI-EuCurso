import models.Pedidos;
import utils.Menus;

import static utils.Entradas.entradaInteira;

public class Principal {

    public static void main(String[] args){
        int loop = 0;
        while(loop == 0){
            int option;
            do{
                Menus.mostrarMenuPrincipal();
                System.out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6
                   && option != 7 && option != 8 && option != 9);
            switch(option){
                case 1:
                    System.out.println();
                    System.out.println("EXERCÍCIO 1");
                    Exercicios.mostrarResultadoExercicio1();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("EXERCÍCIO 2");
                    Exercicios.mostrarResultadoExercicio2();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("EXERCÍCIO 3");
                    Exercicios.mostrarResultadoExercicio3();
                    break;
                case 4:
                    System.out.println("EXERCÍCIO POO 1");
                    System.out.println();
                    Exercicios.mostrarExercicioPoo1Jogador();
                    break;
                case 5:
                    System.out.println("EXERCÍCIO POO 2");
                    System.out.println();
                    Exercicios.mostrarExercicioPoo2Aluno();
                    break;
                case 6:
                    System.out.println("EXERCÍCIO P00 3");
                    System.out.println();
                    Exercicios.mostrarExercicioPoo3Aluno2();
                    break;
                case 7:
                    System.out.println("EXERCÍCIO POO 4");
                    System.out.println();
                    Exercicios.mostrarExecucaoExercicioPoo4Pedido();
                    break;
                case 8:
                    System.out.println("EXERCÍCIO POO 5");
                    System.out.println();
                    Exercicios.mostrarExecucaoExercicioPoo5Calculadora();
                    break;
                case 9:
                    System.out.println("SAINDO.");
                    loop = 1;
                    break;
            }
        }
    }
}
