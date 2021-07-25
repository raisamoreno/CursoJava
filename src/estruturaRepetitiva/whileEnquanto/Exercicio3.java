package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus
//clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da 
//seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código
//inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).
//O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de
//combustível, conforme exemplo.

public class Exercicio3 {
	
	public static void main(String[] args) {

		int alcool = 0, gasolina = 0, diesel = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o código:");
		int codigo = sc.nextInt();

		while (codigo != 4) {
			if (codigo >= 1 && codigo <= 3) {
				
				if (codigo == 1) {
					alcool += 1;
					System.out.println("Insira um novo código:");
					codigo = sc.nextInt();
					
				} 
				else if (codigo == 2) {
					     gasolina += 1;
					     System.out.println("Insira um novo código:");
					     codigo = sc.nextInt();
				} 
				else {
					diesel += 1;
					System.out.println("Insira um novo código:");
					codigo = sc.nextInt();
				}
			} 
			else {
				System.out.println("Fora do intervalo. Insira um novo código:");
				codigo = sc.nextInt();
			}

		}
		
		System.out.println("Muito obrigado!");
		System.out.printf("A quantidade de clientes que abasteceram com álcool foi %d.%n", alcool);
		System.out.printf("A quantidade de clientes que abasteceram com gasolina foi %d.%n", gasolina);
		System.out.printf("A quantidade de clientes que abasteceram com diesel foi %d.%n", diesel);
		
		sc.close();
	}
}
