package terminal;

public class Circle extends GeometricObject {
	double radius;
	public Circle() {
		
	}
	public Circle(String lineColor, double radius) {
		super(lineColor);
		this.radius = radius;
	}
	
	public double calcArea() {
		return 3.14*radius*radius;
	}
	
	public String toString() {
		return ("Circle with radius "+radius+ " is drawn");
	}
}
