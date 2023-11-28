package Ejercicio4;

public class esVocal {
	public static boolean esVocal(String c) {
		boolean res = false;
		switch(c.toLowerCase()) {
		case "a", "e", "i", "o","u":
			res = true;
		}
		return res;
	}
}
