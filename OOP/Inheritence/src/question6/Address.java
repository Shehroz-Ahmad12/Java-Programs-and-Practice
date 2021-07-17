package question6;

public class Address {
private int house;
private int street;
private String city;

public Address() {
	
}
public Address(int a, int b, String c) {
	house=a;
	street=b;
	city =c;
}
public Address(Address a) {
	this.house=a.house;
	this.street=a.street;
	this.city=a.city;
}
public int getHouse() {
	return house;
}
public void setHouse(int house) {
	this.house = house;
}
public int getStreet() {
	return street;
}
public void setStreet(int street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public boolean equals(Address a) {
	if((this.house==a.house)&&(this.street==a.street)&&(this.city.equalsIgnoreCase(a.city))) {
		return true;
	}
	else {
		return false;
	}
}

}
