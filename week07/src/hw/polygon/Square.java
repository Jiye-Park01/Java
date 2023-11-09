package hw.polygon;

public class Square extends Polygon{
	public Square(int x, int y, int w) {
		super(x, y, w, w, "square");
	}
	
	@Override
	double getArea() {
		return w * w;
	}
	
	@Override
	public boolean equals(Object obj) {	//각 객체의 비교를 위해 equals() 메서드 재정의
		if(obj instanceof Square && obj != null) {
			Square r = (Square) obj;
			if(r.h == h && r.w == w)
				return true;
		}
		return false;
	}
	
	void show() {
		System.out.println("위치: (" + x + ", " + y + ")\n크기: (" + w + ", " + w +")\n타입: " + type + "\n넓이: " + getArea());
	}
	
	
}
