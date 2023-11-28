package ejercicio6;

public class Cilindro {
	
	public static double cilindro(int opc, double radio, double altura) {
		if(opc == 1) {
			radio = 2 * Math.PI * radio * (altura+radio);
		}else {
			radio = Math.PI * Math.pow(radio, 2) * altura;
		}
		return radio;
	}
}
