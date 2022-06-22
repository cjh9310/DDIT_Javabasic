package pdf07_5;

public class BankAccount {
	protected int balance;
	
	public BankAccount(int balance) {
		balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {
		amount = amount +balance;
	}
	public boolean withdraw(int amount) {
		amount = amount - balance;
		return true;
	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}
	@Override
	public String toString() {
		return String.format("%d", balance);
	}
	
	
}
