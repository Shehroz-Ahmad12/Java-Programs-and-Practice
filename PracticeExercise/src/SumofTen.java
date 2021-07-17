
public class SumofTen {

	public static void main(String[] args) {
		int N=10;
		System.out.print(sumOfTen(N));
		
	}
	public static int sumOfTen(int N) {
		if (N==0)
			return 0;
		else
			return (N+sumOfTen(N-1));
	}}
