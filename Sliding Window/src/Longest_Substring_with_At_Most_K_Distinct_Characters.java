import java.util.*;

public class Longest_Substring_with_At_Most_K_Distinct_Characters {
    public int longestKSubstring(String s, int k) {
        int maxLen = 0, l = 0, r = 0;
        Map<Character,Integer> map = new HashMap<>();
        while(r<s.length()){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);
            while(map.size()>k){
                int freq = map.get(s.charAt(l));
                if(freq - 1 == 0){
                    map.remove(s.charAt(l));
                }
                else{
                    map.put(s.charAt(l),freq-1);
                }
                l++;
            }
            maxLen = Math.max(maxLen, r-l+1);

            r++;
        }
        if(map.size()<k) return -1;
        return maxLen;
    }
    public static void main(String[] args) {
        Longest_Substring_with_At_Most_K_Distinct_Characters solution = new Longest_Substring_with_At_Most_K_Distinct_Characters();
        String s  = "aabacbebebe";
        int k = 3;
        int result = solution.longestKSubstring(s,k);
        System.out.println(result);
    }
}
