import java.util.Scanner;
public class MatrixMax {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[][] matrix=new int[3][3];
		System.out.print("Enter values in 3X3 array:");
		for (int i=0;i<matrix.length;i++) {			
			for (int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=input.nextInt();
			}	}
		int[] index= {0,0};
		int max=matrix[0][0];
		for (int i=0;i<matrix.length;i++) {			
			for (int j=0;j<matrix[i].length;j++) {
				if (matrix[i][j]>max)
					max=matrix[i][j];
					index[0]=i;
					index[1]=j;
			}}
		System.out.print("Maximum value is "+max+" and index is"+index[0]+","+index[1]);
	}}
