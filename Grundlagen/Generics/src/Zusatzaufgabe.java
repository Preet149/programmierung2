public class Zusatzaufgabe {
    public static int sum(int range)throws IllegalArgumentException{
        if(range < 0){
            throw new IllegalArgumentException("Range should not be a negative number!!");
        }
        int sum1 = 3;
        int sum2 = 5;
        int sum = 0;

        for(int i = 1;i < range;i++){
            if((sum1 * i) < range){
                sum += (sum1 * i);
            }

            if((sum2 * i) < range){
                sum += (sum2 * i);
            }
        }
        return sum;
    }
}
