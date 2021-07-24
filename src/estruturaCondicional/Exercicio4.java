package estruturaCondicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int horaInicial, horaFinal, duracao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas o jogo começou?");
		horaInicial = sc.nextInt();
		System.out.println("Que horas o jogo terminou?");
		horaFinal = sc.nextInt();

		if (horaFinal > horaInicial) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		System.out.printf("O jogo durou %d horas.", duracao);

		sc.close();
	}

}
