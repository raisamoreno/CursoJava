package estruturaSequencial;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A, B, C, D, diferenca;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();

		diferenca = A * B - C * D;
		
		System.out.println("Diferenša = " + diferenca);

		sc.close();

	}

}
