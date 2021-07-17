package marks;

public class Marks {
	private int marks1;
	private int marks2;
	private int marks3;
	
	public Marks() {
		marks1=0;
		marks2=0;
		marks3=0;
	}
	public Marks(int x,int y,int z) {
		marks1=x;
		marks2=y;
		marks3=z;
	}
	
	public void display() {
		System.out.println("Marks are: "+marks1+", "+marks2+", "+marks3);
	}
	public double calculatePercentage(int x) {
		return ((x*100)/300);
	}
	public int CalculateTotalMarks() {
		return marks1+marks2+marks3;
	}
	public void setmarks1(int x) {
		marks1=x;
	}
	public void setmarks2(int y) {
		marks2=y;
	}
	public void setmarks3(int z) {
		marks3=z;
	}
	public int getmarks1() {
		return marks1;
	}
	public int getmarks2() {
		return marks2;
	}
	public int getmarks3() {
		return marks3;
	}
}
