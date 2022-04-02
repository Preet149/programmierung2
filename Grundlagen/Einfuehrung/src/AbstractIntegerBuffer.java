import java.util.Random;

public abstract class AbstractIntegerBuffer implements IntegerBuffer{
    protected int size = 0;     //Anzahl von Objekten im Speicher.
    protected Integer[]array;

    //Generiert zufaellig die Groesse des Speichers.
    public AbstractIntegerBuffer() {
        Random rnd = new Random();
        this.array = new Integer[rnd.nextInt(98) + 3];
    }

    //Legt die Groesse des Speichers fest.
    public AbstractIntegerBuffer(int s) {
        this.array = new Integer[s];
    }

    //Speichert das neue Objekt auf den Stack.
    public void push(Integer i)throws IllegalArgumentException,StackOverFlowExceptions{
        if(i < 0) {
            throw new IllegalArgumentException();
        }
        else if(size >= capacity()){
            throw new StackOverFlowExceptions();
        }
        this.array[size++] = i;
    }

    //Gibt die Anzahl von Objekten zurueck.
    public int size() {
        return size;
    }

    //Gibt die Groesse des Speichers zurueck.
    public int capacity() {
        return array.length;
    }
}
