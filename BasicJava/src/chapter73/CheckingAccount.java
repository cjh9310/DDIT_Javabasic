package chapter73;

public class CheckingAccount extends BankAccount {
	
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	/**
	 * 출금 메소드
	 * 만약 체크계좌에 10,000원이 있고, 저축계좌에 50,000원이 있다고 가정
	 * 35,000원의 물건을 구매한다고 하면
	 * 35,000 - 10,000 = 25,000원을 저축계좌에서 빼주고
	 * 체크계좌는 0원으로 만든다.
	 * @param amount: 이체할 금액
	 */
	@Override
	public boolean withdraw(int amount) {
		if (amount > balance) {
			protectedBy.withdraw(amount - balance);
			balance = 0;
			return true;
		}
		return super.withdraw(amount);
	}

}
