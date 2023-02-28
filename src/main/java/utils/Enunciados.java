package utils;

import static java.lang.System.out;

public class Enunciados {
    public static void mostrarEnunciadoExercicioAnimal(){
        out.println("""
                            Crie uma classe Animal depois crie classes filhas apartir dessa classe.
                            A classe Animal deve ter um método e as classes filhas devem sobreescrever 
                            esse método.
                            (esse método pode ser qualquer coisa que eles têm em comum.
                            """);
    }

    public static void mostrarEnunciadoExercicioFuncionario2(){
        out.println("""
                            Crie uma classe abstrata Funcionário que tenha os campos:
                            nome
                            valorHora
                            totalHoras
                            Esta classe também deve ter o método abstrato para retornar o valor total a receber.
                            Depois crie algumas classes que estendam a classe funcionário.
                            Todas as classes filhas devem ter um campo constante com o valor de bonificação 
                            e a partir deste campo, fazer o cálculo do total a receber.
                            
                            programador 5%
                            contador 3%
                            administrador 6%
                            """);
    }

    public static void mostrarEnunciadoExercicio17(){
        out.println("""
                \nCrie uma classe Compra com os campos "descricao" e "dataCompra".
                Depois crie um sistema com algum laço de repetição que tenha três opções:
                ● Inserir uma nova compra
                ● Ver compras em algum dia específico.
                ● Sair do sistema e finalizar.
                """);
    }

    public static void mostrarEnunciadoExercicio2(){
        out.println();
        out.println("""
                As maçãs custam 0,30 cada se forem compradas menos que uma dúzia e 0,25
                se forem comprados pelo menos uma dúzia.
                Escreva um programa que leia a quantidade de maçãs compradas e depois
                imprima o valor total da compra no console.
                """);
        out.println();
    }

    public static void mostrarEnunciadoExercicio1(){
        out.println("Escreva um programa para ler 3 valores e printe o " +
                "maior e o menor entre eles.\n");
    }

    public static void mostrarEnunciadoExercicio3(){
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
        out.println();
    }

    public static void mostrarEnunciadoExercicio4(){
        out.println("""
                 Criar uma classe Jogador que tenha as propriedades nome, gols, assistências.
                 E os métodos adicionarGol e adicionarAssistencia que receba como argumento os
                 quantidade de gols/assistências.
                 Também criar dois métodos  para ver o número de gols e assistências.
                """);
        out.println();
    }

    public static void mostrarEnunciadoExercicio5(){
        out.println("""
                Criar uma classe aluno que receba um nome, nota1, nota2 e nota3, onde o montante das 
                notas podem chegar no máximo 100.
                Cria um método que retorne o nome do aluno, sua média, a maior e menor nota
                """);
    }

    public static void mostrarEnunciadoExercicio6(){
        out.println("""
                Crie uma classe Aluno com os campos nome, matrícula e notas[3].
                Essa classe deve ser encapsulada e no momento de adicionar uma nova nota,
                ela deve verificar se o somatório será maior que 100, caso for. Deixe uma
                mensagem que não foi possível e peça para adicionar novamente uma nota.
                """);

    }

    public static void mostrarEnunciadoExercicio16(){
        out.println("""
                Crie um sistema utilizando do-while que insira alunos em um Map. A chave
                (Key) deverá ser a matrícula do aluno e o valor (Value) deverá ser o próprio
                objeto Aluno.
                Depois crie uma funcionalidade para remover alunos deste Map através da
                chave
                """);
    }

    public static void mostrarEnunciadoExercicio12(){
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
    }

    public static void mostrarEnunciadoExercicio7(){
        out.println("""
                Crie uma classe Pedido com os campos Itens[10], status e valorTotal.
                Essa classe deverá ter os métodos para adicionar itens, que receberá como
                parâmetro o item e o valor.
                Também deverá ter um método para alterar o status do pedido.
                """);
    }

    public static void mostrarEnunciadoExercicio9(){
        out.println("""
                Crie uma classe do tipo funcionário com os campos:
                nome
                função
                setor
                Crie uma lista com 10 objetos do tipo funcionário dentro dela.
                Depois exiba no console todas as informações de cada objeto.
                """);
    }
}
