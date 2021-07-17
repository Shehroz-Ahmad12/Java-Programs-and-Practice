package lab3;

public class Rectangle {
	int length;
	int width;
	public void setData(int x,int y) {
		length=x;
		width=y;
	}
	public void display() {
		System.out.println("Length is: "+ length+ " and width is: " +width);
	}
	public int calculateArea() {
		return length*width;		
	}
	public boolean checkSquare() {
		if(length==width) {
			return true;
		}
		else {
			return false;
		}
	}
}
