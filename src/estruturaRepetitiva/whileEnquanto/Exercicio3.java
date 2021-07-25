package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Um Posto de combust�veis deseja determinar qual de seus produtos tem a prefer�ncia de seus
//clientes. Escreva um algoritmo para ler o tipo de combust�vel abastecido (codificado da 
//seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim). Caso o usu�rio informe um c�digo
//inv�lido (fora da faixa de 1 a 4) deve ser solicitado um novo c�digo (at� que seja v�lido).
//O programa ser� encerrado quando o c�digo informado for o n�mero 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de
//combust�vel, conforme exemplo.

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
