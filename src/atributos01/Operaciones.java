package atributos01;

public class Operaciones {
	double num1;
	double num2;

	public Operaciones() {

	}

	public Operaciones(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public double suma() {
		return num1 + num2;
	}

	public double resta() {
		return num1 - num2;
	}

	public double multiplicar() {
		return num1 * num2;
	}

	public double dividir() {
		return num1 / num2;
	}

	public double maximo() {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}

	public double minimo() {
		if (num1 > num2) {
			return num2;
		} else {
			return num1;
		}
	}

}
