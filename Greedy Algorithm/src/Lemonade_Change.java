public class Lemonade_Change {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5) five += 1;
            else if(bills[i] == 10) {
                if(five != 0){
                    five -= 1;
                    ten += 1;
                }
                else return false;
            }
            else{
                if(ten !=0 && five != 0){
                    ten -= 1;
                    five -= 1;
                }
                else if(five >= 3){
                    five -=3 ;
                }
                else return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Lemonade_Change solution = new Lemonade_Change();
        int[] bills = {5,5,5,10,20};
        boolean result = solution.lemonadeChange(bills);
        System.out.println(result);
    }
}
