package exam_2;

import java.util.Scanner;

public class Joon3_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int b = 1;
		while(a != 0 || b != 0)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == 0 && b == 0)
				return;
			System.out.println((a + b));
		}
	}
}
