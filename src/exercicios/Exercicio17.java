package exercicios;

import models.Compra;

import java.util.*;
import static java.lang.System.out;
import static utils.Entradas.entradaInteira;
import static utils.Entradas.informarFluxo1E2;
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
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
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
        Scanner entrada = new Scanner(System.in);
        out.print("INFORME A DATA DA COMPRA: ");
        String dataCompra = entrada.nextLine();
        out.print("INFORME A DESCRIÇÃO DA COMPRA: ");
        String descricaoCompra = entrada.nextLine();
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
        Scanner entrada = new Scanner(System.in);
        if(compras.isEmpty()){
            out.println("NÃO HÁ COMPRAS CADASTRADAS");
        }else{
            int option;
            do{
                out.print("INFORME A DATA DE COMPRA: ");
                String dataCompra = entrada.nextLine();
                listandoCompras(compras, dataCompra);
                option = informarFluxo1E2();
            }while(option != 2);
        }
    }

    public static void listandoCompras(List<Compra> compras, String data){
        if(verificaSeHaCompraData(compras, data)){
            for(Compra compra : compras){
                if(!compra.getDataCompra().equals(data)){
                }else{
                    out.println(compra.toString());
                }
            }
        }else{
            out.println("NÃO HÁ COMPRAS NESTA DATA");
        }
    }

    public static boolean verificaSeHaCompraData(List<Compra> compras, String data){
        boolean retorno;
        int ocorrencia = 0;

        for(Compra compra : compras){
            if(compra.getDataCompra().equals(data)){
                ocorrencia += 1;
            }
        }
        if(ocorrencia == 0){
            retorno = false;
        }else{
            retorno = true;
        }
        return retorno;
    }
}
