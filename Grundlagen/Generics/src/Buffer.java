public interface Buffer<T>{
    public void push(T i)throws IllegalArgumentException,StackOverFlowExceptions;    //Speichert ein Objekt im Speicher.
    public T pop()throws ArrayIndexOutOfBoundsException;                             //Liefert ein Objekt vom Speicher zurueck.
    public int size();                                                               //Gibt die Anzahl von Objekten zurueck.
    public int capacity();
}
