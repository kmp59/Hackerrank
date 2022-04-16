import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private static Scanner in = new Scanner(System.in);
    private static int B = in.nextInt();
    private static int H = in.nextInt();
    private static boolean flag = checkFlag();

    private static boolean checkFlag(){
        if(B <=0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            return false;
        }
        else if(B <= 100 && H <= 100) return true;
        return false;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main
}//end of class