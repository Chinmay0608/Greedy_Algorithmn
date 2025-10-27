import java.util.*;

public class Binary_Subarrays_with_sum {
    public int numSubarraysWithSum(int[] nums, int goal)
    {
        if(goal<0) return 0;
        int l=0,r = 0,sum=0,count=0;
        while(r<nums.length){
             sum+=nums[r];
             while(sum>goal){
                 sum-=nums[l];
                 l++;
             }
             count = count+(r-l+1);
             r++;
        }
        return count;
    }
    public static void main(String[] args) {
        Binary_Subarrays_with_sum solution = new Binary_Subarrays_with_sum();
        int[] arr = {0,0,0,0,0};
        int k = 0;
        int result = solution.numSubarraysWithSum(arr,k);
        System.out.println(result);
    }
}
