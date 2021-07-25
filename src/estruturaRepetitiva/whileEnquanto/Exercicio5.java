package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Criar um programa que entre com a profissão de várias pessoas e imprima quantos são 
//programadores. Quando o valor “fim” for lido, o programa deverá cessar sua execução.

public class Exercicio5 {

	public static void main(String[] args) {

		int soma = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual a profissão?");
		String profissao = sc.next();
// para comparar uma string a um determinado valor não se pode usar == ou !=
// em vez disso usa-se a estrutura string.equals(outraString) para igualdade
// ou !string.equals(outraString) para diferença.
		while (!profissao.equals("fim")) {

			if (profissao.equals("programador") ) {
				soma = soma + 1;
			} 
				System.out.println("Qual a profissão?");
				profissao = sc.next();
			}
		
			System.out.println("Total de programadores: " + soma + ".");
			
			sc.close();
		}
		
		
	}


