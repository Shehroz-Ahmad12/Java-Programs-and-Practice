import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String s1=s.toLowerCase();
		System.out.println(s);
		char[] array=s1.toCharArray();
		int count=0;
		int n=array.length;
		for (int i=0;i<n;i++) {
			if ((array[i]=='a')||(array[i]=='e')||(array[i]=='i')||(array[i]=='o')||(array[i]=='u'))
				count++;	}
		System.out.println("Number of vowels are: "+count);
	}}
