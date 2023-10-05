package marble;

public class ChildTest {
	
	
	public static void main(String[] args) 
	{
		Child child1 = new Child(15);
		Child child2 = new Child(9);
//		Child child3 = new Child(-1);
		int gamble;
		
//		gamble1 : 구슬 2개
		gamble = 2;
		Child.getMarble(child1, child2, gamble);
		child1.showMarble();
		child2.showMarble();
//		child3.showMarble();
		
//		gamble2 : 구슬 7개
		gamble = 7;
		Child.getMarble(child2, child1, gamble);
		child1.showMarble();
		child2.showMarble();
		
//		gamble3 : 패자의 구슬 개수가 부족한 경우
//		gamble = 11;
//		Child.getMarble(child2, child1, gamble);
//		child1.showMarble();
//		child2.showMarble();
	}

}
