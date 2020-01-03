import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("================================");
		for(int i=0; i<3; i++) {
			String s1 = scan.next();
			String num = "";
			int x = scan.nextInt();
			if (x < 100) {
				num = String.format("%03d", x);
			}else {
				num = Integer.toString(x);
			}
			System.out.printf("%-15s%s\n", s1, num);
		}
		System.out.print("================================");
		scan.close();
	}
}
