package assignment;

public class Bubble_sort {

	public static void main(String[] args) {
		int[] array = {3,5,6,7,1,3,4,5};
		int[] z=bubble_sort(array);
		System.out.println("Bubble sort");
		for (int i=0;i<z.length;i++) {
			System.out.print(z[i]+" ");
		}
	}
	public static int[] bubble_sort(int[] array) {
		int temp=0;
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			for (int j=0;j<n-1-i;j++) {
				if (array[j]>array[j+1])
					temp =array[j];
					array[j]=array[j+1];
					array[j+1]=temp;										
			}
		}
		return array;
	}
}
