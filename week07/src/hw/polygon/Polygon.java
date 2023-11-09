package hw.polygon;

abstract public class Polygon {
	int x, y; //위치 (x, y)
	int w, h;  //크기 (w, h)
	String type;  //도형의 종류
	
	public Polygon(int x, int y, int w, int h, String type) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.type = type;
	}
	
	void show() {
		System.out.println("위치: (" + x + ", " + y + ")\n크기: (" + w + ", " + h +")\n타입: " + type);
	}
	
	abstract double getArea();
	
	abstract public boolean equals(Object obj);
}
