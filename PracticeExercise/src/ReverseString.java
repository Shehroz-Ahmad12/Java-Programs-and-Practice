import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		System.out.println(s);
		char[] array=s.toCharArray();
		int n=array.length;
		for (int i=n-1;i>=0;i--) {
			System.out.print(array[i]);
		}
	}

}
