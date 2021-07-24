package estruturaRepetitiva.forPara;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de X:");

		int x = sc.nextInt();

		while (x > 1000) {
			System.out.println("Valor inválido. Insira outro valor de 1 até 1000:");
			
			x = sc.nextInt();
		}

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
