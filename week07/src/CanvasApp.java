import hw.polygon.*;

public class CanvasApp {
	public static void main(String[] args) {
		Canvas c = new Canvas(4);
		Polygon[] p= {new Rectangle(0,0,8,6), new Rectangle(0,0,4,4), new Square(5,5,6), new Triangle(0,0,5,6)};
		c.draw(p);
		c.display();
	}
}
