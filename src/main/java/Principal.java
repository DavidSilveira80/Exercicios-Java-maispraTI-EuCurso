import main.java.models.MinhaExceptionExercicio10;

import static utils.Entradas.entradaInteira;
import static utils.MenuPrincipal.executarMenu;

public class Principal {

    public static void main(String[] args) throws MinhaExceptionExercicio10 {
       excutarLoop();
    }



    //--------------------------------Métodos auxiliares---------------------------------------------------
    public static void excutarLoop() throws MinhaExceptionExercicio10 {
        int loop = 0;
        while (loop == 0) {
            int option;
            do {
                utils.Menus.mostrarMenuPrincipal();

                option = entradaInteira();
               loop = executarMenu(option);
            } while (option != 18);
        }
    }
}
