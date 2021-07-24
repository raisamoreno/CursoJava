package estruturaCondicional;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		double x = 0, y = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor de X:");
		x = sc.nextDouble();
		System.out.println("Insira o valor de Y:");
		y = sc.nextDouble();

		if (x == 0 && y == 0) {
			System.out.println("O ponto est� na origem.");
		} 
		else if (x == 0) {
			System.out.println("O ponto est� no eixo Y.");
		}
		else if (y == 0) {
			System.out.println("O ponto est� no eixo X.");
		}
		else if (x > 0 && y > 0) {
			System.out.println("O ponto est� no Q1.");
		}
		else if (x < 0 && y > 0) {
			System.out.println("O ponto est� no Q2.");
		}
		else if (x < 0 && y < 0) {
			System.out.println("O ponto est� no Q3.");
		}
		else {
			System.out.println("O ponto est� no Q4.");
		}

		sc.close();
	}
}
