package estruturaRepetitiva.forPara;

//Criar um programa que imprima todos os n�meros pares de 1 at� 100.

public class Exercicio5 {
	public static void main(String[] args) {

		int i = 1;
		
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.printf("O n�mero %d � par. %n", i);
				
			} 
			
		}
	}

}
