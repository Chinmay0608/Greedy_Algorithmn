import java.util.*;

public class Shortest_Job_First {
    static int solve(int bt[]) {
        Arrays.sort(bt);

        int waiting = 0;
        int elapsed = 0;
        for(int i = 0; i < bt.length; i++){
            waiting += elapsed;
            elapsed += bt[i];
        }
        return waiting/bt.length;
    }
    public static void main(String[] args) {
       Shortest_Job_First solution = new Shortest_Job_First();
       int[] bt = {4,3,7,1,2};
       int result = solution.solve(bt);
        System.out.println(result);
    }
}
