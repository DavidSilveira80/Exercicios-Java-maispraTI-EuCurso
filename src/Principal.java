import models.MinhaExceptionExercicio10;
import utils.Menus;

import static utils.Entradas.entradaInteira;
import static java.lang.System.out;

import static exercicios.Exercicio1.executarExercicio1;
import static exercicios.Exercicio2.executarExercicio2;
import static exercicios.Exercicio3.executarExercicio3;
import static exercicios.Exercicio4.executarExercicio4Poo1Jogador;
import static exercicios.Exercicio5.executarExercicio5Poo2Aluno;
import static exercicios.Exercicio6.executarExercicio6Poo3Aluno2;
import static exercicios.Exercicio7.executarExercicio7Poo4Pedido;
import static exercicios.Exercicio8.executarExercicio8Poo5Calculadora;
import static exercicios.Exercicio9.executarExercicio9Poo6Funcionario1;
import static exercicios.Exercicio10.executarExercicio10Poo7Funcionario2;
import static exercicios.Exercicio11.executarExercicio11Poo8Animal;
import static exercicios.Exercicio12.executarExercicio12Poo9InterfaceBanco;
import static exercicios.Exercicio13.executarExercicio13Poo10Excecao1;
import static exercicios.Exercicio14.executarExercicio14Poo11Excecao2;
import static exercicios.Exercicio15.executarExercicio15StreamsFrutas;
import static exercicios.Exercicio16.executarExercicio16Map1Aluno;
import static exercicios.Exercicio17.executarExercicio17PreSistemaCompra;

public class Principal {

    public static void main(String[] args) throws MinhaExceptionExercicio10 {
        int loop = 0;
        while(loop == 0){
            int option;
            do{
                Menus.mostrarMenuPrincipal();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6
                   && option != 7 && option != 8 && option != 9 && option != 10 && option != 11 &&
                    option != 12 && option != 13 && option != 14 && option != 15 && option != 16
                    && option != 17 && option != 18);
            switch(option){
                case 1:
                    out.println("\nEXERCÍCIO 1\n");
                    executarExercicio1();
                    break;
                case 2:
                    out.println("\nEXERCÍCIO 2\n");
                    executarExercicio2();
                    break;
                case 3:
                    out.println("\nEXERCÍCIO 3\n");
                    executarExercicio3();
                    break;
                case 4:
                    out.println("\nEXERCÍCIO POO 1\n");
                    executarExercicio4Poo1Jogador();
                    break;
                case 5:
                    out.println("\nEXERCÍCIO POO 2\n");
                    executarExercicio5Poo2Aluno();
                    break;
                case 6:
                    out.println("\nEXERCÍCIO P00 3\n");
                    executarExercicio6Poo3Aluno2();
                    break;
                case 7:
                    out.println("\nEXERCÍCIO POO 4\n");
                    executarExercicio7Poo4Pedido();
                    break;
                case 8:
                    out.println("\nEXERCÍCIO POO 5\n");
                    executarExercicio8Poo5Calculadora();
                    break;
                case 9:
                    out.println("\nEXERCÍCIO POO 6\n");
                    executarExercicio9Poo6Funcionario1();
                    break;
                case 10:
                    out.println("\nEXERCÍCIO POO 7\n");
                    executarExercicio10Poo7Funcionario2();
                    break;
                case 11:
                    out.println("\nEXERCÍCIO POO 8\n");
                    executarExercicio11Poo8Animal();
                    out.println();
                    break;
                case 12:
                    out.println("\nEXERCÍCIO POO 9\n");
                    executarExercicio12Poo9InterfaceBanco();
                    out.println();
                    break;
                case 13:
                    out.println("\nEXERCÍCIO POO 10\n");
                    executarExercicio13Poo10Excecao1();
                    break;
                case 14:
                    out.println("\nEXERCÍCIO POO 11\n");
                    executarExercicio14Poo11Excecao2();
                    break;
                case 15:
                    out.println("\nEXERCÍCIO STREAMS 1\n");
                    executarExercicio15StreamsFrutas();
                    break;
                case 16:
                    out.println("\nEXERCÍCIO STREAM 2\n");
                    executarExercicio16Map1Aluno();
                    break;
                case 17:
                    out.println("\nEXERCÍCIO PRÉ-SISTEMA COMPRA");
                    executarExercicio17PreSistemaCompra();
                    break;
                case 18:
                    out.println("SAINDO.");
                    loop = 1;
                    break;
            }
        }
    }
}
