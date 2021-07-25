package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Ler v�rios n�meros e informar quantos n�meros entre 100 e 200 foram digitados. 
//Quando o valor zero for lido, o programa dever� cessar sua execu��o.

public class Exercicio4 {

	public static void main(String[] args) {

		System.out.println("Insira um n�mero:");
		Scanner sc = new Scanner(System.in);
		double numero = sc.nextDouble();
		int soma = 0;

		while (numero != 0) {

			if (numero >= 100 && numero <= 200) {
				soma += 1;
				System.out.println("Insira um n�mero:");
				numero = sc.nextDouble();
			} 
			else {
				System.out.println("Insira um n�mero:");
				numero = sc.nextDouble();

			}
		}

		System.out.printf("Foram digitados %d n�meros entre 100 e 200.", soma);
		
		sc.close();

	}

}
