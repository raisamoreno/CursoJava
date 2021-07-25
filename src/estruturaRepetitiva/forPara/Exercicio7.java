package estruturaRepetitiva.forPara;

import java.util.Scanner;

//Criar um algoritmo que entre com 100 n�meros e imprima a m�dia aritm�tica desses n�meros.

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soma = 0;
		double mediaAritmetica;

		System.out.println("Insira um n�mero: ");
		double numero = sc.nextDouble();

		for (int i = 1; i < 100; i++) {
			soma += numero;

			System.out.println("Insira um n�mero: ");
			numero = sc.nextDouble();
		}
		
		soma += numero;
		mediaAritmetica = soma / 100;

		System.out.println("A m�dia aritmetica dos 100 n�meros digitados �: " + mediaAritmetica);
		sc.close();

	}

}
