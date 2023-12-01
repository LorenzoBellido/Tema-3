package atributos02;

public class Rectangulo {
	double ancho;
	double alto;
	public Rectangulo(double ancho, double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	public Rectangulo() {
		
	}
	
	public double perimetro() {
		double res;
		
		res = (ancho*2) + (alto*2);
		
		return res;
	}
	public double area() {
		double res;
		
		res = ancho * alto;
		
		return res;
	}
}
