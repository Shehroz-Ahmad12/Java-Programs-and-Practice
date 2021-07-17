package assignment;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		int[] x= {1,2,3,4,5,6,7,5,9,10,0,0};   	
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the index to insert an element: ");
		int n=input.nextInt();
		System.out.println("Enter the number");
		int z=input.nextInt();
		
		for (int i=10;i<n;i--) {
			x[i+1]=x[i];
		}
		x[n]=z;
		for (int i=0;i<11;i++) {
			System.out.println(x[i]);
		}
	}

}