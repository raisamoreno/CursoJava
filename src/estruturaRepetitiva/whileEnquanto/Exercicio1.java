package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a senha:");
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inválida.Insira a senha novamente:");
			senha = sc.nextInt();
		}
		System.out.println("Senha correta.");
		sc.close();
	}

}
