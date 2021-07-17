package date;

public class Date {
	int day;
	int month;
	int year;
	
	public Date(int x,int y,int z) {
		day=x;
		month=y;
		year=z;
	}
	
	public Date() {
		day=01;
		month=01;
		year=2004;
	}
	
	public void display() {
		System.out.println(day+"/"+month+"/"+year);
	}
}
