import java.util.Scanner;

public class RecursiveDecimaltoBinary {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter decimal number: ");
		int N=input.nextInt();
		System.out.print(DeciToBin(N));
		
	}
	public static int DeciToBin(int N) {
		if (N==0)
			return 0;
		else
			return(N%2+10*DeciToBin(N/2));
	}}
