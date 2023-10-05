package exam_2;

import java.util.Scanner;

public class Joon2_2 {
	public static void main(String[] args) {
		int grade;
		Scanner in = new Scanner(System.in);
		grade = in.nextInt();
		if (grade >= 90)
			System.out.println("A");
		else if (grade >= 80)
			System.out.println("B");
		else if(grade >= 70)
			System.out.println("C");
		else if (grade >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}
}
