package inheritence;

public class BasePlusCommissionEmployee extends CommissionEmployee{
private int salary;

public BasePlusCommissionEmployee() {
	
}



public BasePlusCommissionEmployee(String firstName, String lastName, String sSN, int grossSales, int commissionRate,int salary) {
	super(firstName, lastName, sSN, grossSales, commissionRate);
	this.salary=salary;
}



public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}
public void display() {
	super.display();
	System.out.println("Salary is: "+ salary);
}

public int earning() {
	return salary+super.earning();
}

}
