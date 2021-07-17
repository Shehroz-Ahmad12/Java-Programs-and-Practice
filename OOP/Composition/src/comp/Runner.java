package comp;

public class Runner {

	public static void main(String[] args) {
		Date d1=new Date(12,4,2000);
		Date d2=new Date(22,6,2005);
		Employee e1=new Employee("ABC",d1,d2);
		Employee e2=new Employee(e1);
		
		System.out.println(e1.equals(e2));
	}}
