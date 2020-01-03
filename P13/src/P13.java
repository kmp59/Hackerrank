import java.util.*;
import java.text.*;

public class P13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        
	        // Write your code here.
	        String us = (NumberFormat.getCurrencyInstance(Locale.US)).format(payment);
	        String india = (NumberFormat.getCurrencyInstance(new Locale("en","in"))).format(payment);
	        String china = (NumberFormat.getCurrencyInstance(Locale.CHINA)).format(payment);
	        String france = (NumberFormat.getCurrencyInstance(Locale.FRANCE)).format(payment);
	        System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.print("France: " + france);
	}

}
