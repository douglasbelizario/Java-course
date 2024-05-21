package classes_methods_attributes.triangle.entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double calcularArea() {
		double P = (a + b + c) / 2;
		return Math.sqrt(P*(P-a)*(P-a)*(P-c));
		
	}
	
}
