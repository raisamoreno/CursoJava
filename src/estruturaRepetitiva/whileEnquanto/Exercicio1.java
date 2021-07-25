package estruturaRepetitiva.whileEnquanto;

import java.util.Scanner;

//Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura 
//de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada
//corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere
//que a senha correta � o valor 2002.

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a senha:");
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha inv�lida.Insira a senha novamente:");
			senha = sc.nextInt();
		}
		
		System.out.println("Senha correta.");
		
		sc.close();
	}

}
