import java.util.*;

public class longest_repeating_character_replacement {
    public int characterReplacement(String s, int k) {
        int l = 0, maxFreq = 0, maxLen = 0;
        // Using an array is slightly more efficient than a HashMap for this problem
        // since we only have uppercase English letters.
        int[] count = new int[26];

        for (int r = 0; r < s.length(); r++) {
            // 1. Expand the window and update character counts.
            char charR = s.charAt(r);
            count[charR - 'A']++;

            // 2. Update the frequency of the most common character in the current window.
            maxFreq = Math.max(maxFreq, count[charR - 'A']);

            // 3. Check if the window is invalid.
            // The number of characters to replace is windowLength - maxFreq.
            // If this number is greater than k, the window is invalid, so we shrink it.
            if ((r - l + 1) - maxFreq > k) {
                char charL = s.charAt(l);
                count[charL - 'A']--;
                l++;
            }

            // 4. The window is valid, so update the maximum length found so far.
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        longest_repeating_character_replacement solution = new longest_repeating_character_replacement();
        String s = "AABABBA";
        int k = 1;
        int result = solution.characterReplacement(s,k);
        System.out.println(result);
    }
}
