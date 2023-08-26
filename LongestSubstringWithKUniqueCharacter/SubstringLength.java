import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubstringLength {
    private static int findLengthOfLongestSubstringWithKUniqueCharacters(String s, int k) {
        int n = s.length();

        int maxLen = -1; 
        Map<Character, Integer> map = new HashMap<>(); 
        int i = 0;

        for(int j = 0; j < n; j++) {
            
            char c = s.charAt(j);
            // System.out.println("c = " + c);
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            // System.out.println("map = " + map);

            while(map.size() > k) {
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                // System.out.println("leftCharMap = " + map);
                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                i++;                 
            }

            if(map.size() == k) {
               
                maxLen = Math.max(maxLen, j-i+1);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();
        
        System.out.printf("Longest substring with %d unique characters = %d%n", k, findLengthOfLongestSubstringWithKUniqueCharacters(s, k));
    }
}
