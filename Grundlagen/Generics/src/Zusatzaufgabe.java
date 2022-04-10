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

    public static int differencof2sum(int range)throws IllegalArgumentException{
        if(range < 0){
            throw new IllegalArgumentException("Range should not be a negative number!!");
        }
        int sum1 = 0;
        int sum2 = 0;
        int difference = 0;
        for(int i = 0;i < range ;i++){
            sum1 += Math.pow((i+1),2);
            sum2 += i+1;
        }
        sum2 = (int)Math.pow(sum2,2);
        difference = sum2 - sum1;

        return difference;
    }
}
