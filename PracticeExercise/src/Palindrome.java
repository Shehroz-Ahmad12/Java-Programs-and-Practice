import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		System.out.println(s);
		String s1=s.toLowerCase();
		char[] array=s1.toCharArray();
		int n=array.length-1;
		int count=0;
		for(int i=n;i>=0;i--) {
			if (array[i]!=array[n-i])
				count++;
		}
		if (count==0)
			System.out.print("Its a palindrome");
		else
			System.out.print("Its not a palindrome");
	}}
