package exam_2;

import java.util.Scanner;

public class Joon4_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int numB = 0;
		int [] num = new int[T];
		for(int i = 0; i < T; i++)
		{
			num[i] = sc.nextInt();
		}
		int find = sc.nextInt();
		for(int i = 0; i < T; i++)
			if(num[i] == find)
				numB++;
		System.out.println(numB);
	}
}
