package chapter10;

public abstract class BankAccount {

	abstract String getAccountType();
	
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		balance += amount;
	}
	
	public boolean withdraw(int amount) {
		if (balance < amount) {
			return false;
		}
		balance -= amount;
		return true;
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) throws IllegalArgumentException, NullPointerException{
		if(amount <0 || amount>balance) {
			throw new IllegalArgumentException();
		}else if(otherAccount == null) {
			throw new NullPointerException();
		}
		return true;
	}
	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
	
}
