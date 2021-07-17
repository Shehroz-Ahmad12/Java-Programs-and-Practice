import java.util.Scanner;

public class TableOfN {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number: ");
		int N=input.nextInt();
		table(N);
	}
	public static void table(int N) {
		int res;
		for (int i=1;i<=10;i++) {
			res=N*i;
			System.out.println(N+"*"+i+"="+res);
		}}}
