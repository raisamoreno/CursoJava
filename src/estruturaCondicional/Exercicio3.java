package estruturaCondicional;

import java.util.Scanner;

//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou 
//"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números
//devem poder ser digitados em ordem crescente ou decrescente.

public class Exercicio3 {
	public static void main(String[] args) {
		int a, b, x;
		x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número A:");
		a = sc.nextInt();
		
		System.out.println("Insira o número B:");
		b = sc.nextInt();
		
		if (a > b) {
			x = a;

			if (x % b == 0) {
				System.out.printf("Os número %d e %d são múltiplos.", x, b);
			} 
			else if (x % b == 1) {
				System.out.printf("Os números %d e %d não são múltiplos.", x, b);
			}
			
		} else {
			if (b % a == 0) {
				System.out.printf("Os números %d e %d são múltiplos.", a, b);
			}
			else if (b % a == 1) {
				System.out.printf("Os números %d e %d não são múltiplos.", a, b);
			}
		}
		sc.close();
	}
}
