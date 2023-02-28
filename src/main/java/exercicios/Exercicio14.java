package exercicios;

import java.util.List;
import static java.lang.System.out;
import static utils.Entradas.entradaInteira;

public class Exercicio14 {
    public static void executarExercicio14Poo11Excecao2() {
        out.println("""
                O código abaixo lançará algumas exceções. Trate eles de uma forma que o código
                continuará com a próxima etapa. (Deve-se usar a estrutura try-catch)
                                            
                List<String> lista = null;
                lista.add("Produto 1");
                lista.get(2);
                lista.add("Produto 2");
                for(String produto : lista) {
                    out.println(produto);
                }
                """);

        List<String> lista = null;
        try {
            lista.add("Produto 1");
            lista.get(2);
            lista.add("Produto 2");
            for (String produto : lista) {
                out.println(produto);
            }
        } catch (NullPointerException e) {
            out.println("SEU CÓDIGO ESTÁ GERANDO UM ERRO " + e.getMessage());
        }

        out.println();
        int option;
        do{
            out.println("""
                O TRATAMENTO QUE FOI DADO PARA O RESULTADO ACIMA FOI O SEGUINTE: 
                                
                List<String> lista = null;
                        try {
                            lista.add("Produto 1");
                            lista.get(2);
                            lista.add("Produto 2");
                            for (String produto : lista) {
                                out.println(produto);
                            }
                        }catch(NullPointerException e){
                            out.println("SEU CÓDIGO ESTÁ GERANDO UM ERRO " + e.getMessage());
                        }
                """);
            out.println();
            out.print("PARA VOLTAR DIGITE 2: ");
            option = entradaInteira();
        }while(option != 2);
    }

    //-----------------------------------Métodos auxiliares----------------------------------------------

    public static void chamadaExercicio14(){
        out.println("\nEXERCÍCIO POO 11\n");
        executarExercicio14Poo11Excecao2();
    }
}
