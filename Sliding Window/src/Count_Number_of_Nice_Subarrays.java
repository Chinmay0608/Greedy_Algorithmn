import java.util.*;

public class Count_Number_of_Nice_Subarrays {
    public int atMostKOdd(int[] nums, int k) {
        return numberOfSubarrays(nums, k) - numberOfSubarrays(nums, k - 1);
    }
    public int numberOfSubarrays(int[] nums, int k) {
        if(k<0) return 0;
        int l=0,r = 0,count = 0,sum=0;
        while(r<nums.length){
            sum+=(nums[r]%2);

            while(sum>k){
                sum-=(nums[l]%2);
                l++;
            }
            count = count + (r-l+1);
            r++;
        }
        return count;
    }
    public static void main(String[] args) {
        Count_Number_of_Nice_Subarrays solution = new Count_Number_of_Nice_Subarrays();
        int[] arr = {1,1,2,1,1};
        int k = 3;
        int result = solution.atMostKOdd(arr,k);
        System.out.println(result);
    }
}
