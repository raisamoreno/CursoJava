package estruturaCondicional;

import java.util.Scanner;

//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.

public class Exercicio1 {
	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um n�mero inteiro:");
		numero = sc.nextInt();

		if (numero >= 0) {
			System.out.println("Este n�mero � positivo.");
		} else {
			System.out.println("Este n�mero � negativo.");

		}

		sc.close();
	}

}
