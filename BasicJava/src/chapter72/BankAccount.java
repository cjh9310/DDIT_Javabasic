package chapter72;

public class BankAccount {
	private int balance;
	public BankAccount(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		this.balance += amount;
	}
	public boolean withdraw(int amount) {
		this.balance -= amount;
		return false;
	}
	public boolean transfer(int amount,BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
		
	}
}
