package terminal;

public class Runner {

	public static void main(String[] args) {
		
		
		GeometricObject[] objArray=new GeometricObject[4];
		objArray[0]=new Rectangle("Black",6,4);
		objArray[1]=new Rectangle("Black",5,9);
		objArray[2]=new Circle("Black",9);
		objArray[3]=new Circle("Black",7);
		
		for(int i=0;i<4;i++) {
			System.out.println(objArray[i].toString());
			System.out.println(objArray[i].calcArea());
			
		}
		
	}

}
