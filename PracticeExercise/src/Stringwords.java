import java.util.Scanner;

public class Stringwords {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		System.out.println(s);
		char[] array=s.toCharArray();
		int count =1;
		int sentences=0;
		for (int i=0;i<array.length;i++) {
			if (array[i]==' ' )
				count++;
			
			if (array[i]=='.')
				sentences++;
		}		System.out.print("Total words are "+count+" and sentences are "+sentences);
	}}
