package estruturaSequencial;

import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor de A:");
		int A = sc.nextInt();

		System.out.println("Insira o valor de B:");
		int B = sc.nextInt();

		System.out.println("Insira o valor de C:");
		int C = sc.nextInt();

		System.out.println("Insira o valor de D:");
		int D = sc.nextInt();

		int diferenca = (A * B - C * D);
		int valorAbsoluto = Math.abs(diferenca);
		System.out.printf("A diferença entre o produto de %d e %d pelo produto de %d e %d é %d. %n", A, B, C, D,
				diferenca);
		System.out.printf("O valor absoluto de %d é %d.%n", diferenca, valorAbsoluto);
		
		sc.close();

	}
}
