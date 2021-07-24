package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		double A, B, C, a_circulo, a_trapezio, a_triangulo, a_quadrado, a_retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		a_triangulo = (A * C)/2;
		a_circulo = 3.14159 * Math.pow(C, 2);
		a_trapezio = (A + B) * C/2;
		a_quadrado = Math.pow (B, 2);
		a_retangulo = A * B;
		
		
		System.out.printf("Área do triângulo: %.3f%n", a_triangulo );
		System.out.printf("Área do círculo: %.3f%n", a_circulo);
		System.out.printf("Área do trapézio: %.3f%n", a_trapezio);
		System.out.printf("Área do quadrado: %.3f%n", a_quadrado);
		System.out.printf("Área do retângulo: %.3f%n", a_retangulo);
		
		sc.close();
		
		
	}

}
