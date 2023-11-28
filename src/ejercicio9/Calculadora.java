package ejercicio9;

public class Calculadora {

	public static int calculadora(int opc, int num1, int num2, int res) {
		switch(opc) {
		case 1-> res = num1 + num2;		
		case 2-> res = num1 - num2;
		case 3-> res = num1 * num2;
		case 4 -> res = num1 / num2;
		default-> System.out.println("Numero Incorrecto");
		}
		
		return res;
	}
}
