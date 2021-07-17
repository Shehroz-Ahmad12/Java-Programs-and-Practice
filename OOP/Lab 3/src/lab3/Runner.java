package lab3;

public class Runner {

	public static void main(String[] args) {
		Circle c =new Circle();
		c.setParameter(10);
		System.out.println("Area is: "+c.calculateArea());
		System.out.println("Circumference is: "+c.calculateCircumference());
		c.display();
	
		
		Rectangle r = new Rectangle();
		r.setData(5, 5);
		System.out.println(r.checkSquare());
		r.display();
		System.out.println("Area is: "+ r.calculateArea());

	
		Account a = new Account();
		a.setData(100,"3630202727301",2004);
		a.deposit(1000);
		System.out.println(a.validCnic());
		a.withdraw(100);
		a.display();
		
		
		
		Marks m = new Marks();
		m.setParmeter(90, 80, 70);
		m.display();
		System.out.println(m.sum());
		System.out.println(m.checkFailure(m.sum())); 
		System.out.println(m.percentge(m.sum()));
		
		
		Point p= new Point();
		p.setParameters(2, 4);
		p.display();
		p.move(3, 2);
		System.out.println(p.checkOrigin());
		p.display();
		
		Book b= new Book();
		String[] y= {"hello world","new world","nice world","ok world","hello world2.0"};
		b.setData("shehroz",y);
		b.display();
		b.checkIfAuthorNameStartsWithA();
		System.out.println(b.searchChapter("new world"));
	
		StudentClass s = new StudentClass();
		String[] y= {"English","Urdu","Math","Chemistry","Physics"};
		String c="shehrozahmad970@gmail.com";
		s.setParameters("Shehroz",3.3,c,y);
		System.out.println(s.checkProbStatus());
		System.out.println(searchSubjects("English"));
		System.out.println(validateEmail());
		
	}
}
