package media;

import java.util.Scanner;

import suma.Suma;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardar los números enteros para sumar y el resultado
		int a1, b1;
		// Variable donde guardar los números decimales para sumar y el resultado
		int a, b, c, res;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido los números
		System.out.println("Introduzca los números para realizar su media");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		res = Suma.suma(a, b);
		System.out.println(res);

	}

}
