import java.util.*;

public class P3 {
	
	private static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		if((n%2 != 0) || ((n%2 == 0) && n >=6 && n <= 20)) {
			System.out.print("Weird");;
		}else {
			if((n>=2 && n<=5) || (n>20)){
				System.out.print("Not Weird");
			}
		}
		scan.close();
	}

}
