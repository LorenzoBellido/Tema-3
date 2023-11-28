package ejercicio3;

public class MayorMenor {
	// Esta función muestra el número mayor de los dos
	public static int mayorMenor(int a, int b) {
		int mayor = 0;
		if(a<b) {
			mayor = b;
		}else {
			mayor = a;
		}
		return mayor;
	}
}
