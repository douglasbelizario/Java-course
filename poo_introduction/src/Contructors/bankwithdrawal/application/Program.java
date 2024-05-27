package Contructors.bankwithdrawal.application;

import java.util.Scanner;

import Contructors.bankwithdrawal.entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número da conta: ");
		int accountNumber = sc.nextInt();
		System.out.println("Títular da conta: ");
		String accountUser = sc.next();
		
		System.out.println("Deseja fazer um depósito?(y/n)");
		char condition = sc.next().charAt(0);
		Bank bank;
		double initialDeposit;
		if (condition == 'y') {
			System.out.println("Valor: ");
			initialDeposit = sc.nextDouble();
			bank = new Bank(accountUser, accountNumber, initialDeposit);
		} else {
			bank = new Bank(accountUser, accountNumber);
		}
		
	
		System.out.println("Dados:\nNúmero da conta: "+bank.getAccountNumber()+"\nTítular da conta: "+bank.getAccountUser()+"\nValor em conta: "+bank.getBalance());
		System.out.println("---------------------------------------------------------");
		System.out.println("Valor de depósito: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		
		System.out.println("Dados:\nNúmero da conta: "+bank.getAccountNumber()+"\nTítular da conta: "+bank.getAccountUser()+"\nValor em conta: "+bank.getBalance());
		System.out.println("----------------------------------------------------------");
		System.out.println("Quanto deseja sacar?(Taxa = R$5.00)");
		double withdraw = sc.nextDouble();
		bank.withdraw(withdraw);
		System.out.println("Dados:\nNúmero da conta: "+bank.getAccountNumber()+"\nTítular da conta: "+bank.getAccountUser()+"\nValor em conta: "+bank.getBalance());
		
		
		sc.close();
	}

}
