import java.util.*;

public class N_meetings_in_a_room {
    static class Meeting{
        int start,end;
        Meeting(int s, int e) {
            start = s;
            end = e;
        }
    }
    public int maxMeetings(int[] start, int[] end) {
        int n = start.length;
        Meeting[] meetings = new Meeting[n];

        for(int i = 0; i < n; i++){
            meetings[i] = new Meeting(start[i],end[i]);
        }

        Arrays.sort(meetings,(a,b) -> a.end - b.end);

        int count = 1;
        int lastEnd = meetings[0].end;

        for(int i = 0; i < n; i++){
            if(meetings[i].start > lastEnd) {
                count++;
                lastEnd = meetings[i].end;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        N_meetings_in_a_room solution = new N_meetings_in_a_room();
        int result = solution.maxMeetings(new int[]{1, 3, 0, 5, 8, 5},new int[]{2, 4, 6, 7, 9, 9});
        System.out.println(result);
    }
}
