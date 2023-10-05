package exam_2;

import java.util.Scanner;

public class Joon3_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = num; i > 0; i--)
		{
			for(int k = 1; k < i; k++)
				System.out.print(" ");
			for(int j = i; (j - num) <= 0; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}