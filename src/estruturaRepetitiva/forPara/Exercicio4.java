package estruturaRepetitiva.forPara;

import java.util.Scanner;

//Criar um programa que entre com cem n�meros e imprima o quadrado de cada n�mero.

public class Exercicio4 {

	public static void main(String[] args) {

		System.out.println("Insira um n�mero:");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double numero = sc.nextDouble();
		int x = 1;

		while (x <= 99) {

			for (x = 1; x <= 99; x++) {
				double quadrado = Math.pow(numero, 2);
				System.out.println("O quadrado de " + numero + " � " + quadrado + ".");

				System.out.println("Insira um n�mero:");
				numero = sc.nextDouble();
			}

		}
		for (x = 100; x == 100; x++) {
			double quadrado = Math.pow(numero, 2);
			System.out.println("O quadrado de " + numero + " � " + quadrado + ".");
	
		}

		sc.close();
	}

}
