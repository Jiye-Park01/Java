package exam_2;

import java.util.Scanner;

public class Joon3_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int num1, num2;
		
		for(; num > 0; num--) 
		{
			num1 = in.nextInt();
			num2 = in.nextInt();
			System.out.println(num1+num2);
		}
	}
}
