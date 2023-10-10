package week04;

public class Child {
	int num;	//구슬의 개수
	String name;	//어린이의 이름
	public Child(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	public void win(Child loser, int num) {	//이긴 경우
		this.num += loser.lose(num);
	}
	public int lose(int num) {	//진 경우
		if(this.num < num) {	//줘야하는 개수보다 가지고 있는 개수가 적은 경우
			int give = this.num;
			this.num = 0;
			return give;
		}
		else {
			this.num -= num;
			return num;
		}
	}
	
	
	public void show() {
		System.out.println(name + " 보유 개수: " + num);
	}
	
	
}
