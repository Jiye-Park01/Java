package marble;

public class Child {
	private int marbleNum;
	
	public Child(int marbleNum) 
	{
		if(marbleNum < 0)
		{
			System.out.println("구슬의 개수는 음수가 될 수 없습니다.");
			this.marbleNum = 0;
		}
		else
			this.marbleNum = marbleNum;
	}
	
	
	public static void getMarble(Child winner, Child loser, int gamble) 
	{
		if(loser.marbleNum < gamble)
		{
			System.out.println("패자의 구슬 개수가 적음");
			winner.marbleNum += loser.marbleNum;
			System.out.println("모자란 개수 : " + (gamble - loser.marbleNum));
			loser.marbleNum = 0;
		}
		else
		{
			winner.marbleNum += gamble;
			loser.marbleNum -= gamble;
		}
	}
	
	public int showMarble()
	{
		System.out.println("현재 구슬 보유 현황: " + marbleNum + "개");
		return marbleNum;
	}
}

