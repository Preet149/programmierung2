//Verschiebt die Objekten von source nach sink.
public class Helper {
    public static void move(IntegerBuffer source,IntegerBuffer sink) throws StackOverFlowExceptions {
        for (int i = 0; i < source.size(); i++) {
            sink.push(source.pop());
        }
    }
}
