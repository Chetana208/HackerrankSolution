
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
    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */++++++
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        tests:
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            Stack<Character> stack = new Stack<>();
            
            for(char c : s.toCharArray())
            {
                if(c == '(')
                    stack.push(')');
                else if(c == '{')
                    stack.push('}');
                else if(c == '[')
                    stack.push(']');
                
                else{
                    if( stack.isEmpty() || c != stack.peek()){
                        System.out.println("NO");
                        continue tests;    
                    }
                    else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
   }
}
