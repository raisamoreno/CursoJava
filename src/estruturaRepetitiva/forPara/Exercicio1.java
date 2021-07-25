package estruturaRepetitiva.forPara;

import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor 
//por linha, inclusive o X, se for o caso.

public class Exercicio1 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de X:");

		int x = sc.nextInt();

		while (x > 1000) {
			System.out.println("Valor inv�lido. Insira outro valor de 1 at� 1000:");
			
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
