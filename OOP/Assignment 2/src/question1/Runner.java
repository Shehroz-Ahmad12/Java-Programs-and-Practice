package question1;

public class Runner {

	public static void main(String[] args) {
		Account[] a=new Account[2];
		Person p=new Person("Shehroz",20);
		a[0]=new BusinessAccount("22145421-324-12",15000,p);
		
		
		Person p2=new Person("John",50);
		a[1]=new CurrentAccount("35321-43133-001",9000,p2);
		
		System.out.println("Interest: "+a[0].applyInterest());
		System.out.println("Interest: "+a[1].applyInterest());
		
		for(int i=0;i<2;i++) {
			if(a[i].getBalance()>10000) {
				System.out.println(a[i].getAccountID());
			}
		}
		
	
			BusinessAccount b=(BusinessAccount) a[0];
			b.displayDetails();
		
		
	}
	

}
