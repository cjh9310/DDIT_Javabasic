package chapter73.copy;

public class BankAccount {
	/**
	 * 잔액
	 */
	protected int balance;

	public BankAccount(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	/**
	 * 입금 메소드
	 * @param amount
	 */
	public void deposit(int amount) {
		balance += amount;
	}
	/**
	 * 출금 메소드
	 * @param amount
	 * @return
	 */
	public boolean withdraw(int amount) {
		if (balance < amount) {
			return false;
		}
		balance -= amount;
		return true;
	}
	
	public boolean transfer(int amount, BankAccount otherAccount) {
		withdraw(amount);
		otherAccount.deposit(amount);
		return true;
	}
	@Override
	public String toString() {
		return String.format("%,d", balance);
	}
}
