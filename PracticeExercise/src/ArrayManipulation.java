import java.util.Scanner;
public class ArrayManipulation {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int [] array=new int[10];
		for (int i=0;i<array.length;i++) {
			System.out.print("Enter value in array: ");
			array[i]=input.nextInt();
		}	int index=0;
			int max=array[0];
			for(int i=1;i<array.length;i++) {
			if (array[i]>max) {
				max=array[i];
				index=i;
	}}
			
	System.out.print("Maximum number in array is "+max
			+"and its position is "+index);
	}

}
