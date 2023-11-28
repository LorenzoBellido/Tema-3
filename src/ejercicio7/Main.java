package ejercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Boolean donde guardar si es primo
		boolean esPrimo;
		
		// Variable donde guardar un número
		int n;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al usuario
		System.out.println("Introduzca un número.");
		n = sc.nextInt();
		
		// Llamamos a la funcion
		esPrimo = EsPrimo.esPrimo(n);
		
		// Muestro el resultado en condicion a si es primo o no
		if(esPrimo) {
			System.out.println("El número es primo");
		}else {
			System.out.println("El número no es primo");
		}
		
		//Cerramos el Scanner
		sc.close();

	}

}
