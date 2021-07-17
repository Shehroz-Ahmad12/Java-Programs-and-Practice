package meeting;

public class Vehicle {
private String manuName;
private int numOfCyl;
private Person owner;
public Vehicle() {
	
}
public Vehicle(String manuName, int numOfCyl, Person owner) {
	this.manuName = manuName;
	this.numOfCyl = numOfCyl;
	this.owner =new Person (owner);
}
public String getManuName() {
	return manuName;
}
public void setManuName(String manuName) {
	this.manuName = manuName;
}
public int getNumOfCyl() {
	return numOfCyl;
}
public void setNumOfCyl(int numOfCyl) {
	this.numOfCyl = numOfCyl;
}
public Person getOwner() {
	return new Person(owner);
}
public void setOwner(Person owner) {
	this.owner =new Person( owner);
}




}
