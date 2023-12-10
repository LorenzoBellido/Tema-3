package atributos04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int opc = 0;
		boolean seguir = true;
		do {
			System.out.println("1. Volumen");
			System.out.println("2. Área");
			System.out.println("0. Salir");
			System.out.println("Introduzca una opción");
			try {
				opc = sc.nextInt();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido erróneo");
			} finally {
				sc.nextLine();
			}

		} while (seguir);

		return opc;
	}

	public static double pideRadioBase() {
		double numero = 0;

		do {
			System.out.println("Introduzca el radio");
			try {
				numero = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido erróneo");
			} finally {
				sc.nextLine();
			}
		} while (numero <= 0);

		return numero;
	}

	public static double altura() {
		double numero = 0;

		do {
			System.out.println("Introduzca la altura");
			try {
				numero = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido erróneo");
			} finally {
				sc.nextLine();
			}
		} while (numero <= 0);

		return numero;
	}

	public static void main(String[] args) {
		// Variable donde guardar la opcion, el radio de la base, la altura y el
		// resultado
		int opc;
		double radioBase, altura, res;

		// Llamamos a la funcion menu
		opc = menu();

		// Bucle para seguir pidiendo el menú de opciones
		while (opc > 0) {

			// Llamamos a la funcion radio y altura
			radioBase = pideRadioBase();
			altura = altura();

			// Creamos el objeto Cilindro
			Cilindro cil = new Cilindro(radioBase, altura);
			switch (opc) {
			case 1 -> {
				res = cil.volumen();
				System.out.println("El volumen del cilindro es: " + res);
			}
			case 2 -> {
				res = cil.area();
				System.out.println("El área del cilindro es: " + res);
			}
			default -> {
				System.out.println("Fin.");
			}
			}
			// Llamamos a la funcion menu
			opc = menu();
		}

	}

}
