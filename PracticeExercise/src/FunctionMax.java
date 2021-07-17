import java.util.Scanner;

public class FunctionMax {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=maxi(a,b);
		System.out.print("Maximum is "+c);
	}
	public static int maxi(int a,int b) {
		int max=a;
		if (max<b) {
			max=b;}
		return max;
	}}
