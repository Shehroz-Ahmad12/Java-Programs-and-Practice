import java.util.Scanner;
public class Hello {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter number: ");
	int n=input.nextInt();
	int a=0;
	int b=1;
	if (n==1)
		System.out.println(a);
	else if (n==2)	
	{	System.out.println(a);
		System.out.println(b);	
	}
	else if(n>3) {
	System.out.println(a);
	System.out.println(b);

		for (int i=0;i<n-2;i++) {
			int temp=a+b;
			System.out.println(temp);
			a=b;
			b=temp;
		
	}
		
	
		
		
		
	}
	
	
}
}
