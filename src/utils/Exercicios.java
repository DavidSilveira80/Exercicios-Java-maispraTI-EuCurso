package utils;

import models.*;
import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

import static utils.Entradas.entradaDouble;
import static utils.Entradas.entradaInteira;
import static utils.Entradas.validarNotas;
import static utils.Entradas.selecionarPedidoItem;
import static utils.Entradas.selecionarValorItemPedido;
import static utils.Menus.*;

public class Exercicios {
    public static void executarExercicio1() {
        out.println();
        out.println("Escreva um programa para ler 3 valores e printe o maior e o menor entre eles.");
        out.println();

        List<Integer> tresInteiros = new ArrayList<>();

        int contador = 0;

        while (contador < 3) {
            out.printf("INFORME O %dº NÚMERO: ", contador + 1);
            tresInteiros.add(entradaInteira());
            contador++;
        }
        int maior = Collections.max(tresInteiros);
        int menor = Collections.min(tresInteiros);
        out.println("O MAIOR NÚMERO É: " + maior);
        out.println("O MENOR NÚMERO É: " + menor);
    }

    public static void executarExercicio2(){
        out.println();
        out.println("""
                As maçãs custam 0,30 cada se forem compradas menos que uma dúzia e 0,25
                se forem comprados pelo menos uma dúzia.
                Escreva um programa que leia a quantidade de maçãs compradas e depois
                imprima o valor total da compra no console.
                """);

        out.print("INFORME A QUANTIDADE DE MAÇÃS QUE VOCÊ QUER COMPRAR: ");
        int quantidadeMacas = entradaInteira();

        double valorApartirDeUmaDuzia = 0.25;
        double valorAbaixoDeUmaDuzia = 0.30;

        if(quantidadeMacas >= 12){
            out.printf("O VALOR TOTAL DAS %d MAÇÃS É DE R$ %.2f\n", quantidadeMacas, quantidadeMacas *
                    valorApartirDeUmaDuzia);
        }else{
            out.printf("O VALOR TOTAL DAS %d MAÇÃS É DE R$ %.2f\n", quantidadeMacas, quantidadeMacas *
                    valorAbaixoDeUmaDuzia);
        }
    }

