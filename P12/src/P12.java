import java.io.*;
import java.text.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String dateFormat = String.format("%d-%d-%d", year, month, day);
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-M-d").parse(dateFormat);
        }catch(ParseException ref){
            ref.printStackTrace();
        }
        return (new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date)).toUpperCase();
    }

}

public class P12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\Hackerrank\\Java\\P12\\input00.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\Hackerrank\\Java\\P12\\output00.txt"));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
	}

}
