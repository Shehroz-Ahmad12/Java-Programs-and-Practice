package employee;

public class Runner {

	public static void main(String[] args) {
		
		Employee[] array=new Employee[4];
		
		array[0]= new WeeklyEmployee("aakg","efef","23243",333000);
		array[1]=new HourlyEmployee("nuaneuf","kdsv","83u33",4,3000);
		array[2]=new CommissionEmployee("hello","wmfef","93203",23332,20);
		array[3]=new BasePlusCommissionEmployee("bsvse","dafsaca","5432",43453,10,30000);
	
		
		
		
		for (int i=0;i<4;i++) {
			if (array[i].getClass().toString().contains("CommissionEmployee")) {
				BasePlusCommissionEmployee b=(BasePlusCommissionEmployee) array[i];
				b.salary=222;
			}
			System.out.println("Eaning "+array[i].earning());
		}
		
	}

}
