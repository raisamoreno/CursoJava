package estruturaSequencial;

import java.util.Scanner;

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
