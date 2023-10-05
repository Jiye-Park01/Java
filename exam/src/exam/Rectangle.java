package exam;

public class Rectangle {
	Point lt = new Point();
	Point rb = new Point();
	
//	public void Rectangle(int ltX, int ltY, int rbX, int rbY)
//	{
//		lt.Point(ltX,ltY);
//		rb.Point(rbX, rbY);
//	}
	
	public int getWidth() {
		return (rb.getX() - lt.getX());
	}
	
	public int getHeight() {
		return (rb.getY() - lt.getY());
	}
	
	public int getPerimeter() {
		return 2 * (rb.getX() - lt.getX() + rb.getY() - lt.getY());
	}
	public int getArea() {
		return (rb.getX() - lt.getX()) * (rb.getY() - lt.getY());
	}
	
	public void show() {
		System.out.println("[ 직사각형 " + getWidth() + "X" + getHeight() + ": (" + lt.getX()
		+ ", " + lt.getY() + "), (" + rb.getX() + ", " + rb.getY() + ") ]");
	}
}
