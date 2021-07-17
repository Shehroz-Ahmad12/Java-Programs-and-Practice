package question2;

public class Burger extends Food{
	private String pattieType;
	private boolean cheeseAddOn;
	
	
	public Burger(double cost, String pattieType, boolean cheeseAddOn) {
		super(cost);
		this.cheeseAddOn=cheeseAddOn;
		this.pattieType = pattieType;
		
	}
	
	
	public String getPattieType() {
		return pattieType;
	}

	public void setPattieType(String pattieType) {
		this.pattieType = pattieType;
	}

	public boolean isCheeseAddOn() {
		return cheeseAddOn;
	}

	public void setCheeseAddOn(boolean cheeseAddOn) {
		this.cheeseAddOn = cheeseAddOn;
	}
	
	public void display() {
		System.out.println("Cost: "+this.getCost());
		System.out.println("Pattie Type: "+this.pattieType);
		System.out.println("Cheese Add on: "+this.cheeseAddOn);
	}
	
}
