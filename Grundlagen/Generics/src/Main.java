public class Main {
    public static void main(String[]args) throws StackOverFlowExceptions {
        Fifo<Integer>f = new Fifo<>(5);
        System.out.println(f.capacity());

        for(int i = 0;i < f.capacity();i++){
            f.push(i);
        }

        for(int i = 0;i < f.capacity();i++){
            System.out.println(f.pop());
        }






    }
}
