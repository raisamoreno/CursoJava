package estruturaCondicional;

import java.util.Scanner;

public class AtribuicaoCumulativa {

	public static void main(String[] args) {

		double valor = 50.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos minutos foram consumidos no m�s?");
		int minutos = sc.nextInt();
		if (minutos > 100) {
			// a express�o abaixo � equivalente a valor == valor +(minutos - 100) * 2;
			valor += (minutos - 100) * 2;
		}
		System.out.printf("O valor da conta � R$ %.2f reais.", valor);
		sc.close();
	}

}
