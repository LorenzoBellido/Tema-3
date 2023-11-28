package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardar un número
		int n;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido un número al usuario
		System.out.println("Introduzca un número.");
		n = sc.nextInt();
		
		// Llamo a la funcion
		Multiplicar.multiplicar(n);
		
		// Cerramos el Scanner
		sc.close();
	}

}
