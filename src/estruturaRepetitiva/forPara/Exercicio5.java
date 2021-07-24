package estruturaRepetitiva.forPara;

//Criar um programa que imprima todos os números pares de 1 até 100.

public class Exercicio5 {
	public static void main(String[] args) {

		int i = 1;
		
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.printf("O número %d é par. %n", i);
				
			} 
			
		}
	}

}
