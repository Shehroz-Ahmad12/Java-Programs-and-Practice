package assignment;
import java.util.Scanner;
public class all_methods {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a=input.nextInt();
		System.out.println("Enter second number: ");
		int b=input.nextInt();
		boolean c=bool(a,b);
		System.out.println("Boolean result is "+c);
		int d=sum(a,b);
		System.out.println("Int result is "+d);
		double i=a;
		double j=b;
		double e=mul(i,j);
		System.out.println("Double result is "+e);
		System.out.println("Enter first string: ");
		String x=input.next();
		System.out.println("Enter second string: ");
		String y=input.next();
		String f=concate(x,y);
		System.out.println("String result is "+f);
		char g=charac(x);
		System.out.println("Char result is "+g);
		
	}
	public static boolean bool(int a,int b) {
		boolean res=a>b;
		return res;
	}
	public static int sum(int a,int b) {
		int sum1=a+b;
		return sum1;
	}
	public static double mul(double i,double j) {
		double doub=i*j;
		return doub;
	}
	public static String concate(String x,String y) {
		String z=x.concat(y);
		return z;
	}
	public static char charac(String x) {
		char v=x.charAt(0);
		return v;
	}
}
