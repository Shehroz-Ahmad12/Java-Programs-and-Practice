package question2;

public class Runner {

	public static void main(String[] args) {
		Customer c1= new Customer("Shehroz",false);	
		
		Pizza p1=new Pizza(300,"Tikka","Stuffed");
		
		Burger b1=new Burger(150,"Simple",true);
		
		Order o1=new Order(c1);

		
		o1.takeOrder(p1, b1);
		
		System.out.println(o1.calculateBill());
		
		
		Customer c2=new Customer("Ali",true);
		Order o2 = new Order(c2);
		
		o2.takeOrder(b1);
		o2.takeOrder(p1);
		System.out.println(o2.calculateBill());
		
	}
}
