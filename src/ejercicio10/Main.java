package ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable donde guardar el dia, el mes y el año
		int dia ,mes ,anyo;
		
		// Variable booleana donde guardar si la fecha es correcta
		boolean fecha;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido al usario el dia, el mes y el año 
		System.out.println("Introduzca el dia, el mes y el año");
		dia = sc.nextInt();
		mes = sc.nextInt();
		anyo = sc.nextInt();
		
		// Llampo a la funcion
		fecha = Fecha.fecha(dia, mes, anyo);
		
		// Muestro el resultado 
		if(fecha) {
			System.out.println("La fecha " + dia + "/" + mes + "/" + anyo + " es correcta.");
		}else {
			System.out.println("La fecha es incorrecta");
		}
		
	}

}
