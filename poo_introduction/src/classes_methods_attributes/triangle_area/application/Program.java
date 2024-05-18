package classes_methods_attributes.triangle_area.application;

import java.util.Scanner;

import classes_methods_attributes.triangle_area.entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Informe os lados do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Informe os lados do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		sc.close();
		
		double area1 = x.calcularArea();
		double area2 = y.calcularArea();
		
		
		System.out.printf("Triangulo X area: %.2f \n",area1);
		System.out.printf("Triangulo Y area: %.2f \n",area2);
		
		if (area1 < area2) {
			System.out.println("Segundo triangulo tem maior area");
		} else if (area1 > area2){
			System.out.println("Primeiro triangulo tem maior area");
		} else {
			System.out.println("São iguais");
		}
		
	}

}
