package estruturaCondicional;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		double salario, impostoRenda = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o salário:");

		salario = sc.nextDouble();

		if (salario >= 0 && salario <= 2000) {
			impostoRenda = 0;

		} else if (salario <= 3000) {
			impostoRenda = (salario - 2000) * 0.08;

		} else if (salario <= 4500) {
			impostoRenda = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;

		} else {
			impostoRenda = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (impostoRenda == 0) {
			System.out.println("Habitante isento de imposto de renda.");
		} else {
			System.out.printf("Habitante paga R$ %.2f rombus de imposto de renda.", impostoRenda);
		}
		sc.close();
	}
}
