package estruturaSequencial;

import java.util.Scanner;

//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas,
//o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o
//n�mero e o sal�rio do funcion�rio, com duas casas decimais.

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o n�mero do funcion�rio:");
		int numFuncionario = sc.nextInt();
		
		System.out.println("Insira seu n�mero de horas trabalhadas:");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.println("Insira o valor que ele recebe por hora:");
		double valorHora = sc.nextDouble();

		double salario = horasTrabalhadas * valorHora;
		System.out.printf("O n�mero do funcion�rio � %d e o seu sal�rio � %.2f. %n", numFuncionario, salario);

		sc.close();
	}

}
