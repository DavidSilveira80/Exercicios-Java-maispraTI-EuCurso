import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int loop = 0;
        while(loop == 0){
            int option;
            do{
                Menus.mostrarMenuPrincipal();
                System.out.print("INFORME SUA ESCOLHA: ");
                option = entrada.nextInt();
            }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5);
            switch(option){
                case 1:
                    System.out.println();
                    System.out.println("Exercício 1");
                    Exercicios.mostrarResultadoExercicio1();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Exercício 2");
                    Exercicios.mostrarResultadoExercicio2();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Exercício 3");
                    Exercicios.mostrarResultadoExercicio3();
                    break;
                case 4:
                    System.out.println("Exercício POO 1");
                    System.out.println();

                    System.out.println();
                    Exercicios.mostrarExercicioPoo1Jogador();
                    break;
                case 5:
                    System.out.println("SAINDO.");
                    loop = 1;
                    break;
            }
        }
    }
}
