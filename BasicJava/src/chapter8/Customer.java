package chapter8;


public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount account;
	private int NumberofAccounts;
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	@Override

	public int getNumberofAccounts() {
		
		return NumberofAccounts;
	}
	public SavingsAccount getAccount(int i) {
		
		return null;
	}
	public void addAccount(CheckingAccount checkingAccount) {
		
	}
	public void addAccount(SavingsAccount customer1SavingAccount) {
		
		
	}
	
}