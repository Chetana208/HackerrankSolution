
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
     * Complete the 'noPrefix' function below.
     *
     * The function accepts STRING_ARRAY words as parameter.
     */
    public static void noPrefix(List<String> words) {
    // Write your code here
    if (words == null || words.size() < 2) {
            System.out.println("GOOD SET");
            return;
        }
        
        // brutal force
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (i != j && 
                    words.get(i).startsWith(words.get(j))) {
                    System.out.println("BAD SET");
                    System.out.println(words.get(i));
                    return;
                }    
            }
        }
        System.out.println("GOOD SET");
    }
}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> words = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());
        Result.noPrefix(words);
        bufferedReader.close();
    }
}
