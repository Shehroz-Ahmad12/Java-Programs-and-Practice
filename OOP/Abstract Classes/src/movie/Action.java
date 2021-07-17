package movie;

public class Action extends Movie {

	public Action() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Action(String idNumber, String movieName, int numberOfDays) {
		super(idNumber, movieName, numberOfDays);
		// TODO Auto-generated constructor stub
	}
	public double calculateFee(double days) {
		if (days>getNumberOfDays()) {
			days=days-getNumberOfDays();
			return days*3.0;
		}
		else {
			return 0;
		}
		
		}
}
