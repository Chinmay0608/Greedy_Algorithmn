import java.util.*;
public class Max_Consecutive_Ones_III {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0, zeros = 0, len = 0, maxLen = 0;
        while(r<nums.length){
            if(nums[r]==0) zeros++;
            if(zeros>k){
                if(nums[l]==0){
                    zeros--;
                }
                l++;
            }
            if(zeros<=k){
                len = r-l+1;
            }
            maxLen = Math.max(maxLen,len);
            r++;
        }
        return maxLen;
    }
    public static void main(String[] args) {
        Max_Consecutive_Ones_III solution = new Max_Consecutive_Ones_III();
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int result = solution.longestOnes(nums,k);
        System.out.println(result);
    }
}
