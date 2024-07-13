import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.*;

class Result {

    public static void miniMaxSum(List<Integer> arr) {
        BigInteger minSum = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger maxSum = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger totalSum = BigInteger.ZERO;

        for (int num : arr) {
            totalSum = totalSum.add(BigInteger.valueOf(num));
        }
        
        for (int num : arr) {
            BigInteger sumWithoutCurrent = totalSum.subtract(BigInteger.valueOf(num));
            minSum = minSum.min(sumWithoutCurrent);
            maxSum = maxSum.max(sumWithoutCurrent);
        }
        
        System.out.println(minSum + " " + maxSum);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
