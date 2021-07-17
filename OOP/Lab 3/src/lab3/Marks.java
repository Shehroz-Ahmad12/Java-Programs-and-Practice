package lab3;

public class Marks {
	int marks1;
	int marks2;
	int marks3;
	
	public void setParmeter(int x,int y,int z) {
		marks1=x;
		marks2=y;
		marks3=z;
	}
	public void display() {
		System.out.println("Your marks are "+marks1+", "+ marks2+", "+marks3);
	}
	public int sum() {
		return marks1+marks2+marks3;
	}
	public double percentge(int x) {
		
		return (x*100)/300;
	}
	public boolean checkFailure(int x) {
		if (x<150) {
			return true;
		}
		else {
			return false;
		}
	}
}
