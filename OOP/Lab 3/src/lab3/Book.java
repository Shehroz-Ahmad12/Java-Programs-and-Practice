package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Book {
	
	String author;
	String[] chapterNames=new String[5];
	
	public void setData(String x, String[]y ) {

		author =x;
		for (int i=0;i<5;i++) {
			chapterNames[i]=y[i];
		}		}

	public void display() {
		System.out.println("Author name is: "+ author+ " and Chapter names are: "+ Arrays.toString(chapterNames));
		}
	
	public boolean checkIfAuthorNameStartsWithA() {
		if ((author.startsWith("A"))||(author.startsWith("a"))) {
			return true;
		}
		else {
			return false;
		}}
	
	
	public boolean searchChapter(String x) {
			for (int i=0; i<5;i++) {
			if (chapterNames[i]==x) {
				return true;
				}
		}
			return false;
			}
		}
		
