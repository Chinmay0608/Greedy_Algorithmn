import java.util.*;

public class Min_number_of_Platforms {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = dep.length;
        int i = 1; int j = 0;
        int count = 1; int maxCount = 1;

        while(i < n && j < n){
            if(arr[i] <= dep[j]){
                count += 1;
                i += 1;
            }

            else {
                count--;
                j += 1;
            }

            if (count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int[] arr = {900, 940, 950, 1100, 1500, 1800};
        int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
        Min_number_of_Platforms solution = new Min_number_of_Platforms();
        int result = solution.minPlatform(arr,dep);
        System.out.println(result);
    }
}
