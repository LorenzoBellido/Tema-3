package suma;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardar los números enteros para sumar y el resultado
		int a1, b1, res1;
		// Variable donde guardar los números decimales para sumar y el resultado
		double a, b, res;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido los números
		System.out.println("Introduzca los números para sumar");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		res = Suma.suma(a, b);
		System.out.println(res);
	}

}
