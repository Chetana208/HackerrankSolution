import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int positiveNum=0;
    int negativeNum=0;
    int zero=0;
    int size=arr.size();
    
    for(int num:arr)
    {
        if(num > 0)
        {
            positiveNum++;
        }
        else if(num<0)
        {
            negativeNum++;
        }
        else{
            zero++;
        }
        
    }
    double posiRatio= (double) positiveNum/size;
    double negaRatio= (double) negativeNum/size;
    double zeroRatio= (double) zero/size;
    
    System.out.printf("%.6f\n",posiRatio);
    System.out.printf("%.6f\n",negaRatio);
    System.out.printf("%.6f\n",zeroRatio);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
