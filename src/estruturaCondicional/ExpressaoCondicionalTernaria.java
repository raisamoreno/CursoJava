package estruturaCondicional;

import java.util.Scanner;

public class ExpressaoCondicionalTernaria {
	public static void main(String[] args) {
		System.out.println("Insira o pre�o:");
		Scanner sc = new Scanner(System.in);
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.printf("O desconto � R$ %.2f reais.", desconto);
		sc.close();
	}

}
