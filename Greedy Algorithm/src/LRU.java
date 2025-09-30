import java.util.*;

public class LRU {
    static int pageFaults(int N, int C, int pages[]) {
        // code here
        int page_faults = 0;
        LinkedHashSet<Integer> store = new LinkedHashSet<>(C);

        for (int i = 0; i < N; i++) {
            int page = pages[i];

            if (store.contains(page)) {
                store.remove(page);
                store.add(page);
            } else {
                page_faults++;

                if (store.size() == C) {
                    Iterator<Integer> it = store.iterator();
                    store.remove(it.next());
                }
                store.add(page);
            }
        }
        return page_faults;
    }
    public static void main(String[] args) {
        LRU solution = new LRU();
        int result = solution.pageFaults(9,4,new int[]{5,0,1,3,2,4,1,0,5});
        System.out.println(result);
    }
}
