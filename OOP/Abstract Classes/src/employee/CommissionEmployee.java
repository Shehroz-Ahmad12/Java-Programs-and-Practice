package employee;

public class CommissionEmployee extends Employee {
	protected double sales;
	protected double commissionRate;
	public CommissionEmployee(String firstName, String lastName, String sSN, double sales, double commissionRate) {
		super(firstName,lastName,sSN);
		this.sales = sales;
		this.commissionRate = commissionRate;
	}
	
	public double earning() {
		return sales*commissionRate;
	}
	
}
