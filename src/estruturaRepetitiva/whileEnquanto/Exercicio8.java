package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Criar um programa que possa ler um conjunto de pedidos de compra e calcule o valor total
//da compra. Cada pedido é composto pelos seguintes campos: número, preço e quantidade.
//O programa deverá processar novos pedidos até que o usuário digite zero para número de pedido.

public class Exercicio8 {

	public static void main(String[] args) {

		double valorFinal = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o número do pedido:");
		int numeroPedido = sc.nextInt();

		while (numeroPedido != 0) {
			System.out.println("Insira o preço:");
			double preco = sc.nextDouble();

			System.out.println("Insira a quantidade:");
			int quantidade = sc.nextInt();

			double valorPedido = preco * quantidade;
			valorFinal += valorPedido;

			System.out.println("Insira o número do pedido:");
			numeroPedido = sc.nextInt();

		}

		System.out.printf("O valor final do pedido é R$ %.2f reais.", valorFinal);
		sc.close();

	}

}
