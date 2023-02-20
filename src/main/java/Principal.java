import models.MinhaExceptionExercicio10;



import static utils.Entradas.entradaInteira;
import static java.lang.System.out;
import static utils.MenuPrincipal.executarMenu;

public class Principal {

    public static void main(String[] args) throws MinhaExceptionExercicio10 {
       excutarLoop();
    }

    //--------------------------------Métodos auxiliares---------------------------------------------------
    public static void excutarLoop(){
        int parada = 0;
        while (parada == 0) {
            int option;
            do {
                utils.Menus.mostrarMenuPrincipal();

                option = entradaInteira();
                if (option > 18 || option < 0) {
                    pararTelaOpcaoInvalida();

                    parada = 0;
                } else if (option == 18) {
                    out.println("SAINDO.");
                    parada = 1;
                }else{
                    executarMenu(option);
                }
            } while (option != 18);
        }
    }

    public static void pararTelaOpcaoInvalida(){
        int prosseguir;
        do{
            out.println("OPÇÃO INVÁLIDA. TENTE OUTRA VEZ.");
            out.print("PARA PROSSEGUIR DIGITE 1: ");
            prosseguir = entradaInteira();
        }while(prosseguir != 1);
    }
}
