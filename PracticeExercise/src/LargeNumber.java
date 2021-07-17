import java.util.Scanner;
public class LargeNumber {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int res=large(a,b,c);
		System.out.print("the largest number is: "+res);
	}
	public static int large(int a,int b,int c) {
		int	max=a;
		if (a > b && a > c) 
		      max=a;
		    else if (b > a && b > c) 
		      max=b;
		    else if (c > a && c > b) 
		      max=c;
	return max;	
	}}

