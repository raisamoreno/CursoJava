package estruturaSequencial;

import java.util.Scanner;

//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada
//pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. 
//Calcule e mostre o valor a ser pago.

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o c�digo da primeira pe�a:");
		@SuppressWarnings("unused")
		String code1 = sc.next();
		
		System.out.println("Qual a quantidade de pe�as?");
		int qtd1 = sc.nextInt();
		
		System.out.println("Qual o valor unit�rio desta pe�a?");
		float vUnitario1 = sc.nextFloat();
		
		float vTotal1 = qtd1 * vUnitario1;

		System.out.println("Insira o c�digo da segunda pe�a:");
		@SuppressWarnings("unused")
		String code2 = sc.next();
		
		System.out.println("Qual a quantidade de pe�as?");
		int qtd2 = sc.nextInt();
		
		System.out.println("Qual o valor unit�rio desta pe�a?");
		float vUnitario2 = sc.nextFloat();

		float vTotal2 = qtd2 * vUnitario2;
		

		float somaVTotal1VTotal2 = vTotal1 + vTotal2;

		System.out.printf("O valor a pagar � R$ %.2f reais.", somaVTotal1VTotal2);

		sc.close();
	}

}
