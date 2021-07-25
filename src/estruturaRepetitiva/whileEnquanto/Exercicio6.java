package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Criar um programa que entre com o sexo de várias pessoas (M / F) e imprima o total de pessoas
//do sexo masculino e total de pessoas do sexo feminino. Quando o valor “P” for lido, o
//programa deverá cessar sua execução.

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int somaMasculino = 0;
		int somaFeminino = 0;

		System.out.println("Insira o sexo ('M' ou 'F'): ");
		String sexo = sc.next();

		while (!sexo.equals("P")) {
			switch (sexo) {
			case "F":
				somaFeminino += 1;
			case "M":
				somaMasculino += 1;
			}
			
			System.out.println("Insira o sexo ('M' ou 'F'): ");
			sexo = sc.next();
		}
		System.out.println("Quantidade de pessoas do sexo masculino: " + somaMasculino + ".");
		System.out.println("Quantidade de pessoas do sexo feminino: " + somaFeminino + ".");

		sc.close();
	}

}
