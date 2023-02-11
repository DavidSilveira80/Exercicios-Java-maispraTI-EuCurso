import utils.Menus;

import static utils.Entradas.entradaInteira;
import static java.lang.System.out;
import static utils.Exercicios.*;

public class Principal {

    public static void main(String[] args){
        int loop = 0;
        while(loop == 0){
            int option;
            do{
                Menus.mostrarMenuPrincipal();
                out.print("INFORME SUA ESCOLHA: ");
                option = entradaInteira();
            }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6
                   && option != 7 && option != 8 && option != 9 && option != 10 && option != 11 &&
                    option != 12 && option != 13 && option != 14 && option != 15);
            switch(option){
                case 1:
                    out.println();
                    out.println("EXERCÍCIO 1");
                    executarExercicio1();
                    break;
                case 2:
                    out.println();
                    out.println("EXERCÍCIO 2");
                    executarExercicio2();
                    break;
                case 3:
                    out.println();
                    out.println("EXERCÍCIO 3");
                    executarExercicio3();
                    break;
                case 4:
                    out.println("EXERCÍCIO POO 1");
                    out.println();
                    executarExercicioPoo1Jogador();
                    break;
                case 5:
                    out.println("EXERCÍCIO POO 2");
                    out.println();
                    executarExercicioPoo2Aluno();
                    break;
                case 6:
                    out.println("EXERCÍCIO P00 3");
                    out.println();
                    executarExercicioPoo3Aluno2();
                    break;
                case 7:
                    out.println("EXERCÍCIO POO 4");
                    out.println();
                    executarExercicioPoo4Pedido();
                    break;
                case 8:
                    out.println("EXERCÍCIO POO 5");
                    out.println();
                    executarExercicioPoo5Calculadora();
                    break;
                case 9:
                    out.println("EXERCÍCIO POO 6");
                    out.println();
                    executarExercicioPoo6Funcionario1();
                    break;
                case 10:
                    out.println("EXERCÍCIO POO 7");
                    out.println();
                    executarExercicioPoo7Funcionario2();
                    break;
                case 11:
                    out.println("EXERCÍCIO POO 8");
                    out.println();
                    executarExercicioPoo8Animal();
                    out.println();
                    break;
                case 12:
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
                    break;
                case 13:
                    out.println("""
                            Seguindo o exercício 1…
                            Crie uma exceção personalizada que deverá ser lançada nesses casos:
                            Ao tentar fazer saque maior que o saldo.
                            Ao tentar fazer um depósito maior que 10 mil.
                            Trate essas exceções.
                            """);
                    break;
                case 14:
                    out.println("""
                            O código abaixo lançará algumas exceções. Trate eles de uma forma que o código
                            continuará com a próxima etapa. (Deve-se usar a estrutura try-catch)
                            
                            List<String> lista = null;
                            lista.add("Produto 1");
                            lista.get(2);
                            lista.add("Produto 2");
                            for(String produto : lista) {
                                System.out.println(produto);
                            }
                            """);
                    break;
                case 15:
                    out.println("SAINDO.");
                    loop = 1;
                    break;
            }
        }
    }
}
