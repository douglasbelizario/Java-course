package classes_methods_attributes.static_members.dollar.application;

import java.util.Scanner;

import classes_methods_attributes.static_members.dollar.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a cotação do dolar: ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("Quantos dolares você quer comprar?: ");
		double amout = sc.nextDouble();
		
		System.out.println(CurrencyConverter.Converte(dollarPrice, amout));
		sc.close();
	}

}
