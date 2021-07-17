package movie;

public class Comedy extends Movie {

	public Comedy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Comedy(String idNumber, String movieName, int numberOfDays) {
		super(idNumber, movieName, numberOfDays);
		// TODO Auto-generated constructor stub
	}
	public double calculateFee(double days) {
		if (days>getNumberOfDays()) {
			days=days-getNumberOfDays();
			return days*2.5;
		}
		else {
			return 0;
		}
		
		}

}
