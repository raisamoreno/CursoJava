package estruturaSequencial;

import java.util.Scanner;

//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 
//Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de A:");
		float A = sc.nextFloat();
		
		System.out.println("Insira o valor de B:");
		float B = sc.nextFloat();
		
		System.out.println("Insira o valor de C:");
		float C = sc.nextFloat();

		float aTrianguloRetangulo = (A * C) / 2;
		float aCirculo = (float) (3.14159 * Math.pow(C, 2));
		float aTrapezio = (A + B) * C / 2;
		float aQuadrado = (float) Math.pow(B, 2);
		float aRetangulo = A * B;

		System.out.printf("A área do triângulo é %.3f.%n", aTrianguloRetangulo);
		System.out.printf("A área do círculo é %.3f.%n", aCirculo);
		System.out.printf("A área do trapézio é %.3f.%n", aTrapezio);
		System.out.printf("A área do quadrado é %.3f.%n", aQuadrado);
		System.out.printf("A área do retângulo é %.3f.%n", aRetangulo);

		sc.close();

	}

}
