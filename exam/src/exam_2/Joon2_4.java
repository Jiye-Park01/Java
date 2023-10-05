package exam_2;

import java.util.Scanner;

public class Joon2_4 {
	public static void main(String[] args) {
		int x, y;
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		y = in.nextInt();
		
		if(x>0)
		{
			if(y>0)
				System.out.println("1");
			else
				System.out.println("4");
		}
		else
		{
			if(y>0)
				System.out.println("2");
			else
				System.out.println("3");
		}
	}
}
