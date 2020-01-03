import java.util.*;

public class P6 {

	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		for(int i=0; i< 11; ++i) {
			System.out.println(N + " X " + i + " = " + N*i);
		}
		scan.close();
	}

}
