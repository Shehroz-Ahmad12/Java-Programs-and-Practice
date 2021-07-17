package rectangle;

public class Recatngle_Runner {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3,6);
		
		System.out.println(r1.area());
		System.out.println(r2.area());
		
		r1.getLength();
		
		if (r1.getLength()>r2.getLength()) {
			System.out.println("r1 has greater length");
		}
		else {
			System.out.println("r2 has greater length");
		}
		}}
