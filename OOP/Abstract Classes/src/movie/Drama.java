package movie;

public class Drama extends Movie {
	private int dummy;
	public Drama() {
		super();
	}

	public Drama(String idNumber, String movieName, int numberOfDays) {
		super(idNumber, movieName, numberOfDays);
		
	}
	

	public int getDummy() {
		return dummy;
	}

	public void setDummy(int dummy) {
		this.dummy = dummy;
	}

	public double calculateFee(double days) {
		if (days>getNumberOfDays()) {
			days=days-getNumberOfDays();
			return days*2.0;
		}
		else {
			return 0;
		}
		
		}
}
