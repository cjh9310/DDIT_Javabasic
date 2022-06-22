package chapter8;


public class SavingsAccount extends BankAccount{ //Implicit오류 
	private double interestRate; //이자율
	

	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	public void updateBalance(int period) {
		balance+=balance*interestRate*period;
	}

	public String getAccountType() {
		return "저축은행";
	}
}
