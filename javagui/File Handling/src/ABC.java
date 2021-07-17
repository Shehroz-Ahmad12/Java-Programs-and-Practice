import java.util.*;
import java.io.*;
public class ABC {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		File myFile = new File ("F:\\Java Files\\Output.txt");

		System.out.println("Name Please");
		String x = input.next();
		System.out.println("Age Please");
		int y = input.nextInt();
		

		try {
			PrintWriter fw = new PrintWriter(myFile);
			fw.println(x);
			fw.println(y);
			fw.println(6+1);
			fw.close();
			}
			catch(Exception e) {
				System.out.println("File does not exists");
			}
		
		try {
            FileReader reader = new FileReader("F:\\Java Files\\Output.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
		try {
		Scanner reading = new Scanner(new File("F:\\Java Files\\Output.txt"));
		String name = reading.nextLine();
		String age = reading.nextLine();
		System.out.println(name +" "+ age);
		}catch(Exception e){
			System.out.print("file not found");
		}
		System.out.println("Enter number to delete");
		
		for (int i=0;i<myFile.length();i++) {
			if (  ) 
		}
		//myFile.delete();
	}
	}