package estruturaSequencial;

import java.util.Scanner;

//Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. 
//Em seguida, calcule e mostre:
//a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
//b) a �rea do c�rculo de raio C. (pi = 3.14159)
//c) a �rea do trap�zio que tem A e B por bases e C por altura.
//d) a �rea do quadrado que tem lado B.
//e) a �rea do ret�ngulo que tem lados A e B.

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

		System.out.printf("A �rea do tri�ngulo � %.3f.%n", aTrianguloRetangulo);
		System.out.printf("A �rea do c�rculo � %.3f.%n", aCirculo);
		System.out.printf("A �rea do trap�zio � %.3f.%n", aTrapezio);
		System.out.printf("A �rea do quadrado � %.3f.%n", aQuadrado);
		System.out.printf("A �rea do ret�ngulo � %.3f.%n", aRetangulo);

		sc.close();

	}

}
