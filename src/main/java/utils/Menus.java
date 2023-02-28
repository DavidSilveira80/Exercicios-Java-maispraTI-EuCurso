package utils;

import static java.lang.System.out;

public class Menus {

    public static void mostrarMenuPrincipal(){
        out.println("----------------------------------------------------------------------------------------");
        out.println("   1 - PARA EXECUTAR EXERCÍCIO 1         10 - PARA EXECUTAR EXERCÍCIO 10 POO 7          ");
        out.println("   2 - PARA EXECUTAR EXERCÍCIO 2         11 - PARA EXECUTAR EXERCÍCIO 11 POO 8          ");
        out.println("   3 - PARA EXECUTAR EXERCÍCIO 3         12 - PARA EXECUTAR EXERCÍCIO 12 POO 9          ");
        out.println("   4 - PARA EXECUTAR EXERCÍCIO 4 POO 1   13 - PARA EXECUTAR EXERCÍCIO 13 POO 10         ");
        out.println("   5 - PARA EXECUTAR EXERCÍCIO 5 POO 2   14 - PARA EXECUTAR EXERCÍCIO 14 POO 11         ");
        out.println("   6 - PARA EXECUTAR EXERCÍCIO 6 POO 3   15 - PARA EXECUTAR EXERCÍCIO 15 STREAMS        ");
        out.println("   7 - PARA EXECUTAR EXERCÍCIO 7 POO 4   16 - PARA EXECUTAR EXERCÍCIO 16 MAP            ");
        out.println("   8 - PARA EXECUTAR EXERCÍCIO 8 POO 5   17 - PARA EXECUTAR EXERCÍCIO 17 PRÉ-SISTEMA    ");
        out.println("   9 - PARA EXECUTAR EXERCÍCIO 9 POO 6                                                  ");
        out.println("                             18 - PARA SAIR                                             ");
        out.print("INFORME SUA ESCOLHA: ");
    }

    public static void mostrarMenuJogador(){
        out.println("------------------------------------------------------------------");
        out.println("    1 - PARA ADICIONAR GOLS                                       ");
        out.println("    2 - PARA ADICIONAR ASSISTÊNCIAS                               ");
        out.println("    3 - PARA MOSTRAR NÚMERO DE GOLS DO JOGADOR                    ");
        out.println("    4 - PARA MOSTRAR O NÚMERO DE ASSISTÊNCIAS DO JOGADOR          ");
        out.println("    5 - PARA MOSTRAR O NÚMERO DE GOLS E ASSISTÊNCIAS              ");
        out.println("    6 - PARA SAIR                                                 ");
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

    public static void mostrarMenuExercicioFuncionario2(){
        out.println("=======================================================================");
        out.println("            1 - PARA PROGRAMADOR                                       ");
        out.println("            2 - PARA CONTADOR                                          ");
        out.println("            3 - PARA ADMINISTRADOR                                     ");
    }

    public static void mostrarMenuPrincipalBancoInterface(){
        out.println("-------------------------------------------");
        out.println("        1 - PARA CONTA CORRENTE            ");
        out.println("        2 - PARA CONTA POUPANÇA            ");
        out.println("        3 - PARA CONTA SALÁRIO             ");
        out.println("        4 - PARA SAIR                      ");
    }

    public static void mostrarMenuSecundarioBancoInterface(){
        out.println("-------------------------------------------");
        out.println("        1 - PARA DEPOSITAR                 ");
        out.println("        2 - PARA SACAR                     ");
        out.println("        3 - PARA MOSTRAR EXTRATO           ");
        out.println("        4 - PARA VOLTAR                    ");
    }

    public static void mostrarMenuExercicioPoo10Excecao1(){
        out.println("-------------------------------------------");
        out.println("        1 - PARA O EXEMPLO DE SAQUE        ");
        out.println("        2 - PARA O EXEMPLO DE DEPOSITO     ");
        out.println("        3 - PARA SAIR                      ");
    }

    public static void mostrarMenuPrincipalExercicio17(){
        out.println("------------------------------------------------------");
        out.println("        1 - PARA INSERIR COMPRA                       ");
        out.println("        2 - PARA VER COMPRAS EM UM DIA ESPECÍFICO     ");
        out.println("        3 - PARA SAIR                                 ");
    }
}
