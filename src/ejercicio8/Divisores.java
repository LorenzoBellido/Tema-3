package ejercicio8;

public class Divisores {
	public static boolean esPrimo(int n) {
		boolean esPrimo = true;
		if (n == 1) {
			esPrimo = false;
		} else {
			for(int i = 2; i<n; i++) {
				if(n%i == 0) {
					esPrimo = false;
					break;
				}
			}
		}
				
		return esPrimo;
	}

	public static int numDivisores(int n) {
	    int contador = 0;
	    for (int i = 2; i <= n; i++) {
	        if (n % i == 0 && esPrimo(i)) {
	            contador++;
	        }
	    }
	    return contador;
	}
}
