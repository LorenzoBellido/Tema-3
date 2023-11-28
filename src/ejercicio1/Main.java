package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variable
		int n;
		
		// Scanner para leer del teclado
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        // Llamamos a la funcion
        Eco.eco(n);
     
    	// Cerramos el Scanner
		sc.close();
	}

}
