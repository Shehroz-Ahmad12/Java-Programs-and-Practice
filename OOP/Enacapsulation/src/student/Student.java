package student;

import java.util.Arrays;

public class Student {
	private String name;
	private int[] result=new int[5];
	
	public Student() {
		name="";

	}
	
	public Student(String x , int[] y) {
		name= x;
		for (int i=0;i<5;i++) {
			result[i]=y[i];			
		}
		}
	public double average() {
		int sum=0;
		for (int i=0;i<5;i++) {
			sum+=result[i];			
		}
		return sum/5;
	}
	
	public void setName(String x) {
		name=x;
	}
	public void setMarks(int[] y) {
		for (int i=0;i<5;i++) {
			result[i]=y[i];
		}}
	public String getName() {
		return name;
	}
	public int[] getMarks() {
		return result;
	}
	public void display() {
		System.out.println(name+" "+Arrays.toString(result) );
	}
}
