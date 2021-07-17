package comp;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public Date() {
		
	}
	public Date(int a,int b,int c) {
		day=a;
		month=b;
		year=c;
	}
	public Date(Date a) {
		this.day=a.day;
		this.month=a.month;
		this.year=a.year;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean equals(Date otherDate) {
		if (otherDate==null) {
			return false;
		}
		else {
			if((this.day==otherDate.day)&&(this.month==otherDate.month)&&(this.year==otherDate.year)) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
}
