package question6;

public class Runner {

	public static void main(String[] args) {
		Address a = new Address(312,02,"Islamabad");
		Date d=new Date(12,3,2000);
		Faculty f =new Faculty("Shehroz",a,"03156872207","shehroz@gmail.com","professor",10000,d,"5","Assist Prof");
		f.display();
		
		
		Address a1 = new Address(433,10,"Lahore");
		Date d1=new Date(31,1,2020);
		Staff s=new Staff("Hassan", a1, "0417392947","Hassan@gmail", "Dunder Mifflin", 330000,
				d1,"boss");
		s.display();
		
	}

}
