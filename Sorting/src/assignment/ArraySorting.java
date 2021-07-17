package assignment;

public class ArraySorting {

	public static void main(String[] args) {
		int[] array = {3,4,6,5,7,4,12,54,3,1};
		
		int[] y=selection_sort(array);
		System.out.println("Selection sort");
		for (int i=0;i<y.length;i++) {	
			System.out.print(y[i]+" ");
		}	
				
		int[] z=bubble_sort(array);
		System.out.println("/nBubble sort");
		for (int i=0;i<z.length;i++) {
			System.out.print(z[i]+" ");
		}
		
		int[] x=insertion_sort(array);
		System.out.println("/nInsertion sort");
		for (int i=0;i<array.length;i++) {
			System.out.print(x[i]+" ");
		}
	}
	public static int[] selection_sort(int[] array) {
		for (int i=0; i<array.length;i++) {
			int min=array[i];
			int index=i;
			for (int j=i+1;j<array.length;j++) {
				if (min>array[j]) {
					min=array[j];
					index=j;
				}
			}
			if (index!=i) {
				array[index]=array[i];
				array[i]=min;
			}
		}
			return (array);
	}
	public static int[] bubble_sort(int[] array) {
		int temp=0;
		for(int i=0;i<array.length;i++) {
			for (int j=1;j<array.length-1;j++) {
				if (array[j-1]<array[j])
					temp =array[j-1];
					array[j-1]=array[j];
					array[j]=temp;										
			}
		}
		return array;
	}
	public static int[] insertion_sort(int[] array) {
		for (int i=1;i<array.length;i++) {
			int temp=array[i];
			int j=i-1;
			while ((j>=0)&&(array[j]>temp)){
				array[j+1]=array[j];
				i--;
				
			}
			array[j+1]=temp;
		}
		
		return array;
	}
}
