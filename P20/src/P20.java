import java.util.*;

public class P20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = "Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!";
        // Write your code here.
        
        String[] tokens = (s.replaceAll("^\\W+", "").split("[\\s!,?._'@]+"));
        System.out.println(tokens.length);
        for(int i=0; i < tokens.length; i++) {
        	System.out.println(tokens[i].replaceAll("\\p{Punct}", ""));
        }
        scan.close();
	}

}
