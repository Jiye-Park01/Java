package exam;

import java.util.Scanner;

public class Point {
	Scanner input = new Scanner(System.in);
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		
	}
	
	public void setXY() {
		this.x = input.nextInt();
		this.y = input.nextInt();
		
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void show() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
}
