package question2;

public class Order {
private Burger b;
private Pizza p;
private Customer c;
private double totalBill;

public Order() {
	
}
public Order(Customer c) {
	this.c = new Customer (c);
}

public Customer getC() {
	return new Customer (c);
}

public void setC(Customer c) {
	this.c = new Customer (c);
}


//
public void takeOrder(Pizza p) {
	this.p=p;
	
}
public void takeOrder(Burger b) {
	this.b=b;
	
}
public void takeOrder(Pizza p,Burger b) {
	this.p=p;
	this.b=b;
	
}

//

public double calculateBill() {
	if(b!=null) {
		if(b.isCheeseAddOn()==true) {
			totalBill=totalBill+b.getCost()+30;
			}
		else {
			totalBill=totalBill+b.getCost();
		}
		}
	
	if(p!=null) {
	totalBill=totalBill+p.getCost();
	}
			
	
	if(c.getMemberShipStatus()==true) {
		return totalBill-(0.1*totalBill);
	}
	else {
	return this.totalBill;
	}
	}
}
