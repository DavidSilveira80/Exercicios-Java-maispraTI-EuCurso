package exercicios;

import java.util.Locale;

import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Menus.mostrarEnunciadoExercicio3;

public class Exercicio3 {
    public static void executarExercicio3() {
        Locale.setDefault(Locale.US);
        mostrarEnunciadoExercicio3();

        int option;
        do{
            out.print("INFORME O SEU SALÁRIO BRUTO: R$ ");
            double salarioBruto = entradaDouble();
            if (salarioBruto < 1000) {

                out.println(retornaSalarioELiquido(salarioBruto, 0.06));

            } else if (salarioBruto >= 1000 && salarioBruto <= 2500) {

                out.println(retornaSalarioELiquido(salarioBruto, 0.08));

            } else if (salarioBruto >= 2500 && salarioBruto <= 4800) {

                out.println(retornaSalarioELiquido(salarioBruto, 0.10));

            } else if (salarioBruto > 4800) {

                out.println(retornaSalarioELiquido(salarioBruto, 0.15));

            }
            option = informarFluxo1E2();
        }while(option != 2);
    }
//-------------------------------MÉTODOS AUXILIARES---------------------------------
    public static String retornaSalarioELiquido(double salarioBruto, double percentual){
        double salarioLiquido = salarioBruto - (salarioBruto * percentual);

        return String.format("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);
    }
}
