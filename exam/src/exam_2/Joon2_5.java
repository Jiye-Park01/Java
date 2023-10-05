package exam_2;

import java.util.Scanner;

public class Joon2_5 {
	public static void main(String[] args) {
		int H, M;
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		M = in.nextInt();
		if(M < 45)
		{
			if(H == 0)
				H = 23;
			else
				H -= 1;
			M = (60+M) - 45;
		}
		else
			M -= 45;
		System.out.println(H + " " + M);
	}
}
