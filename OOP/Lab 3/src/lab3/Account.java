package lab3;

public class Account {

int balance;
String CNIC;
int yearOfOpening;

public void setData(int x,String y, int z) {
	balance = x;
	CNIC= y;
	yearOfOpening=z;	
			
}
public void display() {
	System.out.println("Your balance is: "+balance+ " and Cnic is: "+CNIC+ " and year of opening is: "+yearOfOpening);  
}
public void deposit(int a) {
	balance=balance+a;
}
public boolean validCnic() {
	if (CNIC.length()==13) {
		return true;
	}
	else {
		return false;
	}
}
public void withdraw(int b) {
	balance = balance-b;
}

}
