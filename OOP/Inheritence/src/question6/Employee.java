package question6;

public class Employee extends Person{
private String office;
private double salary;
private Date dateHired;
public Employee() {
	super();
}
public Employee(Person p,String office,double Salary,Date dateHired) {
	super(p);
	this.office=office;
	this.salary=salary;
	this.dateHired=new Date(dateHired);
	
}
public Employee(String name, Address address, String phoneNo, String email,String office,double salary,Date dateHired) {
	super(name, address, phoneNo, email);
	this.office=office;
	this.salary=salary;
	this.dateHired=new Date(dateHired);
}

public String getOffice() {
	return office;
}
public void setOffice(String office) {
	this.office = office;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Date getDateHired() {
	return new Date(dateHired);
}
public void setDateHired(Date dateHired) {
	this.dateHired =new Date (dateHired);
}



}
