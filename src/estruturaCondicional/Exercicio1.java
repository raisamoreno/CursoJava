package estruturaCondicional;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número inteiro:");
		numero = sc.nextInt();

		if (numero >= 0) {
			System.out.println("Este número é positivo.");
		} else {
			System.out.println("Este número é negativo.");

		}

		sc.close();
	}

}
