package account;

public class Account {
	private int balance;
	
	public Account() {
		balance=100;
	}
	public Account(int x) {
		balance=x;
	}
	public void deposit(int x) {
		balance=balance+x;
	}
	public void withdraw(int y) {
		balance=balance-y;		
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int x) {
		balance=x;
	}
	public void display() {
		System.out.println("Balance is: "+balance);
	}
	
	
}
