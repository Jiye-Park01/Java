import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("학번: ");
		int num = s.nextInt();
		System.out.print("이름: ");
		String name = s.next();
		System.out.print("넓이를 구할 원의 반지름: ");
		int r = s.nextInt();
		
		final double PI = 3.14159;
		
		System.out.println("======================");
		System.out.println(name + " (" + num + ")");
		System.out.println("======================");
		System.out.println("반지름 " + r + "인 원의 넓이는 " + PI*r*r);
		
	}
}
