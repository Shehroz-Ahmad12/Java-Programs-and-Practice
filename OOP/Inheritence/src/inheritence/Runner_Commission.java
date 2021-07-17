package inheritence;

public class Runner_Commission {

	public static void main(String[] args) {
		BasePlusCommissionEmployee b=new BasePlusCommissionEmployee("abc","xyz","324334",55,15,2000);
        CommissionEmployee c = new CommissionEmployee("kdjf", "jdj", "yy55",9,20);
        
        b.getGrossSales();
        c.setLastName("khalid");
        b.display();
        c.display();
                
        System.out.println(c.earning());
        System.out.println(b.earning());

	
	}

}
