package week04;

public class MarbleGame {
	public static void main(String[] args) {
		Child ch1 = new Child(15, "어린이 1");	//구슬 15개 보유
		Child ch2 = new Child(9, "어린이 2");		//구슬 9개 보유
		
		System.out.println(">> 게임 전 보유 개수");
		ch1.show();
		ch2.show();
		
		System.out.println();
		System.out.println(">> 1차 게임");
		System.out.println();
		System.out.println("> 게임 후 보유 개수");
		//Game1
		ch1.win(ch2, 2);
		ch1.show();
		ch2.show();
		
		System.out.println();
		System.out.println(">> 2차 게임");
		System.out.println();
		System.out.println("> 게임 후 보유 개수");
		//Game2
		ch2.win(ch1, 7);
		ch1.show();
		ch2.show();
		
		//3차 게임에서 어린의 2가 어린이 1의 구슬 11개를 모두 획득 가정 => 구슬 개수 부족 시 처리
		System.out.println();
		System.out.println("3차 게임");
		ch2.win(ch1, 11);
		ch1.show();
		ch2.show();
	}
}
