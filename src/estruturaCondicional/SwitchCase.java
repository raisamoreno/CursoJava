package estruturaCondicional;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Insira o código:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		default:
			dia = "valor invalido";
			break;
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terca";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}
