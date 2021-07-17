import java.io.*;
import java.util.*;
public class FileHandling {
	private Scanner x;
	public void openfile() {
	try {
		x=new Scanner(new File("/Quiz Game/src/questions.txt") );
	}
	catch (Exception e) {
		System.out.println("File not found");
	}}
	public void readfile() {
		String a=x.nextLine();
		System.out.println(a);
	}}