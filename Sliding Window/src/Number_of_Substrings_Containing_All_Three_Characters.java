public class Number_of_Substrings_Containing_All_Three_Characters {
    public int numberOfSubstrings(String s) {
        int[] lastIndex = {-1,-1,-1};
        int ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            lastIndex[s.charAt(i) - 'a'] = i;
            ans += 1 + Math.min(lastIndex[0], Math.min(lastIndex[1], lastIndex[2]));
        }
        return ans;
    }
    public static void main(String[] args) {
        Number_of_Substrings_Containing_All_Three_Characters solution = new Number_of_Substrings_Containing_All_Three_Characters();
        String s = "abcabc";
        int result = solution.numberOfSubstrings(s);
        System.out.println(result);
    }
}
