package exam_2;

import java.util.Scanner;

public class Joon3_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		
		for(; i < num; i++)
		{
			int k = 0;
			while (k <= i)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
	}
}
