import java.util.Scanner;

public class FunctionEvenOrOdd {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int N=input.nextInt();
		String res=evenorodd(N);
		System.out.print("The number is "+res);
	}
	public static String evenorodd(int N) {
		if (N%2==0) 
		 	return "Even";
		else  
			return "Odd";
	}}
