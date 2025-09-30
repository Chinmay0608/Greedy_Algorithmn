import java.util.*;

public class Insert_Interval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        while(i < n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        while(i < n && intervals[i][0] < newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        res.add(newInterval);
        while(i < n) {
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        Insert_Interval solution = new Insert_Interval();
        int[][] result = solution.insert(new int[][]{{1,3},{6,9}}, new int[]{2,5});
        System.out.println("Intervals: " + Arrays.deepToString(result));
    }
}
