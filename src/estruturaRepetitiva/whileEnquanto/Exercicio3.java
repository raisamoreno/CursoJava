package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {

		int alcool = 0, gasolina = 0, diesel = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o c�digo:");
		int codigo = sc.nextInt();

		while (codigo != 4) {
			if (codigo >= 1 && codigo <= 3) {
				
				if (codigo == 1) {
					alcool += 1;
					System.out.println("Insira um novo c�digo:");
					codigo = sc.nextInt();
					
				} 
				else if (codigo == 2) {
					     gasolina += 1;
					     System.out.println("Insira um novo c�digo:");
					     codigo = sc.nextInt();
				} 
				else {
					diesel += 1;
					System.out.println("Insira um novo c�digo:");
					codigo = sc.nextInt();
				}
			} 
			else {
				System.out.println("Fora do intervalo. Insira um novo c�digo:");
				codigo = sc.nextInt();
			}

		}
		System.out.println("Muito obrigado!");
		System.out.printf("A quantidade de clientes que abasteceram com �lcool foi %d.%n", alcool);
		System.out.printf("A quantidade de clientes que abasteceram com gasolina foi %d.%n", gasolina);
		System.out.printf("A quantidade de clientes que abasteceram com diesel foi %d.%n", diesel);
		sc.close();
	}
}
