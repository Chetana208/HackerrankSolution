
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


class Solution {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int sum=0;
        int startIndex=0;
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            int petrol=s.nextInt();
            int distance=s.nextInt();
            sum +=petrol-distance;
            if(sum < 0)
            {
                sum=0;
                startIndex=i+1;
            }
        }
        System.out.println(startIndex);
        
    }
    /*
     * Complete the 'truckTour' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY petrolpumps as parameter.
     */
   
}
