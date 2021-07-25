package estruturaCondicional;

import java.util.Scanner;

//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o
//mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de
//24 horas.

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
		} 
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O jogo durou %d horas.", duracao);

		sc.close();
	}

}
