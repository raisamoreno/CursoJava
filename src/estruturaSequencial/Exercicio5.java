package estruturaSequencial;

import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada
//peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
//Calcule e mostre o valor a ser pago.

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o código da primeira peça:");
		@SuppressWarnings("unused")
		String code1 = sc.next();
		
		System.out.println("Qual a quantidade de peças?");
		int qtd1 = sc.nextInt();
		
		System.out.println("Qual o valor unitário desta peça?");
		float vUnitario1 = sc.nextFloat();
		
		float vTotal1 = qtd1 * vUnitario1;

		System.out.println("Insira o código da segunda peça:");
		@SuppressWarnings("unused")
		String code2 = sc.next();
		
		System.out.println("Qual a quantidade de peças?");
		int qtd2 = sc.nextInt();
		
		System.out.println("Qual o valor unitário desta peça?");
		float vUnitario2 = sc.nextFloat();

		float vTotal2 = qtd2 * vUnitario2;
		

		float somaVTotal1VTotal2 = vTotal1 + vTotal2;

		System.out.printf("O valor a pagar é R$ %.2f reais.", somaVTotal1VTotal2);

		sc.close();
	}

}
