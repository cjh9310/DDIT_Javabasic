package chapter73.copy;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10];
	}
	public void addCustomer(Customer customer) {  // 이거 떄문에..
		customers[numberOfCustomers++] =customer;
		
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
}
