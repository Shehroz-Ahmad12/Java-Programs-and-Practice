package question6;

public class Student extends Person {
	private String status;
	
	public Student() {
		super();
	}

	public Student(Person p) {
		super(p);
	}

	public Student(String name, Address address, String phoneNo, String email,String status) {
		super(name, address, phoneNo, email);
		this.status=status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
