package exercicios;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Entradas.informarFluxo1E2;
import static utils.Menus.mostrarEnunciadoExercicio2;

public class Exercicio2 {
    public static void executarExercicio2() {

        mostrarEnunciadoExercicio2();
        int option;
        do{
            out.print("INFORME A QUANTIDADE DE MAÇÃS QUE VOCÊ QUER COMPRAR: ");
            int quantidadeMacas = entradaInteira();

            double valorApartirDeUmaDuzia = 0.25; double valorAbaixoDeUmaDuzia = 0.30;

            if (quantidadeMacas >= 12) {
                out.println(rValorDasMacas(quantidadeMacas, valorApartirDeUmaDuzia));

            } else {
                out.println(rValorDasMacas(quantidadeMacas, valorAbaixoDeUmaDuzia));
            }

            option = informarFluxo1E2();
        }while(option != 2);
    }
//------------------------------------MÉTODOS AUXILIARES---------------------------------------------------
   public static String rValorDasMacas(int macas, double valor) {

        return String.format("O VALOR TOTAL DAS %d MAÇÃS É DE R$ %.2f\n", macas, valor * macas);
   }

}
