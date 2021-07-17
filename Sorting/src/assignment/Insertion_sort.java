package assignment;

public class Insertion_sort {

	public static void main(String[] args) {
		int[] array = {6,4,6,5,7,4,12,54,3,1};
		int[] x=insertion_sort(array);
		System.out.println("Insertion sort");
		for (int i=0;i<array.length;i++) {
			System.out.print(x[i]+" ");
		}
	}
	public static int[] insertion_sort(int[] array) {
		for (int i=1;i<array.length;i++) {
			int temp=array[i];
			int j=i-1;
			while ((j>=0)&&(array[j]>temp)){
				array[j+1]=array[j];
				j--;
				
			}
			array[j+1]=temp;
		}
		
		return array;
	}
}
