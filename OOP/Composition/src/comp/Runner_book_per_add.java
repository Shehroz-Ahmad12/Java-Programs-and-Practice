package comp;

public class Runner_book_per_add {

	public static void main(String[] args) {
		Address a=new Address(315,2,"multan");
		Person p=new Person("shehroz","ahmad",a);
		Book b=new Book("harry potter","disney",p);
		Book c=new Book(b);
		System.out.println(b.checkStrret());
		System.out.println(b.equals(c));
		System.out.println(b.Equals(c));
	}

}
