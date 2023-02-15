package exercicios;

import models.Pedidos;
import utils.Status;

import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Entradas.entradaInteira;
import static utils.Menus.mostrarMenuLanchesValor;
import static utils.Menus.mostrarMenuPrincipalLancheria;

public class Exercicio7 {
    public static void executarExercicio7Poo4Pedido() {
        out.println("""
                Crie uma classe Pedido com os campos Itens[10], status e valorTotal.
                Essa classe deverá ter os métodos para adicionar itens, que receberá como
                parâmetro o item e o valor.
                Também deverá ter um método para alterar o status do pedido.
                """);

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
}
