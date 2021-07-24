package estruturaCondicional;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		double valor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um valor:");
		valor = sc.nextDouble();
		if (valor >= 0 && valor <= 25) {
			System.out.println("O valor está no intervalo de [0, 25].");
		} else if (valor > 25 && valor <= 50) {
			System.out.println("O valor está no intervalo de (25, 50].");
		} else if (valor > 50 && valor <= 75) {
			System.out.println("O valor está no intervalo de (50, 75].");
		} else if (valor > 75 && valor <= 100) {
			System.out.println("O valor está no intervalo de (75, 100].");
		} else {
			System.out.println("O valor está fora do intervalo.");
		}

		sc.close();
	}

}
