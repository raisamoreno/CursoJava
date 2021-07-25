package estruturaSequencial;

import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área
//deste círculo com quatro casas decimais conforme exemplos.

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor do raio?");
		float raio = sc.nextFloat();

		double areaDoCirculo = 3.14159 * Math.pow(raio, 2);
		System.out.printf("A área do círculo, com somente 4 casas decimais, é de %.4f%n", areaDoCirculo);
		System.out.printf("A área do círuculo, com várias casas decimais, é de %f%n", areaDoCirculo);

		sc.close();
	}
}
