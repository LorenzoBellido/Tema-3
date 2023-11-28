package ejercicio10;

public class Fecha {

	public static boolean fecha(int dia, int mes, int anyo) {
		boolean fecha = false;
		
		if (dia >= 1 && dia <= 30 && mes >= 1&& mes <= 12) {
			fecha = true;

		}else {
			fecha = false;
		}
		return fecha;
	}
}
