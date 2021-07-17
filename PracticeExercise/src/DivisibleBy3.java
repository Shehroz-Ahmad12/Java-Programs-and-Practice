import java.util.Scanner;

public class DivisibleBy3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int N=input.nextInt();
		String res=div(N);
		System.out.print(res);
	}
	public static String div(int N) {
		if (N%3==0) 
		 	return "It is divisible by 3";
		else  
			return "It is not divisible by 3";
	}}
