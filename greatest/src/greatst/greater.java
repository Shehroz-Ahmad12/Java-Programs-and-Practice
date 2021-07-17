package greatst;
import java.util.Scanner;
public class greater {


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] x= new int[20];
		int[] y=new int[20];
		for (int i=0;i<20;i++) {
			x[i]=input.nextInt();
			
		}
		for (int i=0;i<20;i++) {
			y[i]=x[20-1-i];
		}
		for (int i=0;i<20;i++) {
			System.out.print(y[i]+ " ");
		}
		
		
			}
				
		
		
		
		
	

}
