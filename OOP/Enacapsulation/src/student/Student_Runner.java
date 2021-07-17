package student;

public class Student_Runner {

	public static void main(String[] args) {
		Student s1= new Student();
		int[] y={22,34,32,56,77,56};
		Student s2=new Student("Shehroz",y);
		s2.average();
		int[] z= {66,34,65,88,56};
		s1.setMarks(z);
		s1.setName("Ali");
		
		Student s3 =new Student();
		s3.setName(s1.getName());
		s3.setMarks(s2.getMarks());
		
		s3.display();
	
	}}
