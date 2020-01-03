import java.util.*;

public class P10 {
	static boolean flag = false;
	static int B, H;
	static{
	    Scanner sc = new Scanner(System.in);
	    B = sc.nextInt();
	    H = sc.nextInt();
	    if (B <= 0 || H <= 0){
	        System.out.print("java.lang.Exception: Breadth and height must be positive");
	    }else{
	        flag = true;
	    }
	    sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
	}

}
