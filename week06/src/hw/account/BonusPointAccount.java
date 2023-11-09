package hw.account;

public class BonusPointAccount extends Account{	//포인트 적립 계좌
	protected int bonusPoint;
	
	public BonusPointAccount(String accountNo, String name, int balance, int bonusPoint) {
		super(accountNo, name, balance);
		this.bonusPoint = bonusPoint;
	}
	
	void deposit(int amount) {	//예금액의 0.1% 포인트를 누적
		bonusPoint += (amount*0.001);
	}
	
	void check() {	//잔액조회(출력)하기 + 포인트도 표시
		System.out.println("잔액: " + balance + "\n포인트 잔액: " + bonusPoint);
	}

}
