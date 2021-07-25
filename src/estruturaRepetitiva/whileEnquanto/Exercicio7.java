package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

public class Exercicio7 {

//Criar um programa que entre com a idade de várias pessoas e imprima:
//		a)	Total de pessoas com menos de 21 anos;
//		b)	Total de pessoas com mais de 50 anos.
//Quando a idade lida for zero encerra a execução.
	public static void main(String[] args) {
		int menos21 = 0;
		int mais50 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a idade:");
		int idade = sc.nextInt();

		while (idade != 0) {

			if (idade < 21) {
				menos21 += 1;
			}

			if (idade > 50) {
				mais50 += 1;
			}

			System.out.println("Insira a idade:");
			idade = sc.nextInt();
		}

		System.out.println("Quantidade de pessoas com menos de 21 anos: " + menos21);
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + mais50);

		sc.close();
	}

}
