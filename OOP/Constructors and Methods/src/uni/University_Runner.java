package uni;

public class University_Runner {

	public static void main(String[] args) {
		University u =new University();
		
		String[] d= {"English","Urdu","Math","Computer Science","Engineering"};
		University u1=new University("Comsats","Islamabad","Raheel Qamar",d);
		u1.display();
		u1.addMoreDepartments("BBA");
		u1.addMoreDepartments("Physics");
		u1.addMoreDepartments("Bio");
		u.UniName="NUST";
		u.location="Islamabad";
	}
}
