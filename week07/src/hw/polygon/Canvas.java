package hw.polygon;

public class Canvas {
	int num;
	Polygon[] py;
	public Canvas(int num){
		this.num=num;
		py=new Polygon[num];
	}
	public void draw(Polygon[] p) {
		for(int i=0; i<num; i++) {
			py[i]=p[i];
		}
	}
	public void display() {
		for(int i=0; i<num; i++) {
			py[i].show();
			if(py[i] instanceof Rectangle)
				if(((Rectangle)py[i]).isSquare())
					System.out.println("정사각형입니다.");
		}
		System.out.println();
	}
}