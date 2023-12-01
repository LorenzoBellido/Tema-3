package atributos03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int opc = 0;
		boolean seguir = true;
		do {
			System.out.println("1. Circunferencia");
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
	
	public static double pideRadio() {
		double numero = 0;
		
		do {
			System.out.println("Introduzca el radio");
			try {
				numero = sc.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Valor introducido erróneo");
			}
			finally {
				sc.nextLine();
			}
		}while(numero <= 0);
		
		return numero;
	}

	public static void main(String[] args) {
		// Variables donde guardar la opcion, el radio y el resultado
		int opc;
		double radio,res;
		
		// Llamamos a la función menu
		opc = menu();
		
		// Llamamos a la función pideRadio
		radio = pideRadio();
		
		// Creo el objeto Circulo
		Circulo cir = new Circulo(radio);
		
		// Switch para cada opcion
		switch(opc) {
		case 1-> {
			res = cir.circunferencia();
			System.out.println("La circunferencia del círculo es: " + res);
		}
		case 2-> {
			res = cir.area();
			System.out.println("El área del círculo es: " + res);
		}
		default->System.out.println("Fin.");
		}

	}

}
