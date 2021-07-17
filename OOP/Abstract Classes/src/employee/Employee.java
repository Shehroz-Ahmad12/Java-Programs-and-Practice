package employee;

public abstract class Employee {
protected String firstName;
protected String lastName;
protected String SSN;
public Employee() {
	
}
public Employee(String firstName, String lastName, String sSN) {
	
	this.firstName = firstName;
	this.lastName = lastName;
	SSN = sSN;
}

public abstract double earning();


}
