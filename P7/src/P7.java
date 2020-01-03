import java.util.*;


public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i < t; ++i) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
			int [] result = new int [n];
			result[0] = a+b;
			System.out.print(result[0] + " ");
			for(int j = 1; j<n ; ++j) {
				result[j] = (int) (result[j-1] + Math.pow(2, j) * b);
				System.out.print(result[j] + " ");
			}
			System.out.println();
		}
		scan.close();
	}

}
