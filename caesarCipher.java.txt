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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */
    
   public static String caesarCipher(String s, int k) {
    StringBuilder t = new StringBuilder(); // Use StringBuilder for efficient string concatenation
    for (int n = 0; n < s.length(); n++) {
        char ch = s.charAt(n);
        
        // Check if the character is an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (((ch - 'A' + k) % 26) + 'A'); // Apply the Caesar cipher transformation for uppercase letters
        }
        // Check if the character is a lowercase letter
        else if (ch >= 'a' && ch <= 'z') {
            ch = (char) (((ch - 'a' + k) % 26) + 'a'); // Apply the Caesar cipher transformation for lowercase letters
        }
        // Non-alphabetic characters remain unchanged
        // Append the transformed character to the StringBuilder
        t.append(ch);
    }
    return t.toString(); // Convert StringBuilder to String and return
}
    }
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        String s = bufferedReader.readLine();
        int k = Integer.parseInt(bufferedReader.readLine().trim());
        String result = Result.caesarCipher(s, k);
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
