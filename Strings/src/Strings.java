import java.util.Scanner;
public class Strings {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1="Hello World";
		int length=s1.length();
		String s2="Java ";
		System.out.println(length);
		String s3=s2.concat(s1);
		System.out.println(s3);
		int code=s1.codePointAt(4);
		System.out.println(code);
		boolean equals=s1.equals("Hello Worlr");
		System.out.println(equals);
	}
}
