import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		int i;
		double d;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 >> ");
		i = s.nextInt();
		
		System.out.println("실수를 입력하세요 >> ");
		d = s.nextDouble();
		
		System.out.println();
		System.out.println("입력한 정수는 " + i + "입니다.");
		System.out.println("입력한 실수는 " + d + "입니다.");
	}
}
