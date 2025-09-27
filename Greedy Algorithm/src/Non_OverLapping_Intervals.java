import java.util.*;

public class Non_OverLapping_Intervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));

        int lastEnd = intervals[0][1];
        int count = 1;

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] >= lastEnd) {
                count++;
                lastEnd = intervals[i][0];
            }
        }

        return intervals.length - count;
    }
    public static void main(String[] args) {
        Non_OverLapping_Intervals solution = new Non_OverLapping_Intervals();
        int result = solution.eraseOverlapIntervals(new int[][]{{1,2},{2,3},{3,4},{1,3}});
        System.out.println(result);

    }
}
