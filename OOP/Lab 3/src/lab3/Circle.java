package lab3;

public class Circle {

		int radius;
		public void setParameter(int x) {
			radius= x;
		}
		public void display() {
			System.out.println("radius is: "+ radius );
		}
		public double calculateCircumference() {
			return 2*3.14*radius;
		}
		public double calculateArea(){
			return 3.14*radius*radius;
		}
	}

