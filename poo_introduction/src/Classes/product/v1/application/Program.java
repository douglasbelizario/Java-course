package Classes.product.v1.application;

import java.util.Scanner;

import Classes.product.v1.entities.Product;

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
		product.viewDataProduct();
		
		System.out.println("Informe quanto desse produto voce deseja acrescentar");
		product.addQuantity = sc.nextInt();
		product.viewDataProductAdd();
		
		System.out.println("Informe quanto desse produto voce deseja retirar");
		product.removeQuantity = sc.nextInt();
		product.viewDataProductRemove();
		
		
		sc.close();
		
		
	}

}
