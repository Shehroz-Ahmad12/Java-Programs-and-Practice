import java.util.Scanner;
public class SearchNumber {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int [] array= {3,5,7,3,8,11,12,5,6,4};
		System.out.print("Enter number to search in array: ");
		int N=input.nextInt();
		int index=0;
		int count=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]==N)
					count++;
					index=i;	
					}
			if (count>0) {
				System.out.println("Number found at");
				System.out.println(index);
			}
			else
			System.out.print("Number not found");
		}}
