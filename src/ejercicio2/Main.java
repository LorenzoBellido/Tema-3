package ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Variables donde guardar a y b
		int a, b;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario dos números
		System.out.print("Introduce el primer número: ");
		a = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		b = sc.nextInt();

		// Llama a la función para mostrar los números comprendidos entre a y b.
		NumerosComprendidos.numerosComprendidos(a, b);

		// Cerramos el Scanner
		sc.close();
	}
}