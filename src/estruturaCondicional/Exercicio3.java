package estruturaCondicional;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		int a, b, x;
		x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o n�mero A:");
		a = sc.nextInt();
		System.out.println("Insira o n�mero B:");
		b = sc.nextInt();
		if (a > b) {
			x = a;

			if (x % b == 0) {
				System.out.printf("Os n�mero %d e %d s�o m�ltiplos.", x, b);
			} else if (x % b == 1) {
				System.out.printf("Os n�meros %d e %d n�o s�o m�ltiplos.", x, b);

			}
		} else {
			if (b % a == 0) {
				System.out.printf("Os n�meros %d e %d s�o m�ltiplos.", a, b);
			} else if (b % a == 1) {
				System.out.printf("Os n�meros %d e %d n�o s�o m�ltiplos.", a, b);
			}
		}
		sc.close();
	}
}
