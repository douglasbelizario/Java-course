package classes_methods_attributes.employee_salary.application;

import java.util.Scanner;

import classes_methods_attributes.employee_salary.entities.Employee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Nome do funcionario: ");
		employee.name = sc.next();
		System.out.println("Salario bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Taxa: ");
		employee.tax = sc.nextDouble();
		System.out.println(employee);
		
		System.out.println("Quantos % de aumento deseja acrescentar?");
		employee.increase(sc.nextDouble());
		System.out.println(employee);

		
		
		
		sc.close();

	}

}
