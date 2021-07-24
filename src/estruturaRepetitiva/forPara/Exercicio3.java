package estruturaRepetitiva.forPara;


//Criar um programa que imprima a soma de todos os números de 1 até 100.

public class Exercicio3 {

	public static void main(String[] args) {


		int x = 1; 
		int soma = 0;
		
		for (soma = 0; x <= 100; x++) {
			soma = x + 1;
		}
		
		System.out.println("A somatória de 1 até 100 é: " + soma);
		
	}

}
