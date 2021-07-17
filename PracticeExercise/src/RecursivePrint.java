import java.util.Scanner;
public class RecursivePrint {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(printto(n));
	}
	public static int printto(int n) {
		if (n==0)
			return 0;
		else
			System.out.print(n+" ");
			return (printto(n-1));
	}}
