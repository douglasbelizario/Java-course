package classes_methods_attributes.employee.entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double increaseSalary;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increase(double p) {
		this.increaseSalary = (grossSalary * p) / 100;
	}
	
	public String toString() {
		return "Nome: "+name+
				"\nSalario Liquido: "+String.format("%.2f", (netSalary()+increaseSalary));
			
	}

}
