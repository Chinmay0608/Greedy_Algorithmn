import java.util.*;

public class Job_Sequencing {
    static class Job{
        int deadline,profit;
        Job(int d, int p){
            deadline = d;
            profit = p;
        }
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = deadline.length;
        Job[] jobs = new Job[n];

        for (int i = 0; i < n; i++) {
            jobs[i] = new Job(deadline[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (int d : deadline) maxDeadline = Math.max(maxDeadline, d);

        int[] slot = new int[maxDeadline + 1];
        Arrays.fill(slot, -1);

        int countJobs = 0, totalProfit = 0;

        for (Job job : jobs) {
            for (int j = job.deadline; j > 0; j--) { // use job.deadline here!
                if (slot[j] == -1) {
                    slot[j] = job.profit;
                    countJobs++;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        list.add(countJobs);
        list.add(totalProfit);
        return list;
    }
    public static void main(String[] args) {
        Job_Sequencing solution = new Job_Sequencing();
        ArrayList<Integer> result = solution.jobSequencing(new int[]{4, 1, 1, 1}, new int[]{20, 10, 40, 30});
        System.out.println(result);

    }
}
