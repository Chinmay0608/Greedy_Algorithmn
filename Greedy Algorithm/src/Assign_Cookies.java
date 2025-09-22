import java.util.*;

public class Assign_Cookies{
    public int findContentChildren(int[] g, int[] s) {
        int l=0 , r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(l < g.length && r < s.length){
            if(g[l] <= s[r]){
                l+=1;
            }
            r+=1;
        }
        return l;
    }
    public static void main(String[] args) {
        Assign_Cookies solution = new Assign_Cookies();
        int[] g = {1,2,3};
        int[] s = {1,1};
        int result = solution.findContentChildren(g,s);
        System.out.println(result);
    }
}