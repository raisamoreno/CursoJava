package estruturaSequencial;

import java.util.Locale;

import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
//Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class Exercicio_6 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		double A, B, C, a_circulo, a_trapezio, a_triangulo, a_quadrado, a_retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		a_triangulo = (A * C)/2;
		a_circulo = 3.14159 * Math.pow(C, 2);
		a_trapezio = (A + B) * C/2;
		a_quadrado = Math.pow (B, 2);
		a_retangulo = A * B;
		
		
		System.out.printf("Área do triângulo: %.3f%n", a_triangulo );
		System.out.printf("Área do círculo: %.3f%n", a_circulo);
		System.out.printf("Área do trapézio: %.3f%n", a_trapezio);
		System.out.printf("Área do quadrado: %.3f%n", a_quadrado);
		System.out.printf("Área do retângulo: %.3f%n", a_retangulo);
		
		sc.close();
		
		
	}

}
