import java.util.Scanner;

public class SearchNumFunc {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int [] array= {3,5,7,3,8,11,12,5,6,4};
		System.out.print("Enter number to search in array: ");
		int N=input.nextInt();
		int res=searchin(array,N);
		System.out.print("The number is found at"+res);
	}
	public static int searchin(int[] array,int N) {
		int index=0;
		
		for(int i=0;i<array.length;i++) {
			if (array[i]==N)
					index=i;	
					}
		return index;
	}}
