package models;

import utils.Entradas;
import utils.Menus;
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
       System.out.printf("TOTAL: R$ %.2f\n",calcularValorTotal());
       System.out.println();
       System.out.println();
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for(Itens item : this.itens ){
            total += item.getValorDoIten();
        }
        return total;
    }

    public void alterarStatusPedido(){

        int option;

        do{
            Menus.mostrarMenuStatus();
            System.out.print("INFORME SUA ESCOLHA: ");
            option = Entradas.entradaInteira();
        }while(option != 1 && option != 2 && option != 3 && option != 4);
        switch(option){
            case 1:
                System.out.println("ALTERANDO PARA ANOTANDO_PEDIDO");
                this.status = Status.ANOTANDO_PEDIDO;
                break;
            case 2:
                System.out.println("ALTERANDO PARA EM_ANDAMENTO");
                this.status = Status.EM_ANDAMENTO;
                break;
            case 3:
                System.out.println("ALTERANDO PARA ENTREGUE");
                this.status = Status.ENTREGUE;
                break;
            case 4:
                System.out.println("ALTERANDO PARA PAGO");
                this.status = Status.PAGO;
                break;
        }
    }

}
