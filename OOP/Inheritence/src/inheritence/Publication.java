package inheritence;

public class Publication {
	private String title;
	private double price;
	
	public Publication() {
		
	}
	
	public Publication(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Title is: "+title);
		System.out.println("Price is: "+price);
		
	}
	
}
