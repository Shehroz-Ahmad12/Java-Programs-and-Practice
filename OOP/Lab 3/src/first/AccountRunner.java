package first;

public class AccountRunner {

	public static void main(String[] args) {
		Account a1=new Account();
		a1.deposit(100);
		a1.display();
		a1.deposit(1000);
		a1.withdraw(500);
		a1.display();
	}
	}
