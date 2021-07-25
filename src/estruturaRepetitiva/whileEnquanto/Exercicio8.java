package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Criar um programa que possa ler um conjunto de pedidos de compra e calcule o valor total
//da compra. Cada pedido � composto pelos seguintes campos: n�mero, pre�o e quantidade.
//O programa dever� processar novos pedidos at� que o usu�rio digite zero para n�mero de pedido.

public class Exercicio8 {

	public static void main(String[] args) {

		double valorFinal = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o n�mero do pedido:");
		int numeroPedido = sc.nextInt();

		while (numeroPedido != 0) {
			System.out.println("Insira o pre�o:");
			double preco = sc.nextDouble();

			System.out.println("Insira a quantidade:");
			int quantidade = sc.nextInt();

			double valorPedido = preco * quantidade;
			valorFinal += valorPedido;

			System.out.println("Insira o n�mero do pedido:");
			numeroPedido = sc.nextInt();

		}

		System.out.printf("O valor final do pedido � R$ %.2f reais.", valorFinal);
		sc.close();

	}

}
