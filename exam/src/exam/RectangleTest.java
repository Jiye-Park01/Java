package exam;

public class RectangleTest {
	static void show(Rectangle r) {
		r.show();
		System.out.println("넓이 : " + r.getArea() + ",  둘레 : " + r.getPerimeter());
	}
	
	
	public static void main(String[] args) {
		//Rectangle rect1 = new Rectangle(0, 0, 10, 5);
		//RectangleTest.show(rect1);
	}
}
