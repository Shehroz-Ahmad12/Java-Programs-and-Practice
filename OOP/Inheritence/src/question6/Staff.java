package question6;

public class Staff extends Employee {
	private String title;

	public Staff() {
		super();
	}


	public Staff(String name, Address address, String phoneNo, String email, String office, double salary,
			Date dateHired,String title) {
		super(name, address, phoneNo, email, office, salary, dateHired);
		this.title=title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void display() {
		System.out.println("Name: "+this.getName());
		System.out.println("Address: "+this.getAddress().getHouse()+", "+this.getAddress().getStreet()+", "+ this.getAddress().getCity());
		System.out.println("Phone No.: "+this.getPhoneNo());
		System.out.println("Email: "+this.getEmail());
		System.out.println("Office: "+this.getOffice());
		System.out.println("Title: "+this.title);
		System.out.println("Salary: "+this.getSalary());
		System.out.println("Date of hiring: "+this.getDateHired().getDay()+"/"+this.getDateHired().getMonth()+"/"+this.getDateHired().getYear());
		
	}
	
	
}
