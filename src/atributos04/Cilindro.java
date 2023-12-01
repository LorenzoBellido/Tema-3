package atributos04;

public class Cilindro {
	double radioBase;
	double altura;
	public Cilindro(double radioBase, double altura) {
		super();
		this.radioBase = radioBase;
		this.altura = altura;
	}
	public Cilindro() {
		
	}
	
	double volumen() {
		double res = 0;
		
		res = Math.PI * Math.pow(radioBase, 2) * altura;
		
		return res;
	}
	
	double area () {
		double res = 0;
		
		res = 2* Math.PI * radioBase * altura + 2* Math.PI * Math.pow(radioBase, 2);
		
		return res;
	}
	
}
