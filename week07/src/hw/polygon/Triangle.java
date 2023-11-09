package hw.polygon;

public class Triangle extends Polygon{
	public Triangle(int x, int y, int w, int h) {
		super(x, y, w, h, "triangle");
	}
	
	@Override
	double getArea() {
		return 1/2 * w * h;
	}
	
	@Override
	public boolean equals(Object obj) {	//각 객체의 비교를 위해 equals() 메서드 재정의
		if(obj instanceof Triangle && obj != null) {
			Triangle r = (Triangle) obj;
			if(r.h == h && r.w == w)
				return true;
		}
		return false;
	}
	
	void show() {
		System.out.println("위치: (" + x + ", " + y + ")\n크기: (" + w + ", " + h +")\n타입: " + type + "\n넓이: " + getArea());
	}
}
