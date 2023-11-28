package ejercicio2;

public class NumerosComprendidos {
	// Esta función acepta dos enteros y muestra todos los números comprendidos
	// entre ellos.
	public static void numerosComprendidos(int a, int b) {
		if (a < b) {
			for (int i = a; i <= b; i++) {
				// Imprime el número actual.
				System.out.println(i);
			}
		} else if (a > b) {
			for (int i = b; i <= a; i++) {
				// Imprime el número actual.
				System.out.println(i);
			}
		} else {
			System.out.println("Los números son iguales.");
		}
	}
}
