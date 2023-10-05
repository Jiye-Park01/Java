package exam_2;

import java.util.Scanner;

public class Joon4_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];

		for(int i = 0; i < N; i++)
			num[i] = sc.nextInt();
		int M = num[0];
		int m = num[0];
		for(int i = 1; i < N; i++)
		{
			if(M < num[i])
				M = num[i];
			if(m > num[i])
				m = num[i];
		}
		
		System.out.println(m + " " + M);
	}
}
