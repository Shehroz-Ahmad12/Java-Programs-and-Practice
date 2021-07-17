import java.util.Scanner;

public class Factorialfunc {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int N=input.nextInt();
		int res=factorial(N);
		System.out.print("Factorial is "+res);
	}
	public static int factorial(int N) {
	for (int i=N-1;i>0;i--) {
		N*=i;
	}
	return N;
}}
