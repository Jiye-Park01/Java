package hw.polygon;

public class Rectangle extends Polygon{
	public Rectangle(int x, int y, int w, int h) {
		super(x, y, w, h, "rectangle");
	}
	@Override
	double getArea() {
		return w * h;
	}
	
	@Override
	public boolean equals(Object obj) {	//각 객체의 비교를 위해 equals() 메서드 재정의
		if(obj instanceof Rectangle && obj != null) {
			Rectangle r = (Rectangle) obj;
			if(r.h == h && r.w == w)
				return true;
		}
		return false;
	}
	
	void show() {
		System.out.println("위치: (" + x + ", " + y + ")\n크기: (" + w + ", " + h +")\n타입: " + type + "\n넓이: " + getArea());
	}
	
	public boolean isSquare() {
		if(w == h)
			return true;
		return false;
	}
}
