package estruturaRepetitiva.forPara;

import java.util.Scanner;

//Criar um algoritmo que entre com 100 números e imprima a média aritmética desses números.

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soma = 0;
		double mediaAritmetica;

		System.out.println("Insira um número: ");
		double numero = sc.nextDouble();

		for (int i = 1; i < 100; i++) {
			soma += numero;

			System.out.println("Insira um número: ");
			numero = sc.nextDouble();
		}
		
		soma += numero;
		mediaAritmetica = soma / 100;

		System.out.println("A média aritmetica dos 100 números digitados é: " + mediaAritmetica);
		sc.close();

	}

}
