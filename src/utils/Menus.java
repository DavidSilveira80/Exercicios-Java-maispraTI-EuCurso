package utils;

import static java.lang.System.out;

public class Menus {

    public static void mostrarMenuPrincipal(){
        out.println("-------------------------------------------------------------");
        out.println("   1 - PARA EXECUTAR EXERCÍCIO 1                             ");
        out.println("   3 - PARA EXECUTAR EXERCÍCIO 3                             ");
        out.println("   4 - PARA EXECUTAR EXERCÍCIO POO 1 JOGADOR                 ");
        out.println("   5 - PARA EXECUTAR EXERCÍCIO POO 2 ALUNO                   ");
        out.println("   6 - PARA EXECUTAR EXERCÍCIO POO 3 ALUNO 2                 ");
        out.println("   7 - PARA EXECUTAR EXERCÍCIO POO 4 PEDIDO                  ");
        out.println("   8 - PARA EXECUTAR EXERCÍCIO POO 5 CALCULADORA             ");
        out.println("   9 - PARA EXECUTAR EXERCÍCIO POO 6 FUNCIONÁRIO             ");
        out.println("   10 - PARA EXECUTAR EXERCÍCIO POO 7 FUNCIONÁRIO HERANÇA    ");
        out.println("   11 - PARA EXECUTAR EXERCÍCIO POO 8 ANIMAL HERANÇA         ");
        out.println("   12 - PARA SAIR                                            ");

    }

    public static void mostrarMenuJogador(){
        out.println("---------------------------------------------------------");
        out.println("    1 - PARA ADICIONAR GOLS                              ");
        out.println("    2 - PARA ADICIONAR ASSISTÊNCIAS                      ");
        out.println("    3 - PARA MOSTRAR NÚMERO DE GOLS DO JOGADOR           ");
        out.println("    4 - PARA MOSTRAR O NÚMERO DE ASSISTÊNCIAS DO JOGADOR ");
        out.println("    5 - PARA SAIR                                        ");
    }

    public static void mostrarMenuPrincipalLancheria(){
        out.println("""
                -----------------------------------------------------
                                    O QUE DESEJA?
                               1 - FAZER SEU PEDIDO
                               2 - ALTERAR STATUS DO PEDIDO
                               3 - GERAR NOTA DO PEDIDO
                               4 - SAIR   
                """);

    }

    public static void mostrarMenuLanchesValor(){
        out.println("""
                --------------------------------------------
                             TABELA DE VALORES
                              
                    CÓD                                 VALOR:      
                     1 - X SALADA                       R$  18.00
                     2 - X FRANGO                       R$  19.00 
                     3 - X CALABRESA                    R$  20.00
                     4 - X CORAÇÃO                      R$  20.00
                     5 - X BACON                        R$  22.00
                     6 - CACHORRO-QUENTE SIMPLES        R$  15.00 
                     7 - CACHORRO-QUENTE DUPLO          R$  17.00 
                     8 - PIZZAS TODOS OS SABORES        R$  30.00
                     9 - REFRIGERANTE                   R$  12.00
                     10 - CERVEJA                       R$  18.00
                """);
    }
    public static void mostrarMenuStatus(){
        out.println("""
                ----------------------------------
                       1 - ANOTANDO_PEDIDO
                       2 - EM_ANDAMENTO
                       3 - ENTREGUE
                       4 - PAGO
                """);
    }

    public static void mostrarmenuCalculadora(){
        out.println("""
                ----------------------------------------------------
                                  AS QUATRO OPERAÇÕES
                              1 - PARA ADIÇÃO
                              2 - PAARA SUBTRAÇÃO
                              3 - PARA MULTIPLICAÇÃO
                              4 - PARA DIVISÃO
                              5 - PARA SAIR    
                """);
    }
}
