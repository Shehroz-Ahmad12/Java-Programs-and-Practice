package uni;

public class University {
		String UniName; 
		String location;
		String RectorName;
		String[] Departments=new String[20];
		
		public University() {
			UniName="";
			location="";
			RectorName="";
	}
	
		public University(String a,String b, String c, String[] d) {
			UniName=a;
			location=b;
			RectorName=c;
			for(int i=0;i<5;i++) {
				Departments[i]=d[i];
			}
			}
		public void display() {
			System.out.println("University name is: "+UniName+" Location is: "+location+" Rector name is: "+ RectorName+" and Departments are: " );
			for (int i=0;i<Departments.length;i++) {
				System.out.println(Departments[i]);
			}
		
		}
		
		public void addMoreDepartments(String x) {
			int n=0;
			for(int i=0;i<20;i++) {
				if(Departments[i]=="") {
					break;
				}
				n++;
			}
			Departments[n]=x;
		}
		
		


}
