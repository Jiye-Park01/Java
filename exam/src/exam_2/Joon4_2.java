package exam_2;

import java.util.Scanner;

public class Joon4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int X = sc.nextInt();
		for(int i = 0; i < N; i++)
			A[i] = sc.nextInt();
		for(int i = 0; i < N; i++)
			if(A[i] < X)
				System.out.print(A[i] + " ");
	}
}
