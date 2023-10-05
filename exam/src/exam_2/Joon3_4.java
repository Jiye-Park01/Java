package exam_2;

import java.util.Scanner;

public class Joon3_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int all = in.nextInt();
		int kind = in.nextInt();
		int sum = 0;
		for(; kind > 0; kind --)
		{
			int thing = in.nextInt();
			int thingNum = in.nextInt();
			sum  += thing * thingNum;
		}
		if(sum == all)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
