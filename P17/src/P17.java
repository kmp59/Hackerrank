import java.util.*;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B = "";
        sc.close();
        /* Enter your code here. Print output to STDOUT. */
        if (A.length() > 50){
            System.out.print("No");
        }else{
            for(int i = A.length()-1; i >=0; i--){
            B = B + A.charAt(i);
            }
            if(B.compareTo(A) == 0){
                System.out.print("Yes");
            }else{
                System.out.print("No");
            }
        }
	}

}
