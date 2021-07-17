package employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
protected double salary;

public BasePlusCommissionEmployee(String firstName, String lastName, String sSN, double sales, double commissionRate, double salary) {
	super(firstName,lastName,sSN,sales,commissionRate);
	this.salary = salary;
}



}
