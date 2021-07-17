import java.util.Scanner;
public class FourIntReverse {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.print(reverse(n));
	}
	public static int reverse(int n) {
		if (n==0)
			return 0;
		else
			System.out.print(n%10);
			return(reverse(n/10));
	}}

