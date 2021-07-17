package quadratic_equation;

public class QuadraticEquation {
	int a;
	int b;
	int c;
	
	public QuadraticEquation() {
		a=1;b=2;c=3;
	}
	public QuadraticEquation(int x,int y,int z) {
		a=x;
		b=y;
		c=z;
	}
	
	public void display() {
		System.out.println("The values are "+a+", "+b+", "+"c");
	}
	public double getDescriminant() {
		return ((b*b)-(4*a*c));
	}
	
	public boolean 	checkIfDescriminantIsGretaerThan100(double x) {
		if (x>100) {
			return true;
		}
		else {
			return false;
		}
	}
}
