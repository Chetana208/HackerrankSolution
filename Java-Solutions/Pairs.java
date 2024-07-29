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




public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            
        }
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] - arr[i] == k || arr[i] - arr[j]==k)
                {
                    count++;
                }
                else if(arr[i]-arr[j] > k || arr[j]-arr[i]>k){
                    break;
                }
            }
        }
        System.out.println(count);
        
    }
}
