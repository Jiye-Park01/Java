package exam_2;

import java.util.Scanner;

public class Joon3_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a, b;
		for(int i = 0; i < T; i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #" + (i+1) + ": " + (a + b));
		}
		
	}
}
