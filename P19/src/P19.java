import java.util.Scanner;

public class P19 {
	
	static boolean isAnagram(String a, String b) {
        // Complete the function
		if(a.length() != b.length()) {
			return false;
		}
	    int value = 0;  
	    a = a.toLowerCase();
	    b = b.toLowerCase();
	    for (int i = 0; i < a.length(); i++)  
	    {  
	        value = value ^ (int) a.charAt(i);  
	        value = value ^ (int) b.charAt(i);  
	    }  
	  
	    return value == 0;  
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
