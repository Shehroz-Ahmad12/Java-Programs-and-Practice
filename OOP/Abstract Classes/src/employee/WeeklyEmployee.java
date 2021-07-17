package employee;

public class WeeklyEmployee extends Employee {
protected double weeklySalary;

public WeeklyEmployee() {
	super();

}
public WeeklyEmployee(String firstName, String lastName, String sSN, double weeklySalary) {
	super(firstName,lastName,sSN);
	this.weeklySalary = weeklySalary;
}

public double earning() {
	return weeklySalary;
}

}
