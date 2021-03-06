package comp;

public class Person {
private String firstName;
private String lastName;
private Address address;

public Person() {
	
}
public Person(String a,String b,Address c) {
	firstName=a;
	lastName=b;
	address=new Address(c);
}
public Person(Person p) {
	firstName=p.firstName;
	lastName=p.lastName;
	address=new Address(p.address);
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public Address getAddress() {
	return new Address(address);
}
public void setAddress(Address address) {
	this.address = new Address(address);
}

public void Display() {
	System.out.println(firstName+lastName+address.getHouse()+address.getStreet()+address.getCity());
}
public boolean checkCity() {
	if (address.getCity().equals("Islamabad")) {
		return true;
	}
	else {
		return false;
	}
}

public boolean equals(Person a) {
	if((firstName.equalsIgnoreCase(a.firstName))&&(lastName.equalsIgnoreCase(a.lastName))&&
			(this.getAddress().getHouse()==a.getAddress().getHouse())&&
			this.getAddress().getStreet()==a.getAddress().getStreet()&&
			this.getAddress().getCity().equalsIgnoreCase(a.getAddress().getCity())) {
		return true;
	}
	
	else {
		return false;
	}
}


}
