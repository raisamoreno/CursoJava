package construtoresSobrecargaEncapsulamento.exercicio.aplicacao;

import construtoresSobrecargaEncapsulamento.exercicio.entidades.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Insira o número da conta: ");
        String numerdoDaConta = sc.nextLine();

        System.out.println("Insira o nome do titular: ");
        String titular = sc.nextLine();

        System.out.println("Há um depósito inicial? (s/n) ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.printf("Insira o valor inicial do depósito: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numerdoDaConta, titular, depositoInicial);
        }
        else {
            conta = new Conta(numerdoDaConta, titular);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);
        sc.close();
    }
}
