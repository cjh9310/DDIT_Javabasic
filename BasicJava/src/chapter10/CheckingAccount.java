package chapter10;

public class CheckingAccount extends BankAccount {
	
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.setProtectedBy(protectedBy);
	}

	String getAccountType() {
		
		return "저축예금";
	}

	public SavingsAccount getProtectedBy() {
		return protectedBy;
	}

	public void setProtectedBy(SavingsAccount protectedBy) {
		this.protectedBy = protectedBy;
	}
	
}
