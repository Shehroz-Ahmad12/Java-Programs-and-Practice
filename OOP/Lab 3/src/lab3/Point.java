package lab3;

public class Point {
	int x;
	int y;
	
	public void setParameters(int a,int b) {
		x=a;
		y=b;	
	}
	public void display() {
		System.out.println("X is: "+ x +" and Y is: "+y);
		}
	
	public void move(int a, int b) {
		x=x+a;
		y=y+b;
	}
	public boolean checkOrigin() {
		if ((x==0)&&(y==0)) {
			return true;
		}
		else {
			return false;
		}
	}
}
