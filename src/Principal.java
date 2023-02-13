import models.MinhaExceptionExercicio10;
import utils.Menus;


import static utils.Entradas.entradaInteira;
import static java.lang.System.out;
import static utils.Exercicios.*;

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
                    option != 12 && option != 13 && option != 14 && option != 15);
            switch(option){
                case 1:
                    out.println();
                    out.println("EXERCÍCIO 1");
                    executarExercicio1();
                    break;
                case 2:
                    out.println();
                    out.println("EXERCÍCIO 2");
                    executarExercicio2();
                    break;
                case 3:
                    out.println();
                    out.println("EXERCÍCIO 3");
                    executarExercicio3();
                    break;
                case 4:
                    out.println("EXERCÍCIO POO 1");
                    out.println();
                    executarExercicioPoo1Jogador();
                    break;
                case 5:
                    out.println("EXERCÍCIO POO 2");
                    out.println();
                    executarExercicioPoo2Aluno();
                    break;
                case 6:
                    out.println("EXERCÍCIO P00 3");
                    out.println();
                    executarExercicioPoo3Aluno2();
                    break;
                case 7:
                    out.println("EXERCÍCIO POO 4");
                    out.println();
                    executarExercicioPoo4Pedido();
                    break;
                case 8:
                    out.println("EXERCÍCIO POO 5");
                    out.println();
                    executarExercicioPoo5Calculadora();
                    break;
                case 9:
                    out.println("EXERCÍCIO POO 6");
                    out.println();
                    executarExercicioPoo6Funcionario1();
                    break;
                case 10:
                    out.println("EXERCÍCIO POO 7");
                    out.println();
                    executarExercicioPoo7Funcionario2();
                    break;
                case 11:
                    out.println("EXERCÍCIO POO 8");
                    out.println();
                    executarExercicioPoo8Animal();
                    out.println();
                    break;
                case 12:
                    out.println("EXERCÍCIO POO 9");
                    out.println();
                    executarExercicioPoo9InterfaceBanco();
                    out.println();
                    break;
                case 13:
                    out.println("EXERCÍCIO POO 10");
                    executarExercicioPoo10Excecao1();

                    break;
                case 14:
                    out.println("EXERCÍCIO POO 11");
                    executarExercicioPoo11Excecao2();
                    break;
                case 15:
                    out.println("SAINDO.");
                    loop = 1;
                    break;
            }
        }
    }
}
