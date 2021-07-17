import java.util.Scanner;
public class DifferenceMatrices {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] A=new int[3][3];
		System.out.print("Enter values in 3X3 array:");
		for (int i=0;i<A.length;i++) {			
			for (int j=0;j<A[i].length;j++) {
				A[i][j]=input.nextInt();
			}}
		int[][] B=new int[3][3];
		System.out.print("Enter values in second 3X3 array:");
		for (int i=0;i<B.length;i++) {			
			for (int j=0;j<B[i].length;j++) {
				B[i][j]=input.nextInt();
				}	}
		int[][] C=new int[3][3];
		for (int i=0;i<C.length;i++) {			
			for (int j=0;j<C[i].length;j++) {
				C[i][j]=A[i][j]-B[i][j];
	}}		
		for (int i=0;i<B.length;i++) {			
			for (int j=0;j<B[i].length;j++) {
				System.out.print(C[i][j]+",");
				}
			System.out.println();}
		}}
