package methods.product_management.v2.application;

import java.util.Scanner;

import methods.product_management.v2.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product product = new Product();
		
		
		System.out.println("Informe o nome do produto:");
		product.name = sc.next();
		System.out.println("Informe o valor do produto");
		product.price = sc.nextDouble();
		System.out.println("Informe a quantidade desse produto");
		product.quantity = sc.nextInt();
		
		System.out.println(product.ToString());
		
		System.out.println("Informe quanto desse produto voce deseja acrescentar");
		int quantity = sc.nextInt();
		product.addQuantity(quantity);
		
		System.out.println(product.ToString());
		System.out.println("Informe quanto desse produto voce deseja retirar");
		quantity = sc.nextInt();
		product.removeQuantity(quantity);
		System.out.println(product.ToString());
		
		sc.close();

	}

}
