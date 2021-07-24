package estruturaSequencial;

import java.util.Scanner;

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
