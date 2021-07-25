package estruturaCondicional;

import java.util.Scanner;

//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação

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
