import java.io.*;
import java.util.*;
public class TryCatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		try {
			int res = a/b;
			System.out.println (res);
			}
		catch(ArithmeticException e1) {
			System.out.println("Number cannot be zero");
		}
		catch (NullPointerException e2) {
			System.out.println("Number cannot be null");
		}}
}
