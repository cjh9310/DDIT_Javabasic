package pdf07;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		balance = balance;
	}
	public int getBalance() {
		return this.balance = balance;
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
	
}
