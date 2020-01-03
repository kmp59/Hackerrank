import java.util.*;

public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int i = 1;
		while (line != null) {
			System.out.print(i + " " + line);
			i++;
			try {
				line = sc.nextLine();
				System.out.println();
			} catch (Exception e) {
				break;
			}
		}
		sc.close();
	}
}
