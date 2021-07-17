package inheritence;

public class Laptop extends Computer {
private int length;
private int width;
private int height;
private int weight;

public Laptop() {
	
}
public Laptop(int a,int b,int c,int d) {
	length=a;
	width=b;
	height=c;
	weight=d;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public void display() {
	super.display();
	System.out.println("Length is: "+length);
	System.out.println("Width is: "+width);
	System.out.println("height is: "+height);
	System.out.println("weight is: "+weight);
	
}

}
