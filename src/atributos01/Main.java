package atributos01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	// Scanner para leer del teclado
	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		// Variable donde guardar la función
		int opc = -1;
		// Bucle que muestra las opciones y no termina hasta que no se introduce el valor comprendido entre 0 y 6
			do {
				System.out.println("Introduzca una opción:");
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Dividir");
				System.out.println("5. Máximo");
				System.out.println("6. Míniimo");
				System.out.println("0. Salir");
				try {
					opc = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Valor erróneo");
				}
				finally {
					sc.nextLine();
				}
			}while(opc < 0 || opc > 6);
			// Devuelve la opcion
			return opc;
	}
	
	public static double pideNumero() {
		// Variable donde guardar el numero
		double numero = 0;
		// Booleano para el bucle
		boolean seguir = true;
		// Bucle que muestra las opciones y no termina hasta que no se introduce el valor comprendido
		do {
			try {
				System.out.println("Introduzca un número");
				numero = sc.nextDouble();
				seguir = false;
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido es erróneo");
			} finally {
				sc.nextLine();
			}
			
		}while(seguir);
		// Devuelve un número
		return numero;
	}

	
	public static void main(String[] args) {
		// Variables donde guardar los números, la opc y el resultado
		int opc;
		double num1, num2, res = 0;
			
		// Mostrar el menú
		opc = menu();
		
		// Pedir números al usuario
		num1 = pideNumero();
		num2 = pideNumero();
		 // Creo el objeto de la funcion operaciones
		Operaciones op = new Operaciones(num1, num2);
		
		// Switch para realizar cada operacion segun la opcion
		switch(opc) {
		case 1 -> res = op.suma();
		case 2 -> res = op.resta();
		case 3 -> res = op.multiplicar();
		case 4 -> res = op.dividir();
		case 5 -> res = op.maximo();
		case 6 -> res = op.minimo();
		default -> System.out.println("Fin.");
		
		}
		// Muestro el resultado
			System.out.println(res);
			
	}

}
