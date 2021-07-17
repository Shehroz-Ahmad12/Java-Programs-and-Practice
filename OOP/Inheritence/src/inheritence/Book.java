package inheritence;

public class Book extends Publication {
	private	int pageCount;
	public Book() {
	}

	public Book(String title, double price,int pageCount) {
		super(title, price);
		this.pageCount=pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public void display() {
		super.display();
		System.out.println("pageCount is: "+pageCount);
	}

}
