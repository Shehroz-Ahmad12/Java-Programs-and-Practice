package question2;

public class Customer {
	
	private String name;
	private Boolean memberShipStatus;
	
	public Customer(Customer c) {
		this.name=c.name;
		this.memberShipStatus=c.memberShipStatus;
	}
	
	public Customer(String name, Boolean memberShipStatus) {
		this.name = name;
		this.memberShipStatus = memberShipStatus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getMemberShipStatus() {
		return memberShipStatus;
	}

	public void setMemberShipStatus(Boolean memberShipStatus) {
		this.memberShipStatus = memberShipStatus;
	}
	
	public void display() {
		System.out.println("Name: "+ this.name);
		System.out.println("Member Ship Status: "+ this.memberShipStatus);
	}
	

}
