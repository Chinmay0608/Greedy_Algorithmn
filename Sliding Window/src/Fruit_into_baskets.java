import java.util.*;

public class Fruit_into_baskets {
//    public int totalFruit(int[] fruits) {
//        if (fruits == null || fruits.length == 0) {
//            return 0;
//        }
//        int l = 0, r = 0, maxLen = 0, len = 0;
//        Map<Integer,Integer> map = new HashMap<>();
//        while(r<fruits.length){
//            int rightFruit = fruits[r];
//            map.put(rightFruit,map.getOrDefault(rightFruit,0)+1);
//
//            while(map.size() > 2){
//                int leftFruit = fruits[l];
//                map.put(leftFruit,map.get(leftFruit)-1);
//                if(map.get(leftFruit) == 0){
//                    map.remove(leftFruit);
//                }
//                l++;
//            }
//            maxLen = Math.max(maxLen,r-l+1);
//            r++;
//        }
//        return maxLen;
//    }
    public int totalFruit(int[] fruits) {
        int n = fruits.length;

        int l = 0, r = 0;
        int maxF = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        while(r<n){

            mp.put(fruits[r], mp.getOrDefault(fruits[r],0)+1);

            while(mp.size()>2){

                int fq = mp.get(fruits[l]);

                if(fq - 1 == 0){
                    mp.remove(fruits[l]);
                }
                else{
                    mp.put(fruits[l],fq-1);
                }

                l++;

            }

            maxF = Math.max(maxF, r-l+1);

            r++;
        }
        return maxF;
    }
    public static void main(String[] args) {
        Fruit_into_baskets solution = new Fruit_into_baskets();
        int[] nums = {3,3,3,1,2,1,1,2,3};
        int result = solution.totalFruit(nums);
        System.out.println(result);
    }
}
