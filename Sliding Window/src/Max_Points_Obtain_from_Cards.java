import java.util.*;

public class Max_Points_Obtain_from_Cards{
    public int maxScore(int[] cardPoints, int k) {
        int maxSum;
        int rSum=0,lSum=0;
        for(int i=0;i<k;i++){
            lSum+=cardPoints[i];
        }
        maxSum = lSum;
        int rIdx = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            lSum = lSum-cardPoints[i];
            rSum = rSum+cardPoints[rIdx];
            rIdx-=1;
            maxSum = Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Max_Points_Obtain_from_Cards solution = new Max_Points_Obtain_from_Cards();
        int[] arr = {1,2,3,4,5,6,1};
        int k = 3;
        int result = solution.maxScore(arr,k);
        System.out.println(result);
    }
}