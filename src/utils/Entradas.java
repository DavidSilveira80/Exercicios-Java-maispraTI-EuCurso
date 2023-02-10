package utils;

import models.Aluno2;
import models.Pedidos;

import static java.lang.System.out;

import java.util.Scanner;

public class Entradas {

    public static int entradaInteira() {
        Scanner entrada = new Scanner(System.in);
        boolean continuarLeitura = true;
        int numero = 0;
        while (continuarLeitura) {
            try {
                numero = Integer.parseInt(entrada.nextLine());
                continuarLeitura = false;
            } catch (NumberFormatException e) {
                out.println("ENTRADA COM VALOR INVÁLIDO. TENTE NOVAMENTE.");
            }
        }
        return numero;
    }

    public static double entradaDouble() {
        Scanner entrada = new Scanner(System.in);
        boolean continuarLeitura = true;
        double entraDouble = 0.0;
        while (continuarLeitura) {
            try {
                entraDouble = Double.parseDouble(entrada.nextLine());
                continuarLeitura = false;
            } catch (NumberFormatException e) {
                out.println("ENTRADA COM VALOR INVÁLIDO. TENTE NOVAMENTE.");
            }
        }
        return entraDouble;
    }

    //FUNÇÃO RECURSIVA
    public static double validarNotas(double nota, Aluno2 aluno) {

        if(aluno.getSomatorio() + nota >= 100){
            out.println("NÃO FOI POSSÍVEL ADICIONAR NOTA. SOMATÓRIO MAIOR OU IGUAL À 100 PONTOS.");
            out.print("INFORME A NOTA NOVAMENTE: ");
            nota = entradaDouble();
            nota = validarNotas(nota, aluno);
        }else{
            aluno.setSomatorio(aluno.getSomatorio() + nota);
        }
        return nota;
    }
    public static String selecionarPedidoItem(int codigo, Pedidos pedido){
        String item = "";
        switch(codigo){
            case 1:
                item = "X SALADA";
                break;
            case 2:
                item = "X FRANGO";
                break;
            case 3:
                item = "X CALABRESA";
                break;
            case 4:
                item = "X CORAÇÃO";
                break;
            case 5:
                item = "X BACON";
                break;
            case 6:
                item = "CACHORRO-QUENTE SIMPLES";
                break;
            case 7:
                item = "CACHORRO-QUENTE DUPLO";
                break;
            case 8:
                item = "PIZZAS TODOS OS SABORES";
                break;
            case 9:
                item = "REFRIGERANTE";
                break;
            case 10:
                item = "CERVEJA";
                break;
        }
        pedido.setIten(item);
        return item;
    }

    public static double selecionarValorItemPedido(String item, Pedidos pedido){
        double valorItem = 0.0;
        switch(item){
            case "X SALADA":
                valorItem = 18.00;
                break;
            case "X FRANGO":
                valorItem = 19.00 ;
                break;
            case "X CALABRESA":
                valorItem = 20.00;
                break;
            case  "X CORAÇÃO":
                valorItem = 20.00;
                break;
            case "X BACON":
                valorItem = 22.00;
                break;
            case "CACHORRO-QUENTE SIMPLES":
                valorItem = 15.00;
                break;
            case "CACHORRO-QUENTE DUPLO":
                valorItem = 17.00;
                break;
            case "PIZZAS TODOS OS SABORES":
                valorItem = 30.00;
                break;
            case "REFRIGERANTE":
                valorItem = 12.00;
                break;
            case "CERVEJA":
                valorItem = 18.00;
                break;
        }
        pedido.setValorDoIten(valorItem);
        return valorItem;
    }
}
