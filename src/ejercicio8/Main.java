package ejercicio8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardar el número introducido y la cantidad de divisores
		int n, contador;
		
		// Variable booleana donde guardar si es primo
		boolean esPrimo;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario un número
		System.out.println("Introduzca un número");
		n = sc.nextInt();
		
		// Llamo a la funcion
		contador = Divisores.numDivisores(n);
		
		// Muestro el resultado
		System.out.println("El número de divisores de " + n + " es " + contador);
		
		// Cerramos el Scanner
		sc.close();
	}

}
