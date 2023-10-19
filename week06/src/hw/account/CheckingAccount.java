package hw.account;

public class CheckingAccount extends Account{	//직불 계좌
	protected String cardNo;	//카드번호
	public CheckingAccount(String accountNo, String name, int balance, String cardNo) {
		super(accountNo, name, balance);
		this.cardNo = cardNo;
	}
	
	int pay(String cardNo, int amount) {	//구매비용 지불 전 카드번호가 맞는지 확인
		if(this.cardNo == cardNo) 
			return withdraw(amount);
		else
			return 0;
	}
	
	

}
