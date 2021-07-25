package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Ler vários números e informar quantos números entre 100 e 200 foram digitados. 
//Quando o valor zero for lido, o programa deverá cessar sua execução.

public class Exercicio4 {

	public static void main(String[] args) {

		System.out.println("Insira um número:");
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		int soma = 0;

		while (numero != 0) {

			if (numero >= 100 && numero <= 200) {
				soma += 1;
				System.out.println("Insira um número:");
				numero = sc.nextDouble();
			} 
			else {
				System.out.println("Insira um número:");
				numero = sc.nextDouble();

			}
		}

		System.out.printf("Foram digitados %d números entre 100 e 200.", soma);
		
		sc.close();

	}

}
