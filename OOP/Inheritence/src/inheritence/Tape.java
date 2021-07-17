package inheritence;

public class Tape extends Publication {
	private double playTIme;
	public Tape() {
		super();
	}

	public Tape(String title, double price,double playtime) {
		super(title, price);
		this.playTIme=playtime;
		
	}

	public double getPlayTIme() {
		return playTIme;
	}

	public void setPlayTIme(double playTIme) {
		this.playTIme = playTIme;
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Play time is: "+playTIme);
	}

}
