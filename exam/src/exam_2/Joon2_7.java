package exam_2;

import java.util.Scanner;

public class Joon2_7 {
	public static void main(String[] args) {
		int one, two, three;
		Scanner in = new Scanner(System.in);
		one = in.nextInt();
		two = in.nextInt();
		three = in.nextInt();
		
		if(one == two && two == three)
			System.out.println(10000 + one * 1000);
		else if(one == two || one == three)
			System.out.println(1000 + one * 100);
		else if(two == three)
			System.out.println(1000 + two * 100);
		else
		{
			if(one > two && one > three)
				System.out.println(one * 100);
			else if(two > three)
				System.out.println(two * 100);
			else
				System.out.println(three * 100);
		}
	}
}
