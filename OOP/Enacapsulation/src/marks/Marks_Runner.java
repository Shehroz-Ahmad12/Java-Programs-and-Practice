package marks;

public class Marks_Runner {

	public static void main(String[] args) {
		Marks m1= new Marks();
		Marks m2=new Marks(70,80,90);
		m1.setmarks1(78);
		m1.setmarks2(50);
		m1.setmarks3(44);
		m1.display();
		m2.display();
		System.out.println("m1 is: "+m1.calculatePercentage(m1.CalculateTotalMarks())+" m2 is: "+m2.calculatePercentage(m2.CalculateTotalMarks()));
		System.out.println("Marks are: "+m1.getmarks1()+", "+m2.getmarks1());
	}

}
