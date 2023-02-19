package exercicios;

import models.Compra;

import java.util.*;
import static java.lang.System.out;
import static utils.Entradas.*;
import static utils.Menus.mostrarEnunciadoExercicio17;
import static utils.Menus.mostrarMenuPrincipalExercicio17;

public class Exercicio17 {
    public static void executarExercicio17PreSistemaCompra(){
        List<Compra> compras = new ArrayList<>();

        int loopExecucao = 0;
        while(loopExecucao == 0){
            mostrarEnunciadoExercicio17();
            int option;
            do{
                mostrarMenuPrincipalExercicio17();
                out.print("INFORME SUA ESCOLHA: "); option = entradaInteira();
                switch(option) {
                    case 1:
                        out.println("INSERIR COMPRA\n");
                        adicionarCompra(compras);
                        break;
                    case 2:
                        out.println("LISTAR COMPRAS DE UM DIA ESPECIFICO\n");
                        listarComprasPorDataEspecifica(compras);

                        break;
                    case 3:
                        out.println("SAIR.FINALIZANDO\n");
                        loopExecucao = 1;
                        break;
                    default:
                        out.println("OPÇÃO INVÁLIDA.");
                        break;
                }
            }while(option != 3);
        }
    }
//-----------------------------------MÉTODOS AUXILIARES--------------------------------------------

    public static Compra instanciarCompra(){
        out.print("INFORME A DATA DA COMPRA: "); String dataCompra = entradaString();
        out.print("INFORME A DESCRIÇÃO DA COMPRA: "); String descricaoCompra = entradaString();
        return new Compra(dataCompra, descricaoCompra);
    }

    public static void adicionarCompra(List<Compra> compras){
        int continuarAdicionar;
        do{
            Compra compra = instanciarCompra();
            compras.add(compra);
            continuarAdicionar = informarFluxo1E2();
        }while(continuarAdicionar != 2);
    }

    public static void listarComprasPorDataEspecifica(List<Compra> compras){
        if(compras.isEmpty()){
            out.println("NÃO HÁ COMPRAS CADASTRADAS");
        }else{
            int option;
            do{
                String dataCompra = informarDataDaCompra();
                listandoCompras(compras, dataCompra);

                option = informarFluxo1E2();
            }while(option != 2);
        }
    }

    public static String informarDataDaCompra(){
        out.print("INFORME A DATA DE COMPRA: ");
        return  entradaString();
    }

    public static void listandoCompras(List<Compra> compras, String data){
        if(contabilizaOcorrenciasCompras(compras, data) > 0){

            compras.stream()
                    .filter(e -> e.getDataCompra().equals(data))
                    .forEach(out::println);

        }else{
            out.println("NÃO HÁ COMPRAS NESTA DATA");
        }
    }
    // TODO ver um Stream
    public static int contabilizaOcorrenciasCompras(List<Compra> compras, String data){
        //uso de filter
        return (int) compras.stream()
                .filter(compra -> compra.getDataCompra().equals(data))
                .count();
    }

    public static void chamadaExercicio17(){
        out.println("\nEXERCÍCIO PRÉ-SISTEMA COMPRA");
        executarExercicio17PreSistemaCompra();
    }
}