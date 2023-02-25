package exercicios;

import models.Animal;
import models.Tigre;
import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Menus.mostrarEnunciadoExercicioAnimal;

public class Exercicio11 {
    public static void executarExercicio11Poo8Animal() {
        mostrarEnunciadoExercicioAnimal();

        int option;
        do{
            out.println("AQUI É UM OBJETO INSTÂNCIADO DA CLASSE ANIMAL COM SEU MÉTODO ALMENTAR(): ");
            out.println();
            Animal animal = new Animal("pica-pau", "ave", "Alpiste");
            out.println(animal);
            out.println(animal.alimentar());

            out.println("""
                                       
                AQUI É UM OBJETO INSTÂNCIADO DA CLASSE TIGRE QUE HERDA DA CLASSE ANIMAL E SOBREESCREVE
                O MÉTODO ALIMENTAR DA CLASSE ANIMAL:
                """);

            Animal tigre = new Tigre("Tigrão", "mamifero", "Carne");

            out.println(tigre);
            out.println(tigre.alimentar());
            out.println();
            out.print("PARA VOLTAR DIGITE 2: ");
            option = entradaInteira();
        }while(option != 2);
    }

    //---------------------------------------Métodos auxiliares-----------------------------------------

    public static void chamadaExercicio11(){
        out.println("\nEXERCÍCIO POO 7\n");
        executarExercicio11Poo8Animal();
        out.println();
    }
}
