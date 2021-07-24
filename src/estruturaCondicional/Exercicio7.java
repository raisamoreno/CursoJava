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
			System.out.println("O ponto está na origem.");
		} 
		else if (x == 0) {
			System.out.println("O ponto está no eixo Y.");
		}
		else if (y == 0) {
			System.out.println("O ponto está no eixo X.");
		}
		else if (x > 0 && y > 0) {
			System.out.println("O ponto está no Q1.");
		}
		else if (x < 0 && y > 0) {
			System.out.println("O ponto está no Q2.");
		}
		else if (x < 0 && y < 0) {
			System.out.println("O ponto está no Q3.");
		}
		else {
			System.out.println("O ponto está no Q4.");
		}

		sc.close();
	}
}
