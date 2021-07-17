import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=input.nextInt();
		int count=0;
		for (int i=2;i<n;i++) {
			int res=n%i;
			if (res==0)
				count=count+1;
			}
		if (count==0)
			System.out.print("Prime");
		else
			System.out.print("Composite");
		
		
		
	}

}
