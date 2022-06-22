package pdf07_5;

public class SavingsAccount extends BankAccount{
	private double interestRate;
	
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public void updateBalance(int period) {	
		// TODO Auto-generated method stub
		balance += balance * interestRate * period;
	}
}
