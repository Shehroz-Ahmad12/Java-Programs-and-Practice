package question2;

public class Pizza extends Food {
private String flavour;
private String crustType;

public Pizza() {
	super();
}
public Pizza(double cost, String flavour, String crustType) {
	super(cost);
	this.flavour = flavour;
	this.crustType = crustType;
}


public String getFlavour() {
	return flavour;
}
public void setFlavour(String flavour) {
	this.flavour = flavour;
}
public String getCrustType() {
	return crustType;
}
public void setCrustType(String crustType) {
	this.crustType = crustType;
}

public void display() {
	System.out.println("Cost: "+this.getCost());
	System.out.println("Crust Type: "+this.crustType);
	System.out.println("Flavour: "+this.flavour);
	
}

}
