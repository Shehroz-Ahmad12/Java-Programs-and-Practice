package first;

public class Account {
	int balance;
	public void set_balance(int a) {
		balance=a;
	}
	public void display() {
		System.out.println(balance);
	}
	public void deposit(int x) {
		balance=balance+x;
	}
	public void withdraw(int y) {
		balance=balance-y;
	}
	
}
