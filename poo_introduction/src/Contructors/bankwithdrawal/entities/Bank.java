package Contructors.bankwithdrawal.entities;

public class Bank {
	
	private int accountNumber;
	private String accountUser;
	private double balance;
	
	
	public Bank(String accountUser, int accountNumber, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.accountUser = accountUser;
		deposit(initialDeposit);
	}
	
	public Bank(String accountUser, int accountNumber) {
		this.accountNumber = accountNumber;
		this.accountUser = accountUser;
	}
	
	public double deposit(double depositValue) {
		return this.balance += depositValue;
	}
	
	public void withdraw(double withdraw) {
		this.balance = (this.balance - withdraw) - 5;
	}


	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getAccountUser() {
		return accountUser;
	}


	public void setAccountUser(String accountUser) {
		this.accountUser = accountUser;
	}


	public double getBalance() {
		return balance;
	}
	

}
