import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		average(a,b,c);
		}
	public static void average(int a,int b,int c) {
		double res=(a+b+c)/3;
		System.out.print("The average is: "+res);
	}}
