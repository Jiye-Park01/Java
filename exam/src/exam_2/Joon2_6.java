package exam_2;

import java.util.Scanner;

public class Joon2_6 {
	public static void main(String[] args) {
		int H, M, need;
		Scanner in = new Scanner(System.in);
		H = in.nextInt();
		M = in.nextInt();
		need = in.nextInt();
		int Hadd = (M + need) / 60;
		if(Hadd > 0)
		{
			if(H + Hadd >= 24)
				H += Hadd -24;
			else
				H += Hadd;
			M = (M + need)%60;
		}
		else
			M += need;
		System.out.println(H + " " + M);
	}
}
