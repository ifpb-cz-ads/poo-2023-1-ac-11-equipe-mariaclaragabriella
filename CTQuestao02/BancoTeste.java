package CTQuestao02;

import java.util.ArrayList;
import java.util.Scanner;

public class BancoTeste {

    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();
        int resposta, numeroConta = 1000, numContaSaldo, numContaSaque, numContaDeposito, opcaoConta;
        double valorSaque, valorDeposito, valorLimite;
        String nomeTitular, cpfTitular;

        do {
            Scanner entrada = new Scanner(System.in);
            System.out.println("\nOpções: \n1 - Criar uma conta\n2 - Ver o saldo de uma conta\n3 - sacar\n" +
                    "4 - depositar\n5 - digite 0 para finalizar");
            resposta = entrada.nextInt();
            if (resposta == 1) {
                System.out.println("Informe o tipo de conta que deseja criar:\n1 - Conta Especial\n2 - Conta poupança");
                opcaoConta = entrada.nextInt();
                entrada.nextLine();
                if(opcaoConta == 1){
                    System.out.println("Informe o nome do titular da conta especial: ");
                    nomeTitular = entrada.nextLine();
                    System.out.println("Informe o cpf do titular da conta especial (Ex: 11122233344): ");
                    cpfTitular = entrada.nextLine();
                    System.out.println("Informe o limite da conta: ");
                    valorLimite = entrada.nextDouble();
                    ContaEspecial conta = new ContaEspecial(numeroConta, nomeTitular, cpfTitular, valorLimite );
                    contas.add(conta);
                    System.out.printf("o numero da sua conta é %d", numeroConta);
                    numeroConta++;

                }
                if(opcaoConta == 2){
                    System.out.println("Informe o nome do titular da conta poupança: ");
                    nomeTitular = entrada.nextLine();
                    System.out.println("Informe o cpf do titular da conta poupança (Ex: 11122233344): ");
                    cpfTitular = entrada.nextLine();
                    ContaPoupanca conta = new ContaPoupanca(numeroConta, nomeTitular, cpfTitular);
                    contas.add(conta);
                    System.out.printf("o numero da sua conta é %d", numeroConta);
                    numeroConta++;
                }

            }
            if (resposta == 2) {
                System.out.println("Informe o numero da conta: ");
                numContaSaldo = entrada.nextInt();
                for (Conta contaAux : contas) {
                    if (contaAux.getNumero() == numContaSaldo) {
                        System.out.println(contaAux.getSaldo());
                        break;
                    }
                }
            }
            if (resposta == 3) {
                System.out.println("Informe o numero da conta que deseja sacar: ");
                numContaSaque = entrada.nextInt();
                System.out.println("Informe o valor que deseja sacar: ");
                valorSaque = entrada.nextDouble();
                for (Conta contaAux : contas) {
                    if (contaAux.getNumero() == numContaSaque) {
                        if (contaAux.sacar(valorSaque)) {
                            System.out.println("Saque efetuado com sucesso");
                        } else {
                            System.out.println("Saque não efetuado");
                        }
                    }
                }
            }
            if (resposta == 4) {
                System.out.println("Informe o número da conta que deseja depositar: ");
                numContaDeposito = entrada.nextInt();
                System.out.println("Informe o valor a ser depositado: ");
                valorDeposito = entrada.nextDouble();
                for (Conta contaAux : contas) {
                    if (contaAux.getNumero() == numContaDeposito) {
                        contaAux.depositar(valorDeposito);
                    }
                }

            }


        } while (resposta != 0);
    }

}
