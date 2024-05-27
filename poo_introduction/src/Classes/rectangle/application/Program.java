package Classes.rectangle.application;

import java.util.Scanner;

import Classes.rectangle.entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		System.out.println("Informe a medida do retangulo:");
		rectangle.wight = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);

		
		sc.close();
	}

}
