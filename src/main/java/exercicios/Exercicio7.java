package exercicios;

import models.Pedidos;
import utils.Status;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Menus.*;

public class Exercicio7 {
    public static void executarExercicio7Poo4Pedido() {
        mostrarEnunciadoExercicio7();

        Pedidos pedido = new Pedidos();
        out.println();
        int option;
        int loopPrincipal = 0;
        while (loopPrincipal == 0) {
            do {
                mostrarMenuPrincipalLancheria();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            } while (option != 1 && option != 2 && option != 3 && option != 4);
            switch (option) {
                case 1:
                    out.println("FAZER PEDIDO.");

                    int loop = 0;
                    int option2;
                    int codigoItem;

                    while (loop == 0) {
                        do {

                            out.println();
                            mostrarMenuLanchesValor();
                            out.print("INFORME O CÓDIGO DO ITEM(1 - 10): ");
                            codigoItem = entradaInteira();

                        }while (codigoItem != 1 && codigoItem != 2 && codigoItem != 3 && codigoItem != 4
                                && codigoItem != 5 && codigoItem != 6 && codigoItem != 7
                                && codigoItem != 8 && codigoItem != 9 && codigoItem != 10);
                        String item;
                        double vItem;

                        item = selecionarPedidoItem(codigoItem, pedido);
                        vItem = selecionarValorItemPedido(item, pedido);

                        pedido.adicionarItens(item, vItem);
                        out.print("CONTINUAR COM O PEDIDO?(1 - SIM/ 2 - NÃO): ");
                        option2 = entradaInteira();
                        if (option2 == 2) {
                            loop = 1;
                        }
                    }
                    pedido.setStatus(Status.ANOTANDO_PEDIDO);
                    pedido.mostrarPedido(pedido);
                    break;
                case 2:

                    out.println("ALTERAR STATUS DO PEDIDO.");
                    if (pedido.itens.isEmpty()) {
                        out.println("NÃO HÁ PEDIDOS FEITOS.");
                    } else {
                        pedido.alterarStatusPedido();
                        pedido.mostrarPedido(pedido);
                    }
                    break;
                case 3:

                    out.println("GERAR NOTA DO PEDIDO");
                    if (pedido.itens.isEmpty()) {
                        out.println("NÃO HÁ PEDIDOS FEITOS.");
                    } else {
                        pedido.mostrarPedido(pedido);
                    }
                    break;
                case 4:

                    out.println("SAINDO");
                    loopPrincipal = 1;
                    break;
            }
        }
    }
//----------------------------------Métodos auxiliares--------------------------------------------------
    public static void chamadaExercicio7(){
        out.println("\nEXERCÍCIO POO 4\n");
        executarExercicio7Poo4Pedido();
    }

    public static String selecionarPedidoItem(int codigo, Pedidos pedido){
        Map<Integer, String> itens = new HashMap<>();
        itens.put(1, "X SALADA");       itens.put(6, "CACHORRO-QUENTE SIMPLES");
        itens.put(2, "X FRANGO");       itens.put(7, "CACHORRO-QUENTE DUPLO");
        itens.put(3, "X CALABRESA");    itens.put(8, "PIZZAS TODOS OS SABORES");
        itens.put(4, "X CORAÇÃO");      itens.put(9, "REFRIGERANTE");
        itens.put(5, "X BACON");        itens.put(10, "CERVEJA");

        String itemPedido = itens.get(codigo);

        pedido.setItem(itemPedido);
        return itemPedido;
    }

    public static double selecionarValorItemPedido(String item, Pedidos pedido){
        Map<String, Double> valores = new HashMap<>();
        valores.put("X SALADA", 18.00);    valores.put("CACHORRO-QUENTE SIMPLES", 15.00);
        valores.put("X FRANGO", 19.00);    valores.put("CACHORRO-QUENTE DUPLO", 17.00);
        valores.put("X CALABRESA", 20.00); valores.put("PIZZAS TODOS OS SABORES", 30.00);
        valores.put("X CORAÇÃO", 20.00);   valores.put("REFRIGERANTE", 12.00);
        valores.put("X BACON", 22.00);     valores.put("CERVEJA", 18.00);

        double valor = valores.get(item);

        pedido.setValorDoItem(valor);
        return valor;
    }
}
