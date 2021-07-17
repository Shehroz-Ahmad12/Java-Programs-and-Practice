import java.util.Scanner;
public class FunctionSum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		sum(a,b,c);
	}
	public static void sum(int a,int b,int c) {
		int x=a+b+c;
		System.out.println("Sum is "+x);
	}}
