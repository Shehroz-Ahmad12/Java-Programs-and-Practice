import java.util.Scanner;
public class Union {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] A=new int[5];
		int[] B=new int[5];
		int[] C= new int[5*2];
		for(int i=0;i<5;i++) {
			System.out.println("Enter values in first array: ");
			A[i]=input.nextInt();
		}
		for(int i=0;i<5;i++) {
			System.out.println("Enter values in second array: ");
			B[i]=input.nextInt();
		}
		for (int i=0;i<5;i++) {
			for (int j=0,k=5; j<5;j++,k++) {
				if (A[i]!=B[j]) { 
					C[i]=A[i];
					C[k]=B[j];
				}}}
		for(int i=0;i<10;i++) {
			System.out.print(C[i]+" " );
		}}}
