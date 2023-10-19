package hw.account;

public class CheckingTrafficCardAccount extends CheckingAccount{	//교통카드 기능이 있는 직불 계좌
	protected boolean hasTrafficCard;	//교통카드 등록여부
	
	public CheckingTrafficCardAccount(String accountNo, String name, int balance, String cardNo, boolean hasTrafficCard) {
		super(accountNo, name, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}
	
	int payTrafficCard(String cdNo, int amount) {
		if(hasTrafficCard == true)
			return pay(cdNo, amount);
		else
			return 0;
	}
}
