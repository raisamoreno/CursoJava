package estruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o código da primeira peça:");
		String code1 = sc.next();
		System.out.println("Qual a quantidade de peças?");
		int qtd1 = sc.nextInt();
		System.out.println("Qual o valor unitário desta peça?");
		float vUnitario1 = sc.nextFloat();

		float vTotal1 = qtd1 * vUnitario1;

		System.out.println("Insira o código da segunda peça:");
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
