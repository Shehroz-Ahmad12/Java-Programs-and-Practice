package point;

public class Point {
	private int x;
	private int y;
	
	
	public Point() {
		x=0;
		y=0;
		}
	public Point(int a ,int b) {
		x=a;
		y=b;		
	}
	
	public void move(int a,int b) {
		x=x+a;
		y=y+b;
	}
	
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public void setx(int a){
		x=a;
	}
	public void sety(int b) {
		y=b;
	}
	
	public void display() {
		System.out.println(x+ ", "+y);
	}
}
