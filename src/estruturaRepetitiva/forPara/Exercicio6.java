package estruturaRepetitiva.forPara;

import java.util.Scanner;

//Criar um programa que entre com o nome, idade e sexo de 200 pessoas (M / F). Imprimir
//o nome se a pessoa for do sexo masculino e tiver mais de 21 anos.

public class Exercicio6 {

	public static void main(String[] args) {

		int i;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (i = 1; i <= 200; i++) {

			System.out.println("Insira o nome:");
			String nome = sc.next();

			System.out.println("Insira a idade:");
			int idade = sc.nextInt();

			System.out.println("Insira o sexo ('M' ou 'F')");
			String sexo = sc.next();

			if (sexo.equals("M") && idade > 21) {
				System.out.println();
				System.out.printf("%s é do sexo masculino e tem mais de 21 anos. %n", nome);
				System.out.println();
			}

		}
		sc.close();
	}
}