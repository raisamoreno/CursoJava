package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de X:");
		double x = sc.nextDouble();
		
		System.out.println("Insira o valor de Y:");
		double y = sc.nextDouble();

		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante.");
			} 
			else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante.");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante.");
			}
			else {
				System.out.println("Terceiro quadrante.");
			}
			
			System.out.println("Insira o valor de X:");
			x = sc.nextDouble();
			
			System.out.println("Insira o valor de Y:");
			y = sc.nextDouble();
		}
		
		System.out.println("Uma das coordenadas é nula.");
		sc.close();
	}

}
