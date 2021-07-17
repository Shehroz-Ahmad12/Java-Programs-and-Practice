package rectangle;

public class Rectangle {
	
	private int length;
	private int width;
	
	public Rectangle() {
		length=0;
		width=0;
	}
	public Rectangle(int x,int y) {
		length=x;
		width=y;
	}
	public int getLength() {
		return length;
	}
	
	public double area() {
		return length*width;
	}

}
