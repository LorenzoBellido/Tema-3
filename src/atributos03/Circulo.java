package atributos03;

public class Circulo {
	double radio;
	
	public Circulo() {
		
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double circunferencia() {
		double res = 0;
		res = Math.PI*(radio*2);
		return res;
	}
	public double area() {
		double res = 0;
		res = Math.PI*Math.pow(radio, 2);
		return res;
	}
}
