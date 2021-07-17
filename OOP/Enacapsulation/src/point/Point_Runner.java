package point;

public class Point_Runner {

	public static void main(String[] args) {
		Point p1=new Point();
		Point p2=new Point(2,4);
		
		p1.setx(3);
		p1.sety(5);
		p2.sety(p1.getx());
		p1.display();
		p2.display();
	}}
