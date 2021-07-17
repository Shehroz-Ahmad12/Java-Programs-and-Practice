package employee;

public class HourlyEmployee extends Employee {

	protected double hours;
	protected double hourlyWages;

	public HourlyEmployee(String firstName, String lastName, String sSN,double hours,double hourlyWages) {
		super(firstName,lastName,sSN);
		this.hours = hours;
		this.hourlyWages=hourlyWages;
	}
	
	public double earning() {
		return hours*hourlyWages;
	}
	
}
