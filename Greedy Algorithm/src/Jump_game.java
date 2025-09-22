public class Jump_game {
    public boolean canJump(int[] nums) {
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(i > max) return false;
            max = Math.max(nums[i]+i,max);
        }
        return true;
    }
    public static void main(String[] args) {
        Jump_game solution = new Jump_game();
        int[] nums = {2,3,1,1,4};
        boolean result = solution.canJump(nums);
        System.out.println(result);
    }
}
