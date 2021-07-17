package assignment;

public class Selection_sort {

	public static void main(String[] args) {
		int[] array = {3,4,6,5,7,4,12,54,3,1};
		
		int[] y=selection_sort(array);
		System.out.println("Selection sort");
		for (int i=0;i<y.length;i++) {	
			System.out.print(y[i]+" ");
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
}
