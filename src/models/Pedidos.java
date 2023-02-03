package models;

import utils.Status;

import java.util.ArrayList;
import java.util.List;

public class Pedidos extends Itens {
    private Itens iten;
    private Status status;
    private double valorTotal;
    public List<Itens> itens = new ArrayList<>();

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void adicionarItens(String itenExterno, double valorIten){
        iten = new Itens();
        iten.setIten(itenExterno);
        iten.setValorDoIten(valorIten);
        itens.add(iten);

    }

    public void mostrarPedido(Pedidos pedido){
       System.out.println();
       System.out.printf("STATUS PEDIDO --> %s\n", this.status);
       System.out.println("ITENS                              VALOR: ");
       for(Itens item : pedido.itens){
          String itenFormatado = String.format("%s----------------------------->", item.getIten());
          String valorFormatado = String.format("R$ %.2f", item.getValorDoIten());
          System.out.printf("%s   %s\n",itenFormatado, valorFormatado);

       }
        System.out.println();
        System.out.println();
    }



}
