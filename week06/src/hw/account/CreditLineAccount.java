package hw.account;

public class CreditLineAccount extends Account{	//마이너스 통장
	protected int creditLine;	//마이너스 한도
	
	public CreditLineAccount(String accountNo, String name, int balance, int creditLine) {
		super(accountNo, name, balance);
		this.creditLine = creditLine;
	}
	
	int withdraw(int amount) {
		if(amount <= balance + creditLine) {
			creditLine -= (amount - balance);
			balance = 0;
			return amount;	//인출금액 반환
		}
		else
			return 0;
	}

}
