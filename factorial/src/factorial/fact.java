package factorial;


import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number");
		int n = input.nextInt();
		for (int i=n-1;i>0;i--) {
			n*=i;
			
		}
		System.out.print(n);
		
		
	}}

