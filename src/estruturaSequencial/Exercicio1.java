package estruturaSequencial;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro valor:");
		int num1 = sc.nextInt();

		System.out.println("Insira o segundo valor:");
		int num2 = sc.nextInt();

		int soma = num1 + num2;

		System.out.printf("A soma é: %d", soma);
		sc.close();

	}

}
