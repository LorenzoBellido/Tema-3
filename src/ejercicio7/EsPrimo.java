package ejercicio7;

public class EsPrimo {
	
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

}