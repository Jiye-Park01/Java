package hw.account;

public class Bank {
	public static void main(String[] args) {
		Account[] bank = new Account[5];
		bank[0] = new Account("0001", "이창섭", 50000);
		bank[1] = new CheckingAccount("0002", "박지예", 100000, "1234");	//직불 계좌
		bank[2] = new CheckingTrafficCardAccount("0003", "박지원", 200000, "1235", true);	//교통카드 기능이 있는 직불 계좌
		bank[3] = new CreditLineAccount("0004", "장혁준", 300000, 10000);	//마이너스 통장
		bank[4] = new BonusPointAccount("0005", "김성호", 400000, 1000);	//포인트 적립 계좌
		
		for(int i = 0; i < bank.length; i++) //잔액 출력
			bank[i].check();
		
		//for(int i = 0; i< )
	}
}
