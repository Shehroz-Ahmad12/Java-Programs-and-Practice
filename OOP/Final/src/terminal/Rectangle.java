package terminal;

public class Rectangle extends GeometricObject {
	double length;
	double width;
	
	public Rectangle() {
		super();
	}

	public Rectangle(String lineColour, double length, double width) {
		super(lineColour);
		this.length = length;
		this.width = width;
	}

	public double calcArea() {
		return length*width;
	}
	
	public String toString() {
		return ("Rectangle with length "+length+" and width "+width+ " is drawn");
	}
}
