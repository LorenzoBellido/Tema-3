package ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		// Variables donde guardar dos números
		int a, b;
		int mayor;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		//Pido dos números al usuario
		System.out.println("Introduzca dos números.");
		a = sc.nextInt();
		b = sc.nextInt();
		
		// Llamo a la funcion e imprimo el resultado
		mayor = MayorMenor.mayorMenor(a, b);
		System.out.println("El número mayor es: " + mayor);
		
		// Cerramos el Scanner
		sc.close();
	}

}
