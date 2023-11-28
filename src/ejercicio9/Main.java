package ejercicio9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variables donde guardar la opcion, los números y el resultado
		int opc, num1, num2, res = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usuario la opcion y los numeros
		System.out.println("Introduzca la operación que quiere hacer. [1]Sumar [2]Restar [3]Multiplicar [4]Dividir");
		opc=sc.nextInt();
		
		System.out.println("Introduzca dos números");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		// Llamo a la funcion
		res = Calculadora.calculadora(opc, num1, num2, res);
		// Muestro el resultado
		System.out.println("El resultado es: " + res);
	}

}
