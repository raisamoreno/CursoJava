package estruturaCondicional;

import java.util.Scanner;

//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade 
//deste item. A seguir, calcule e mostre o valor da conta a pagar.

//        |*CÓDIGO*| *ESPECIFICAÇÃO* | *PREÇO* |
//        |   1    | Cachorro-quente | R$ 4,00 |
//        |   2    | X-Salada        | R$ 4,50 |
//        |   3    | X-Bacon         | R$ 5,00 |
//        |   4    | Torrada simples | R$ 2,00 |
//        |   5    | Refrigerante    | R$ 1,50 |

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		int codigo, quantidade;
		double preco = 0, valorTotal = 0;
		String item;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o código do item consumido?");
		codigo = sc.nextInt();
		
		System.out.println("Qual a quantidade de itens consumidos?");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			item = "Cachorro-quente";
			preco = 4;
		} 
		else if (codigo == 2) {
			item = "X-Salada";
			preco = 4.5;
		} 
		else if (codigo == 3) {
			item = "X-Bacon";
			preco = 5;
		} 
		else if (codigo == 4) {
			item = "Torrada Simples";
			preco = 2;
		} 
		else {
			item = "Refrigerante";
			preco = 1.5;
		}
		
		valorTotal = preco * quantidade;
		System.out.printf("O item consumido foi %s e o total é R$ %.2f.", item, valorTotal);
		
		sc.close();
	}
}
