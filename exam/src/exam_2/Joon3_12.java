package exam_2;

import java.util.Scanner;

public class Joon3_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, numOrigin, num1, b, newNum, newNumB;
		int i = 0;
		num = sc.nextInt();
		newNum = -1;
		numOrigin = num;
		b = num % 10;
		while(numOrigin != newNum)
		{
			num1 = num / 10 + num % 10;
			newNumB = num1 % 10;
			newNum = b * 10 + newNumB;
			num = newNum;
			b = newNumB;
			i++;
		}
		System.out.println(i);
	}
}
