import java.util.Scanner;
public class Stringlen {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		System.out.println(s);
		char[] array=s.toCharArray();
		int count=1;
		for (int i=0;i<array.length;i++) {
			count++;
		}
		System.out.print("Length of string is "+count);
	}

}
