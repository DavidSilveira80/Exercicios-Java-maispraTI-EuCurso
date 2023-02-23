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

            out.println(rValorDasMacas(quantidadeMacas,
                    calcularValorTotalMacas(quantidadeMacas)));

            option = informarFluxo1E2();
        }while(option != 2);
    }

    //------------------------------------MÉTODOS AUXILIARES---------------------------------------------------

    public static String rValorDasMacas(int macas, double valorTotal) {

        return String.format("O VALOR TOTAL DAS %d MAÇÃS É DE R$ %.2f\n", macas, valorTotal);
   }

   public static double calcularValorTotalMacas(int quantidadeDeMacas){
        double valorApartirDeUmaDuzia = 0.25; double valorAbaixoDeUmaDuzia = 0.30;

        double total = 0.0;
        if (quantidadeDeMacas >= 12){
            total = quantidadeDeMacas * valorApartirDeUmaDuzia;

        }else if(quantidadeDeMacas < 12){
            total = quantidadeDeMacas * valorAbaixoDeUmaDuzia;
        }
        return total;
   }

   public static void chamadaExercicio2(){
       out.println("\nEXERCÍCIO 2\n");
       executarExercicio2();
   }

}
