package utils;

public class Menus {

    public static void mostrarMenuPrincipal(){
        System.out.println("-----------------------------------------------");
        System.out.println("   1 - PARA EXECUTAR EXERCÍCIO 1               ");
        System.out.println("   2 - PARA EXECUTAR EXERCÍCIO 2               ");
        System.out.println("   3 - PARA EXECUTAR EXERCÍCIO 3               ");
        System.out.println("   4 - PARA EXECUTAR EXERCÍCIO POO 1 JOGADOR   ");
        System.out.println("   5 - PARA EXECUTAR EXERCÍCIO POO 2 ALUNO     ");
        System.out.println("   6 - PARA EXECUTAR EXERCÍCIO POO 3 ALUNO 2   ");
        System.out.println("   7 - PARA EXECUTAR EXERCÍCIO POO 4 PEDIDO    ");
        System.out.println("   8 - PARA SAIR            ");

    }

    public static void mostrarMenuJogador(){
        System.out.println("---------------------------------------------------------");
        System.out.println("    1 - PARA ADICIONAR GOLS                              ");
        System.out.println("    2 - PARA ADICIONAR ASSISTÊNCIAS                      ");
        System.out.println("    3 - PARA MOSTRAR NÚMERO DE GOLS DO JOGADOR           ");
        System.out.println("    4 - PARA MOSTRAR O NÚMERO DE ASSISTÊNCIAS DO JOGADOR ");
        System.out.println("    5 - PARA SAIR                                        ");
    }

    public static void mostrarMenuPrincipalLancheria(){
        System.out.println("""
                -----------------------------------------------------
                                    O QUE DESEJA?
                               1 - FAZER SEU PEDIDO
                               2 - ALTERAR STATUS DO PEDIDO
                               3 - GERAR NOTA DO PEDIDO   
                """);

    }

    public static void mostrarMenuLanchesValor(){
        System.out.println("""
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

}
