import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int [] array=new int[10];
		for (int i=0;i<array.length;i++) {
			System.out.print("Enter value in array: ");
			array[i]=input.nextInt();
		}
			int sum=0;
			for(int i=0;i<array.length;i++) {
				sum+=array[i];
			}
			
	System.out.print("Sum of array is "+sum);	
	}}
