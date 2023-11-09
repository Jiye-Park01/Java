package hw.account;

public class Account {	//기본
	protected String accountNo;	//계좌번호
	protected String name;	//예금주 이름
	protected int balance;	//잔액
	
	public Account() {
		
	}
	
	public Account(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	public Account(String accountNo, String name) {
		this(accountNo, name, 0);
	}
	
	public void deposit(int amount) {	//예금하기
		this.balance += amount;
	}
	
	public int withdraw(int amount) {	//인출하기
		if(amount <= balance) {
			balance -= amount;	//인출전 잔액 - 인출금액 = 인출후 잔액
			return amount;
		}
		System.out.println("인출불가: 잔액이 부족합니다.");
		return 0;
	}
	
	public void check() {	//잔액조회(출력)하기
		System.out.println("잔액조회: " + name + "(" + accountNo + "): " + balance + "원\n");
	}
}
