package assignment;

public class Min_Max_Sum {

	public static void main(String[] args) {
		int[] array= {4,6,2,8,3,9,1,5,8};
		int[] n=new int[3];
		int[] res=func(array,n);
		System.out.println(" The sum is "+res[0]+"\n The minimum is "+res[1]+"\n The maximum is "+n[2]);
	}
	public static int[] func(int[] array,int[] n) {
		int sum=0;
		int min=array[0];
		int max=array[0];
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
		}
		n[0]=sum;
		for(int i=1;i<array.length;i++) {
			if (array[i]<min) {
				min=array[i];
			}	}
		n[1]=min;
		for(int i=1;i<array.length;i++) {
			if (array[i]>max) {
				max=array[i];
			}	}
		n[2]=max;															
		return n;
	}}
