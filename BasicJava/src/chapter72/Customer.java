package chapter72;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount account;
	
	public Customer(String firstName, String lastName) {
		this.firstName =firstName;
		this.lastName = lastName;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	public String toString() { //toString()을 잘못하면 이상한 주소값이 뜬다. (chapter72.Customer@6bf256fa)이런거
		return String.format("이름:"+firstName+" "+lastName+",잔고: "+account.getBalance()+"원");
	}
}
