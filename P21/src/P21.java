import java.util.Scanner;
import java.util.regex.*;

public class P21 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	//Write your code 
            if(pattern == null){
                System.out.println("Invalid");
            }else{
                try{
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                }catch(PatternSyntaxException e){
                    System.out.println("Invalid");
                }
            }
            testCases--;
		}
        in.close();
	}

}
