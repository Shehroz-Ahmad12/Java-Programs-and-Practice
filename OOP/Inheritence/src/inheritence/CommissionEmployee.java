package inheritence;

public class CommissionEmployee {
private String firstName;
private String lastName;
private String SSN;
private int grossSales;
private int commissionRate;

public CommissionEmployee() {
	
}

public CommissionEmployee(String firstName, String lastName, String sSN, int grossSales, int commissionRate) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	SSN = sSN;
	this.grossSales = grossSales;
	this.commissionRate = commissionRate;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getSSN() {
	return SSN;
}

public void setSSN(String sSN) {
	SSN = sSN;
}

public int getGrossSales() {
	return grossSales;
}

public void setGrossSales(int grossSales) {
	this.grossSales = grossSales;
}

public int getCommissionRate() {
	return commissionRate;
}

public void setCommissionRate(int commissionRate) {
	this.commissionRate = commissionRate;
}
public void display() {
	System.out.println("FirstName is: "+ firstName);
	System.out.println("LastName is: "+ lastName);
	System.out.println("SSN is: "+ SSN);
	System.out.println("GrossSales is: "+ grossSales);
	System.out.println("Commission Rate is: "+ commissionRate);
}

public int earning() {
	return grossSales*commissionRate; 
}

}
