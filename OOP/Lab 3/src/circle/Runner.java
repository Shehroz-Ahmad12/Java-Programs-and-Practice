package circle;

public class Runner {

	public static void main(String[] args) {
		
		Circle c =new Circle();
		c.setParameter(10);
		System.out.println("Area is: "+c.calculateArea());
		System.out.println("Circumference is: "+c.calculateCircumference());
		c.display();
	
	
	}

}
