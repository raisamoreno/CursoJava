package estruturaSequencial;

import java.util.Scanner;

//Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar o valor da �rea
//deste c�rculo com quatro casas decimais conforme exemplos.

public class Exercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor do raio?");
		float raio = sc.nextFloat();

		double areaDoCirculo = 3.14159 * Math.pow(raio, 2);
		System.out.printf("A �rea do c�rculo, com somente 4 casas decimais, � de %.4f%n", areaDoCirculo);
		System.out.printf("A �rea do c�ruculo, com v�rias casas decimais, � de %f%n", areaDoCirculo);

		sc.close();
	}
}
