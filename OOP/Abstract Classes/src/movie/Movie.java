package movie;

public abstract class Movie {
private String idNumber;
private String movieName;
private int numberOfDays;

public Movie() {
	
}
public Movie(String idNumber, String movieName, int numberOfDays) {
	this.idNumber = idNumber;
	this.movieName = movieName;
	this.numberOfDays = numberOfDays;
}
public String getIdNumber() {
	return idNumber;
}
public void setIdNumber(String idNumber) {
	this.idNumber = idNumber;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public int getNumberOfDays() {
	return numberOfDays;
}
public void setNumberOfDays(int numberOfDays) {
	this.numberOfDays = numberOfDays;
}

public boolean equals(Movie a) {
	if((this.idNumber.equals(a.idNumber))&&(this.movieName.equals(a.movieName))&&(this.numberOfDays==a.numberOfDays)) {
			return true;
	}
	else {
		return false;
	}
}
public abstract double calculateFee(double days); 

}
