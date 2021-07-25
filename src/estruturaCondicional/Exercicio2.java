package estruturaCondicional;

import java.util.Scanner;

//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número inteiro:");
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			
			System.out.println("O número é par.");
			
		} else {
			
			System.out.println("O número é ímpar.");
		}

		sc.close();
	}

}
