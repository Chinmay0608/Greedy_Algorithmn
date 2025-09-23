public class Jump_game_2 {
    public int jump(int[] nums) {
        int max = 0;
        int count = 0;
        int end = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(i + nums[i], max);
            if (max >= nums.length - 1) {
                count++;
                break;
            }
            if (i == end) {
                count++;
                end = max;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Jump_game_2 solution = new Jump_game_2();
        int[] nums = {};
        int result = solution.jump(nums);
        System.out.println(result);
    }
}
