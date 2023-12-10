package atributos02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// Scanner para leer del teclado
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		// Variable donde guardar la función
		int opc = -1;
		// Bucle que muestra las opciones y no termina hasta que no se introduce el
		// valor comprendido entre 0 y 6
		do {
			System.out.println("Introduzca una opción:");
			System.out.println("1. Perímetro");
			System.out.println("2. Área");
			System.out.println("0. Salir");
			try {
				opc = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Valor erróneo");
			} finally {
				sc.nextLine();
			}
		} while (opc < 0 || opc > 2);
		// Devuelve la opcion
		return opc;
	}

	public static double pideAncho() {
		double numero = 0;
		boolean seguir = true;

		do {
			try {
				System.out.println("Introduzca un número");
				numero = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor erróneo");
			} finally {
				sc.nextLine();
			}
		} while (seguir);

		return numero;
	}

	public static double pideAlto() {
		System.out.println("Introduzca un número");
		double numero = 0;
		boolean seguir = true;

		do {
			try {
				numero = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor erróneo");
			} finally {
				sc.nextLine();
			}
		} while (seguir);

		return numero;
	}

	public static void main(String[] args) {
		// Variables donde guardar la opcion, el resultado, el ancho y el alto
		int opc;
		double ancho;
		double alto;
		double res;

		// Llamamos a la función menú
		opc = menu();

		// Bucle para seguir pidiendo el menú de opciones
		while (opc > 0) {

			// Llamamos a la función pideAncho y pideAlto
			ancho = pideAncho();
			alto = pideAlto();

			Rectangulo rec = new Rectangulo(ancho, alto);

			switch (opc) {
			case 1 -> {
				res = rec.perimetro();
				System.out.println("El perímetro del rectángulo es: " + res);
			}
			case 2 -> {
				res = rec.area();
				System.out.println("El área del rectangulo es: " + res);
			}

			}
			// Llamamos a la función menú
			opc = menu();
		}

	}

}
