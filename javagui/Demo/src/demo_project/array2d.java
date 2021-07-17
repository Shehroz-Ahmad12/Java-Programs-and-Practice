package demo_project;

import java.util.Arrays;

public class array2d {

	public static void main(String[] args) {
		int[] x = {1,2,3,4,5};
		int[] y = {6,7,8,9,10};
		int[][] z = {x,y};
	
		System.out.println(Arrays.deepToString(z));
	}
	}