package week02;

public class Circle {
	final double PI = 3.14159265;
	double radius;
	
	void setRadius(double radius) {		//원의 반지름을 얻어오는 메서드
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getArea() {					//원의 넓이를 반환하는 메서드
		return PI*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		c1.setRadius(10);
		c2.setRadius(5);
		System.out.println("원의 반지름이 " + c1.getRadius() + "인 원의 넓이는 " + c1.getArea() + "입니다.");
		System.out.println("원의 반지름이 " + c2.getRadius() + "인 원의 넓이는 " + c2.getArea() + "입니다.");
	}
}