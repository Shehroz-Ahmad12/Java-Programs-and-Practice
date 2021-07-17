package question1;

public abstract class Account {
	protected String accountID;
	protected double balance;
	protected Person accountHolder;
	
	public Account() {
		
	}
	public Account(String accountID, double balance, Person accountHolder) {
		
		this.accountID = accountID;
		this.balance = balance;
		this.accountHolder =new Person (accountHolder);
	}
	
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccountHolder() {
		return new Person(accountHolder);
	}
	public void setAccountHolder(Person accountHolder) {
		this.accountHolder = new Person(accountHolder);
	}
	
	public abstract double applyInterest();
		
	
	
}
