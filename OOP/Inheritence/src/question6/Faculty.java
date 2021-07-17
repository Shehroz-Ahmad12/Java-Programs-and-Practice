package question6;

public class Faculty extends Employee {
private String officeHours;
private String rank;
public Faculty() {
	super();
}

public Faculty(String name, Address address, String phoneNo, String email, String office, double salary,
		Date dateHired,String officeHours,String rank) {
	super(name, address, phoneNo, email, office, salary, dateHired);
	this.officeHours=officeHours;
	this.rank=rank;
}

public String getOfficeHours() {
	return officeHours;
}
public void setOfficeHours(String officeHours) {
	this.officeHours = officeHours;
}
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}

public void display() {
	System.out.println("Name: "+this.getName());
	System.out.println("Address: "+this.getAddress().getHouse()+", "+this.getAddress().getStreet()+", "+ this.getAddress().getCity());
	System.out.println("Phone No.: "+this.getPhoneNo());
	System.out.println("Email: "+this.getEmail());
	System.out.println("Office: "+this.getOffice());
	System.out.println("Office hours: "+this.officeHours);
	System.out.println("Rank: "+this.rank);
	System.out.println("Salary: "+this.getSalary());
	System.out.println("Date of hiring: "+this.getDateHired().getDay()+"/"+this.getDateHired().getMonth()+"/"+this.getDateHired().getYear());
	
}



}
