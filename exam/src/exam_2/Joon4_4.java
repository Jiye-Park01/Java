package exam_2;

import java.util.Scanner;

public class Joon4_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		for(int i = 0; i < 9; i++)
			num[i] = sc.nextInt();
		int M = num[0];
		int k = 1;
		for(int i = 1; i < 9; i++)
		{
			if(M < num[i])
			{
				M = num[i];
				k = i+1;
			}
		}
		System.out.println(M + "\n" + k);
	}
}
