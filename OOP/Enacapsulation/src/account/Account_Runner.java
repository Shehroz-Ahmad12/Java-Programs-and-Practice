package account;

public class Account_Runner {

	public static void main(String[] args) {
		Account a1=new Account();
		Account a2=new Account(500);		
		a2.deposit(100);
		a2.withdraw(200);
		a2.setBalance(a1.getBalance());
		a1.display();
		a2.display();
	}
	}
