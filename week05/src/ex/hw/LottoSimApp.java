package ex.hw;
import ex.lotto.*;

public class LottoSimApp {
	public static void main(String[] args) {
		System.out.println(">> 1차 구매");
		LottoCard lotto1 = new LottoCard(2);	//수동구매
		int[] num = {1,2,3,4,5,6};
		lotto1.manual(1, num);
		lotto1.manual(2, new int[]{2, 20, 30, 40, 3, 4});
		System.out.print("복권1: ");
		for(int i : lotto1.get(1))
			System.out.println(i + " ");
		System.out.print("\n복권2: ");
		for(int i : lotto1.get(2))
			System.out.println(i + " ");
		
		
		System.out.println("\n\n>>2차 구매");
		LottoCard lotto2 = new LottoCard(5);
		lotto2.auto(1);	//첫번째 카드 자동
		lotto2.auto(2);	//두번째 카드 자동
		lotto2.auto(3);
		lotto2.auto(4);
		lotto2.auto(5);
	}
}
