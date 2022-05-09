public class ONotation {
    public static void main(String[]args){
        long start = System.currentTimeMillis();
        System.out.println("Position: "+searchnumber(2));
        long end = System.currentTimeMillis();
        System.out.println("Laufzeit: "+ (end - start) +"ms");

    }

    private static int searchnumber(int n) {
        int[]numbers = {1,2,3,4,5,6};
        for(int i = 0;i < numbers.length;i++){
            if(n == numbers[i]){
                return i;
            }
        }
        return -1;
    }
}
