import java.util.*;

public class fractional_knapsack {
    static class knapsack{
        int value, weight;
        public knapsack(int v, int w){
            value = v;
            weight = w;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        knapsack[] arr = new knapsack[n];

        for(int i = 0; i < n; i++){
            arr[i] = new knapsack(val[i],wt[i]);
        }

        Arrays.sort(arr,new Comparator<knapsack>() {
            @Override
            public int compare(knapsack a, knapsack b) {
                double r1 = (double)a.value / a.weight;
                double r2 = (double)b.value / b.weight;
                return Double.compare(r2, r1);
            }
        });
        
        int remCap = capacity;
        double totalVal = 0;
        for(int i = 0 ; i < n; i++){
            if(remCap < arr[i].weight){
                totalVal = totalVal + ((double) arr[i].value /arr[i].weight) * remCap;
                break;
            }
            if(remCap - arr[i].weight >= 0){
                remCap  = remCap - arr[i].weight;
                totalVal = totalVal + arr[i].value;
            }

        }
        return totalVal;
    }
    public static void main(String[] args) {
        fractional_knapsack solution = new fractional_knapsack();
        int[] val = {8 ,2 ,10 ,1 ,9 ,7 ,2 ,6 ,4 ,9};
        int[] wt = {10 ,1 ,7 ,7 ,5 ,1 ,8 ,6 ,8 ,7};
        int capacity = 21;
        double result = solution.fractionalKnapsack(val,wt,capacity);
        System.out.println(result);

    }
}
