package quadratic_equation;

public class QuadraticEquationRunner {

	public static void main(String[] args) {
		QuadraticEquation q= new QuadraticEquation();
		
		QuadraticEquation q1= new QuadraticEquation(3,4,5);
		q.display();
		
		q1.display();
		System.out.println(q1.getDescriminant());
		System.out.println(q1.checkIfDescriminantIsGretaerThan100(q1.getDescriminant()));
		
	}

}
