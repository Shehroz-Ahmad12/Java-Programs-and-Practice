import java.util.*;
import java.io.*;
public class Updating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shehroz");
		list.add("Usama");
		list.add("Ali");
		list.add("John");
		writeData(list);
		System.out.println("Enter name to delete from file");
		String x = input.next();
		
		for (int i=0;i<list.size();i++) {
			if(list.get(i).contentEquals(x)) {
				list.remove(i);
				writeData(list);		}
		}	}
public static void writeData(ArrayList<String> list) {
	try {
		BufferedWriter file = new BufferedWriter(new FileWriter("F:\\Java Files\\Database.txt"));
		for (String x:list) {
			file.write(x);
			file.newLine();
		}
		file.close();
	}
	catch(Exception e) {
		System.out.println("File not found");
	}
}
}
