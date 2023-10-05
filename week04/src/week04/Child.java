package week04;

public class Child {
	int num;	//구슬의 개수
	String name;
	public Child(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	public void win(Child loser, int num) {
		this.num += loser.lose(num);
	}
	public int lose(int num) {
		if(this.num < num) {
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
		System.out.println(name + "의 구슬의 개수는 " + num + "개 입니다.");
	}
	
	
}
