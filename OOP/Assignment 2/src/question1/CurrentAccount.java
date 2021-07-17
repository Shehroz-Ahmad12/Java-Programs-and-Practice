package question1;

public class CurrentAccount extends Account implements Display {

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(String accountID, double balance, Person accountHolder) {
		super(accountID, balance, accountHolder);
		}
	public double applyInterest() {
		return 0.10*this.getBalance();
	}
	public void displayDetails() {
		System.out.println("Name: "+this.accountHolder.getName());
		System.out.println("Age: "+this.accountHolder.getAge());
		System.out.println("Account ID: "+this.accountID);
		System.out.println("Balance: "+ this.balance);
		System.out.println("Account type: Current Account");
	}

}
