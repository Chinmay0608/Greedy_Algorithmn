import java.util.*;
public class Longest_SubString_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        Map<Character,Integer> map = new HashMap<>();
        int k = 0;
        for(int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar) && map.get(currentChar) >= k) {
                k = map.get(currentChar) + 1;
            }

            map.put(currentChar, i);

            maxLength = Math.max(maxLength, i - k + 1);
        }
        System.out.println(map);
        return maxLength;
    }
    public static void main(String[] args) {

        Longest_SubString_without_repeating_characters solution = new Longest_SubString_without_repeating_characters();
        String s = "pwwkew";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
