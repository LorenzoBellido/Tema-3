package Ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardar el caracter
		String c;
		boolean res;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario una letra
		System.out.println("Introduzca una letra");
		c = sc.next();
		
		res = esVocal.esVocal(c);
		
		if(res) {
			System.out.println("Es Vocal");
		}else {
			System.out.println("No es vocal");
		}
		
		// Cerramos el Scanner
		sc.close();

	}

}
