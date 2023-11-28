package ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardar la opción, el radio y la altura
		int opc;
		double radio, altura;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario una opción
		System.out.println("Introduzca una opción: [1] Para calcular el área [2] Para calcular el volumen");
		opc = sc.nextInt();
		
		//Pido el radio y la altura
		System.out.println("Introduzca el radio");
		radio = sc.nextDouble();
		System.out.println("Introduzca la altura");
		altura = sc.nextDouble();
		
		// Llamo a la función
		radio = Cilindro.cilindro(opc,radio,altura);
		
		System.out.println(radio);
		
		// Cerramos el Scanner
		sc.close();
	}

}