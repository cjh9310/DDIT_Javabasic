package chapter73;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	// 계좌의 갯수
	private int numberOfAccounts;
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
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
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts++] = account;
	}
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	@Override
	public String toString() {
		return "이름: " + firstName + " " + lastName + ", 계좌의 갯수: " + numberOfAccounts;
	}
	
}