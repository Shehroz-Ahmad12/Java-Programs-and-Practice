package meeting;

public class Truck extends Vehicle{
	private double load;
	private int towingCapacity;
	public Truck() {
		super();
	}
	public Truck(String manuName, int numOfCyl, Person owner,double load,int towingCapacity) {
		super(manuName, numOfCyl, owner);
		this.load=load;
		this.towingCapacity=towingCapacity;
	}
	public double getLoad() {
		return load;
	}
	public void setLoad(double load) {
		this.load = load;
	}
	public int getTowingCapacity() {
		return towingCapacity;
	}
	public void setTowingCapacity(int towingCapacity) {
		this.towingCapacity = towingCapacity;
	}
	
	public void display() {
		System.out.println("Owner: "+ this.getOwner().getName());
		System.out.println("Age: "+this.getOwner().getAge());
		System.out.println("Manufacture Name: "+this.getManuName());
		System.out.println("Number of Cylinders: "+ this.getNumOfCyl());
		System.out.println("Load: "+ this.load);
		System.out.println("Towing capacity: "+ this.towingCapacity);
	}
	
	

}