    public static void executarExercicio3(){
        Locale.setDefault(Locale.US);
        out.println();
        out.println("""
                Escreva um programa que leia o salário bruto de um funcionário e mostre o
                valor líquido.
                Se o salário for menor que
                 R$ 1.000 o desconto é 6%
                Até R$ 2.500 é 8%
                Até R$ 4.800 é 10%
                Maior que 4.800 é 15%
                """);

        out.print("INFORME O SEU SALÁRIO BRUTO: R$ ");
        double salarioBruto = entradaDouble();

        if(salarioBruto < 1000){
            double salarioLiquido = salarioBruto - ((6 * salarioBruto) / 100);
            out.printf("O SEU SALÁRIO BRUTO É R$ %.2f\n", salarioBruto);
            out.printf("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);
        }else if(salarioBruto >= 1000 && salarioBruto <= 2500){
            double salarioLiquido = salarioBruto - ((8 * salarioBruto) / 100);
            out.printf("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);
        }else if(salarioBruto >= 2500 && salarioBruto <= 4800){
            double salarioLiquido = salarioBruto - ((10 * salarioBruto) / 100);
            out.printf("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);
        }else if(salarioBruto > 4800) {
            double salarioLiquido = salarioBruto - ((15 * salarioBruto) / 100);
            out.printf("O SALÁRIO LÍQUIDO É R$ %.2f\n", salarioLiquido);
        }
    }

    public static void executarExercicioPoo1Jogador(){
        Scanner entrada = new Scanner(System.in);
        out.println("""
                            Criar uma classe Jogador que tenha as propriedades nome, gols, assistências.
                            E os métodos adicionarGol e adicionarAssistencia que receba como argumento os
                            quantidade de gols/assistências.
                            Também criar dois métodos  para ver o número de gols e assistências.
                           """);
        out.println();
        out.print("INFORME O NOME DO JOGADOR: ");
        String nome = entrada.nextLine();
        Jogador jogador = new Jogador(nome);

        int loop = 0;
        while(loop == 0){
            int option;
            do{
                out.println();
                out.println("JOGADOR: " + jogador.getNomeJogador());
                mostrarMenuJogador();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6);
            switch(option){
                case 1:
                    out.println();
                    out.println("ADICIONAR GOLS.");
                    out.println();
                    out.print("INFORME QUANTOS GOLS QUER ADICIONAR: ");
                    int gol = entradaInteira();
                    jogador.adicionarGol(gol);
                    break;
                case 2:
                    out.println();
                    out.println("ADICIONAR ASSISTÊNCIAS.");
                    out.println();
                    out.print("INFORME QUANTAS ASSISTÊNCIAS QUER ADICIONAR: ");
                    int assistencia = entradaInteira();
                    jogador.adicionarAssistencia(assistencia);
                    break;
                case 3:
                    out.println();
                    out.println("MOSTRAR NÚMERO DE GOLS.");
                    out.println();
                    jogador.mostrarNumerosDeGols();
                    break;
                case 4:
                    out.println();
                    out.println("MOSTRAR NÚMERO DE ASSISTÊNCIAS.");
                    out.println();
                    jogador.mostrarNumeroDeAssistencias();
                    break;
                case 5:
                    out.println();
                    out.println("MOSTRAR NÚMERO DE GOLS E ASSISTÊNCIAS.");
                    out.println();
                    jogador.mostrarNumeroDeGolsEAssistencias();
                    break;
                case 6:
                    out.println();
                    out.println("SAINDO.");
                    loop = 1;
                    break;
            }
        }
    }

    public static void executarExercicioPoo2Aluno(){
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        out.println("""
                Criar uma classe aluno que receba um nome, nota1, nota2 e nota3, onde o montante das 
                notas podem chegar no máximo 100.
                Cria um método que retorne o nome do aluno, sua média, a maior e menor nota
                """);
        out.println();
        out.print("INFORME O NOME DO ALUNO: ");
        String nome = entrada.nextLine();
        out.print("INFORME O PRIMEIRA NOTA DO ALUNO: ");
        double nota1 = entradaDouble();
        out.print("INFORME A SEGUNDA NOTA DO ALUNO: ");
        double nota2 = entradaDouble();
        out.print("INFORME A TERCEIRA NOTA DO ALUNO: ");
        double nota3 = entradaDouble();
        out.println();
        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);
        aluno.somarNotas();
        if(aluno.getNotasSomadas() <= 100){
            aluno.calcularMedia();
            aluno.acharMaiorNota();
            aluno.acharMenorNota();
            out.println(aluno.mostrarBoletimAluno());
        }else{
            out.println("A SOMA TOTAL DAS NOTAS ULTRAPASSA 100 PONTOS.");
        }
    }

    public static void executarExercicioPoo3Aluno2(){
        Scanner entrada = new Scanner(System.in);
        out.println("""
                Crie uma classe Aluno com os campos nome, matrícula e notas[3].
                Essa classe deve ser encapsulada e no momento de adicionar uma nova nota,
                ela deve verificar se o somatório será maior que 100, caso for. Deixe uma
                mensagem que não foi possível e peça para adicionar novamente uma nota.
                """);

        Aluno2 aluno2 = new Aluno2();
        out.print("INFORME O NOME DO ALUNO: ");
        String nomeAluno = entrada.nextLine();
        aluno2.setNomeAluno(nomeAluno);
        out.printf("INFORME A MATRICULA DO ALUNO ", aluno2.getNomeAluno() + "(ATÉ 4 DIGITOS) :");
        int matricula = entradaInteira();
        aluno2.setMatricula(matricula);

        out.println();
        out.println("------------------------------------------------");
        out.println("INFORMAR AS NOTAS DO ALUNO " + aluno2.getNomeAluno() + ".");
        out.println();

        out.print("INFORMAR A 1ª NOTA: ");
        double nota1 = entradaDouble();
        aluno2.setNota1(validarNotas(nota1, aluno2));

        System.out.print("INFORMAR A 2° NOTA: ");
        double nota2 = entradaDouble();
        aluno2.setNota2(validarNotas(nota2, aluno2));

        out.print("INFORMAR A 3º NOTA: ");
        double nota3 = entradaDouble();
        aluno2.setNota3(validarNotas(nota3, aluno2));

        out.println();
        aluno2.mostrarBoletim();
        out.println();
    }

    public static void executarExercicioPoo4Pedido(){
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
        while(loopPrincipal == 0) {
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
                        }while(codigoItem != 1 && codigoItem != 2 && codigoItem != 3 && codigoItem != 4
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
                    if(pedido.itens.isEmpty()){
                        out.println("NÃO HÁ PEDIDOS FEITOS.");
                    }else{
                        pedido.alterarStatusPedido();
                        pedido.mostrarPedido(pedido);
                    }
                    break;
                case 3:
                    out.println("GERAR NOTA DO PEDIDO");
                    if(pedido.itens.isEmpty()){
                        out.println("NÃO HÁ PEDIDOS FEITOS.");
                    }else{
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

    public static void executarExercicioPoo5Calculadora(){
        out.println();
        out.println("      CALCULADORA PARA 2 DIGITOS        ");
        out.println();
        out.println("""
                Crie uma classe Calculadora com os métodos das operações matemáticas
                estáticos.
                Soma, Subtração, Multiplicação e Divisão.
                Use essa classe sem instanciar ela.
                """);
        out.println();

        int loop = 0;
        int option;
        while(loop == 0){
            do{
                mostrarmenuCalculadora();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5);
            switch(option){
                case 1:
                    out.println("ADIÇÃO");
                    Calculadora.somar();
                    break;
                case 2:
                    out.println("SUBTRAÇÃO");
                    Calculadora.subtrair();
                    break;
                case 3:
                    out.println("MULTIPLICAÇÃO");
                    Calculadora.multiplicar();
                    break;
                case 4:
                    out.println("DIVISÃO");
                    Calculadora.dividir();
                    break;
                case 5:
                    out.println("SAINDO");
                    loop = 1;
                    break;
            }
        }
    }

    public static void executarExercicioPoo6Funcionario1(){
        Scanner entrada = new Scanner(System.in);
        out.println("""
                            Crie uma classe do tipo funcionário com os campos:
                            nome
                            função
                            setor
                            Crie uma lista com 10 objetos do tipo funcionário dentro dela.
                            Depois exiba no console todas as informações de cada objeto.
                            """);

        out.println("-------------------------------------------");
        out.println("          CADASTRANDO 10 FUNCIONÁRIOS      ");


        List<Funcionario> funcionarios = new ArrayList<>();
        int contador = 0;
        while(contador < 10){
            out.println();
            out.printf("INFORME O NOME DO %dº FUNCIONÁRIO: ", contador + 1);
            String nome = entrada.nextLine();
            out.print("INFORME A FUNÇÃO: ");
            String funcao = entrada.nextLine();
            out.print("INFORME O SETOR: ");
            String setor = entrada.nextLine();
            funcionarios.add(new Funcionario(nome, funcao, setor));
            contador++;
        }
        out.println("LISTANDO OS 10 FUNCIONÁRIOS E SEUS ATRIBUTOS");
        for(Funcionario funcionario : funcionarios){
            funcionario.mostrarFuncionario();
        }
    }

    public static void executarExercicioPoo8Animal(){
        mostrarEnunciadoExercicioAnimal();

        out.println("AQUI É UM OBJETO INSTÂNCIADO DA CLASSE ANIMAL COM SEU MÉTODO ALMENTAR(): ");
        out.println();
        Animal animal = new Animal("pica-pau", "ave", "Alpiste");
        out.println(animal);
        out.println(animal.alimentar());

        out.println("""
                       
                       AQUI É UM OBJETO INSTÂNCIADO DA CLASSE TIGRE QUE HERDA DA CLASSE ANIMAL E SOBREESCREVE
                       O MÉTODO ALIMENTAR DA CLASSE ANIMAL:
                       """);
        Animal tigre = new Tigre("Tigrão", "mamifero", "Carne");
        out.println(tigre);
        out.println(tigre.alimentar());

    }
    public static void executarExercicioPoo7Funcionario2(){
        Scanner entrada = new Scanner(System.in);
        mostrarEnunciadoExercicioFuncionario2();
        out.println();
        int option;
        do{
            mostrarMenuExercicioFuncionario2();
            out.print("INFORME SUA ESCOLHA: ");
            option = entradaInteira();
        }while(option != 1 && option !=2 && option != 3);
        switch(option){
            case 1:
                out.println("PROGRAMADOR");
                out.println();

                out.print("INFORME O NOME DO PROFISSIONAL: ");
                String nomeProgramador = entrada.nextLine();

                out.print("INFORME O TOTAL DE HORAS TRABALHADAS: ");
                int totalHorasProgramador = entradaInteira();

                out.print("INFORME O VALOR POR HORA TRABALHADA: ");
                double valorHorasProgramador = entradaDouble();

                Programador programador = new Programador(nomeProgramador, totalHorasProgramador,
                        valorHorasProgramador);
                out.println(programador.mostrarRelatorio());
                break;
            case 2:
                out.println("CONTADOR");
                out.println();

                out.print("INFORME O NOME DO PROFISSIONAL: ");
                String nomeContador = entrada.nextLine();

                out.print("INFORME O TOTAL DE HORAS TRABALHADAS: ");
                int totalHorasContador = entradaInteira();

                out.print("INFORME O VALOR POR HORA TRABALHADA: ");
                double valorHorasContador = entradaDouble();

                Contador contador = new Contador(nomeContador, totalHorasContador, valorHorasContador);
                out.println(contador.mostrarRelatorio());
                break;
            case 3:
                out.println("ADMINISTRADOR");
                out.println();

                out.print("INFORME O NOME DO PROFISSIONAL: ");
                String nomeAdministrador = entrada.nextLine();

                out.print("INFORME O TOTAL DE HORAS TRABALHADAS: ");
                int totalHorasAdministrador = entradaInteira();

                out.print("INFORME O VALOR POR HORA TRABALHADA: ");
                double valorHorasAdministrador = entradaDouble();

                Administrador administrador = new Administrador(nomeAdministrador, totalHorasAdministrador,
                        valorHorasAdministrador);
                out.println(administrador.mostrarRelatorio());
                break;
        }
    }

    public static void executarExercicioPoo9InterfaceBanco(){
        Scanner entrada = new Scanner(System.in);
        out.println();
        out.println("""
                            Criar uma interface ContaBancaria com as funcionalidades: sacar, ver extrato e depositar.
                            Depois crie classes que usarão esta Interface.
                            Exemplos de classe: ContaCorrente, ContaPoupanca, ContaSalario;
                            No método de saque, a conta corrente deverá ter um taxa de 10, conta poupança de 5 e
                            conta salário 0.
                            No método para depósito a conta corrente deverá ter um acréscimo de 1% até 10.000,
                            conta poupança de 3% até 3.000 e na conta salário não ter.
                            No método para ver Extrato deverá aparecer informações do titular e qual tipo de conta
                            
                            """);
        out.println();

        int paradaPrincipal = 0;
        while(paradaPrincipal == 0){
            int option1;
            do{
                mostrarMenuPrincipalBancoInterface();
                out.print("INFORME SUA ESCOLHA: ");
                option1 = entradaInteira();
            }while(option1 != 1 && option1 != 2 && option1 != 3 && option1 != 4);
            switch(option1){
                case 1:
                    out.println("CONTA CORRENTE");
                    out.println();
                    ContaCorrente contaC = new ContaCorrente();

                    out.print("INFORME NO NÚMERO DA CONTA: ");
                    int numeroContaCorrente = entradaInteira();
                    out.print("INFORME O NOME DO TITULAR DA CONTA: ");
                    String nomeTitularContaCorrente = entrada.nextLine();
                    contaC.setNumeroDaConta(numeroContaCorrente);
                    contaC.setNomeDoTitular(nomeTitularContaCorrente);

                    int paradaContaCorrente = 0;
                    while(paradaContaCorrente == 0){
                        int optionContaCorrente;
                        do{
                            mostrarMenuSecundarioBancoInterface();
                            out.println("INFORME SUA ESCOLHA: ");
                            optionContaCorrente = entradaInteira();
                        }while(optionContaCorrente != 1 && optionContaCorrente != 2 &&
                                optionContaCorrente != 3 && optionContaCorrente != 4);
                        switch(optionContaCorrente){
                            case 1:
                                out.println("DEPOSITAR");
                                out.println();
                                contaC.depositar();
                                break;
                            case 2:
                                out.println("SACAR");
                                out.println();
                                contaC.sacar();
                                break;
                            case 3:
                                out.println("EXTRATO");
                                out.println();
                                out.print(contaC.verExtrato());
                                break;
                            case 4:
                                out.println("VOLTAR");
                                out.println();
                                paradaContaCorrente = 1;
                        }
                    }
                    break;
                case 2:
                    out.println("CONTA POUPANÇA");
                    out.println();
                    ContaPoupanca contaP = new ContaPoupanca();

                    out.print("INFORME NO NÚMERO DA CONTA: ");
                    int numeroContaPoupanca = entradaInteira();
                    out.print("INFORME O NOME DO TITULAR DA CONTA: ");
                    String nomeTitularContaPoupanca = entrada.nextLine();
                    contaP.setNumeroDaConta(numeroContaPoupanca);
                    contaP.setNomeDoTitular(nomeTitularContaPoupanca);

                    int paradaContaPoupanca = 0;
                    while(paradaContaPoupanca == 0){
                        int optionContaPoupanca;
                        do{
                            mostrarMenuSecundarioBancoInterface();
                            out.println("INFORME SUA ESCOLHA: ");
                            optionContaPoupanca = entradaInteira();
                        }while(optionContaPoupanca != 1 && optionContaPoupanca != 2 &&
                                optionContaPoupanca != 3 && optionContaPoupanca != 4);
                        switch(optionContaPoupanca){
                            case 1:
                                out.println("DEPOSITAR");
                                contaP.depositar();
                                break;
                            case 2:
                                out.println("SACAR");
                                contaP.sacar();
                                break;
                            case 3:
                                out.println("EXTRATO");
                                out.print(contaP.verExtrato());
                                break;
                            case 4:
                                out.println("VOLTAR");
                                out.println();
                                paradaContaPoupanca = 1;
                        }
                    }
                    break;
                case 3:
                    out.println("CONTA SALÁRIO");
                    out.println();
                    ContaSalario contaS = new ContaSalario();

                    out.print("INFORME NO NÚMERO DA CONTA: ");
                    int numeroContaSalario = entradaInteira();
                    out.print("INFORME O NOME DO TITULAR DA CONTA: ");
                    String nomeTitularContaSalario = entrada.nextLine();
                    contaS.setNumeroDaConta(numeroContaSalario);
                    contaS.setNomeDoTitular(nomeTitularContaSalario);

                    int paradaContaSalario = 0;
                    while(paradaContaSalario == 0){
                        int optionContaSalario;
                        do{
                            mostrarMenuSecundarioBancoInterface();
                            out.println("INFORME SUA ESCOLHA: ");
                            optionContaSalario = entradaInteira();
                        }while(optionContaSalario != 1 && optionContaSalario != 2 &&
                                optionContaSalario != 3 && optionContaSalario != 4);
                        switch(optionContaSalario){
                            case 1:
                                out.println("DEPOSITAR");
                                contaS.depositar();
                                break;
                            case 2:
                                out.println("SACAR");
                                contaS.sacar();
                                break;
                            case 3:
                                out.println("EXTRATO");
                                out.print(contaS.verExtrato());
                                break;
                            case 4:
                                out.println("VOLTAR");
                                out.println();
                                paradaContaSalario = 1;
                        }
                    }
                    break;
                case 4:
                    out.println("SAIR");
                    out.println();
                    out.println("ENCERRANDO");
                    paradaPrincipal = 1;
            }
        }
    }

    public static void executarExercicioPoo10Excecao1() throws MinhaExceptionExercicio10{
        out.println("""
                            Seguindo o exercício 1…
                            Crie uma exceção personalizada que deverá ser lançada nesses casos:
                            Ao tentar fazer saque maior que o saldo.
                            Ao tentar fazer um depósito maior que 10 mil.
                            Trate essas exceções.
                            """);
        out.println();
        out.println("NESTE EXERCÍCIO TANTO O EXEMPLO DE SAQUE E O DE DEPÓSITO IRÃO DERRUBAR O SISTEMINHA.\n" +
                "PARA CONTINUAR EXECUNTANDO O PROGRAMA VOCÊ TERÁ DE EXECUTA-LO NOVAMENTE.");
        int parada = 0;
        while(parada == 0){
            int option;
            do{
                mostrarMenuExercicioPoo10Excecao1();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            }while(option != 1 && option != 2 && option != 3 );
            switch(option){
                case 1:
                    out.println("SACAR");
                    out.println("SAQUE ONDE LANÇARÁ UMA EXCEÇÃO.");
                    double saldo = 480;
                    out.print("INFORME O VALOR DO SAQUE: R$ ");
                    double saque = entradaDouble();

                    if(saque > saldo){
                        throw new MinhaExceptionExercicio10("SALDO INSUFICIENTE PARA O SAQUE.\n" +
                                "saldo == " + saldo + " saque == " + saque);
                    }
                    break;
                case 2:
                    out.println("DEPOSITAR");
                    out.println();
                    double tetoDeposito = 10000;
                    out.print("INFORME O VALOR DO DEPÓSITO: R$ ");
                    double valorDeposito = entradaDouble();

                    if(valorDeposito > tetoDeposito){
                        throw new  MinhaExceptionExercicio10("O VALOR DO DEPÓSITO É MAIOR QUE SEU TETO.\n" +
                                "tetoDeposito == " + tetoDeposito + " valorDeposito == " + valorDeposito);
                    }
                    break;
            }
        }
    }

    public static void executarExercicioPoo11Excecao2(){
        out.println("""
                            O código abaixo lançará algumas exceções. Trate eles de uma forma que o código
                            continuará com a próxima etapa. (Deve-se usar a estrutura try-catch)
                            
                            List<String> lista = null;
                            lista.add("Produto 1");
                            lista.get(2);
                            lista.add("Produto 2");
                            for(String produto : lista) {
                                out.println(produto);
                            }
                            """);

        List<String> lista = null;
        try {
            lista.add("Produto 1");
            lista.get(2);
            lista.add("Produto 2");
            for (String produto : lista) {
                out.println(produto);
            }
        }catch(NullPointerException e){
            out.println("SEU CÓDIGO ESTÁ GERANDO UM ERRO " + e.getMessage());
        }


        out.println("""
                O TRATAMENTO QUE FOI DADO PARA O RESULTADO ACIMA FOI O SEGUINTE: 
                
                List<String> lista = null;
                        try {
                            lista.add("Produto 1");
                            lista.get(2);
                            lista.add("Produto 2");
                            for (String produto : lista) {
                                out.println(produto);
                            }
                        }catch(NullPointerException e){
                            out.println("SEU CÓDIGO ESTÁ GERANDO UM ERRO " + e.getMessage());
                        }
                """);
    }
}
