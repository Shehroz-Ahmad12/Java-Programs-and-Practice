import java.util.Scanner;
public class FunctionLargeArray {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int [] array=new int[10];
		for (int i=0;i<array.length;i++) {
			System.out.print("Enter value in array: ");
			array[i]=input.nextInt();
		}
		int res=largest(array);
		System.out.print("Mximum is "+res);
	}
	public static int largest(int[] array ) {
		int max=array[0];
		for(int i=1;i<array.length;i++) {
		if (array[i]>max) {
			max=array[i];
			}}
		return max;
	}}
