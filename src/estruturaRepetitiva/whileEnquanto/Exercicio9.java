package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Criar um programa que leia v�rios n�meros e imprima o maior e o menor deles.
//Quando for lido o valor zero o finaliza o processamento.

public class Exercicio9 {

	public static void main(String[] args) {

		double maiorNumero = 0;
		double menorNumero = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um n�mero:");
		double numero = sc.nextDouble();

		while (numero != 0) {
			if (numero > maiorNumero) {
				maiorNumero = numero;
			}
			if (numero < menorNumero) {
				menorNumero = numero;
			}

			System.out.println("Insira um n�mero:");
			numero = sc.nextDouble();
		}
		System.out.println("O menor n�mero inserido foi: " + menorNumero);
		System.out.println("O maior n�mero inserido foi: " + maiorNumero);

		sc.close();

	}

}
