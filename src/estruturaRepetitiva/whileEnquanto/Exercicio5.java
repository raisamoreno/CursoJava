package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Criar um programa que entre com a profiss�o de v�rias pessoas e imprima quantos s�o 
//programadores. Quando o valor �fim� for lido, o programa dever� cessar sua execu��o.

public class Exercicio5 {

	public static void main(String[] args) {

		int soma = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a profiss�o?");
		String profissao = sc.next();
// para comparar uma string a um determinado valor n�o se pode usar == ou !=
// em vez disso usa-se a estrutura string.equals(outraString) para igualdade
// ou !string.equals(outraString) para diferen�a.
		while (!profissao.equals("fim")) {

			if (profissao.equals("programador") ) {
				soma = soma + 1;
			} 
				System.out.println("Qual a profiss�o?");
				profissao = sc.next();
			}
		
			System.out.println("Total de programadores: " + soma + ".");
			
			sc.close();
		}
		
		
	}


