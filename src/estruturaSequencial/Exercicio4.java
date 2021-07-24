package estruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número do funcionário:");
		int numFuncionario = sc.nextInt();
		System.out.println("Insira seu número de horas trabalhadas:");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Insira o valor que ele recebe por hora:");
		double valorHora = sc.nextDouble();

		double salario = horasTrabalhadas * valorHora;
		System.out.printf("O número do funcionário é %d e o seu salário é %.2f. %n", numFuncionario, salario);

		sc.close();
	}

}
