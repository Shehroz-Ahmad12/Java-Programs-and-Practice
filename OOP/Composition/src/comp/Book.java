package comp;

public class Book {
private String bookName;
private String publisher;
private Person author;

public Book(String a,String b,Person c) {
	bookName=a;
	publisher=b;
	author=new Person(c);
	
}
public Book(Book a) {
	bookName=a.bookName;
	publisher=a.publisher;
	author=new Person(a.author);
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public Person getAuthor() {
	return author;
}
public void setAuthor(Person author) {
	this.author = author;
}
public void display() {
	System.out.println("Book name is: "+bookName+" publisher : " +publisher);
	System.out.println("Author is: ");
	author.Display();
}
public boolean checkStrret() {
	if (author.getAddress().getStreet()<10) {
		return true;
	}
	else {
		return false;
	}
}

public boolean equals(Book a) {
	if ((bookName.equals(a.bookName))&&(publisher.equals(a.publisher))&&
			(this.author.getFirstName().equals(a.author.getFirstName()))&&
			this.author.getLastName().equals(a.author.getLastName())&&
			(this.author.getAddress().getHouse()==a.author.getAddress().getHouse())&&
			this.author.getAddress().getStreet()==a.author.getAddress().getStreet()&&
			(this.author.getAddress().getCity().equals(a.author.getAddress().getCity()))){
				return true;
			}
			else {
				return false;
			}
}

public boolean Equals(Book a) {
	if ((bookName.equals(a.bookName))&&(publisher.equals(a.publisher))
			&&(this.author.equals(a.author))) {
		return true;
		
	}
	else {
		return false;
	}
}
}
