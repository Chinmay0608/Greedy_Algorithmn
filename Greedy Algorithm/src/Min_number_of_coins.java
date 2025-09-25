public class Min_number_of_coins {
    public int findMin(int n) {
        // code here
        int count = 0;

        count += n / 10;
        n %= 10;

        count += n / 5;
        n %= 5;

        count += n / 2;
        n %= 2;

        count += n;

        return count;
    }
    public static void main(String[] args) {
        Min_number_of_coins solution = new Min_number_of_coins();
        int result = solution.findMin(121);
        System.out.println(result);
    }

}
