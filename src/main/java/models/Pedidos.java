package models;

import utils.Entradas;
import utils.Menus;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

public class Pedidos extends Itens {
    private Itens item;
    private StatusPedido status;
    public List<Itens> itens = new ArrayList<>();

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void adicionarItens(String itenExterno, double valorItem){
        item = new Itens();
        item.setItem(itenExterno);
        item.setValorDoItem(valorItem);
        itens.add(item);

    }

    public void mostrarPedido(Pedidos pedido){
       out.println();
       out.printf("STATUS PEDIDO --> %s\n", this.status);
       out.println("ITENS                              VALOR: ");
       for(Itens item : pedido.itens){
          String itemFormatado = String.format("%s----------------------------->", item.getItem());
          String valorFormatado = String.format("R$ %.2f", item.getValorDoItem());
          out.printf("%s   %s\n",itemFormatado, valorFormatado);
       }
       out.printf("TOTAL: R$ %.2f\n",calcularValorTotal());
       out.println();
       out.println();
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for(Itens item : this.itens ){
            total += item.getValorDoItem();
        }
        return total;
    }

    public void alterarStatusPedido(){
        int option;
        do{
            Menus.mostrarMenuStatus();
            out.print("INFORME SUA ESCOLHA: ");
            option = Entradas.entradaInteira();
        }while(option != 1 && option != 2 && option != 3 && option != 4);
        switch(option){
            case 1:
                out.println("ALTERANDO PARA ANOTANDO_PEDIDO");
                this.status = StatusPedido.ANOTANDO_PEDIDO;
                break;
            case 2:
                out.println("ALTERANDO PARA EM_ANDAMENTO");
                this.status = StatusPedido.EM_ANDAMENTO;
                break;
            case 3:
                out.println("ALTERANDO PARA ENTREGUE");
                this.status = StatusPedido.ENTREGUE;
                break;
            case 4:
                out.println("ALTERANDO PARA PAGO");
                this.status = StatusPedido.PAGO;
                break;
        }
    }
}
