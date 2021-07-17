package movie;

public class Runner {

	public static void main(String[] args) {
		//Drama d= new Drama("39i94","THE GREEN MILE",7);
		//Comedy c=new Comedy("23232","THE HANGOVER",4);
		//System.out.println(c.calculateFee(8));
		
		Movie[] m=new Movie[3];
		m[0]=new Drama("39i94","THE GREEN MILE",7);
		m[1]=new Comedy("23232","THE HANGOVER",4);
		m[2]=new Action("2323123","THE AVENGERS",3);
		System.out.println(m[1].getIdNumber());
		m[1].setIdNumber("322222");
		System.out.println(m[1].getIdNumber());
		
		for(int i=0;i<3;i++) {
			System.out.println(m[i].getClass());
			System.out.println(m[i].calculateFee(8));
		}
		Drama d= (Drama)m[0];
		d.setDummy(23);
		Movie l=(Movie) d;
	
		
		
	
	}

}
