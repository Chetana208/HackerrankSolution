import java.io. *;

class Result {
    public static String timeConversion(String s) {
        String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        String minute = parts[1];
        String secondAndPeriod = parts[2];
        
        String period = secondAndPeriod.substring(2);
        String seconds = secondAndPeriod.substring(0, 2);
        
        if (period.equals("PM")) {
            if (hour != 12 && hour != 0) { // Corrected condition
                hour += 12;
            }
        } else {
            if (hour == 12) {
                hour = 0;
            }
        }
        
        return String.format("%02d:%s:%s", hour, minute, seconds);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
