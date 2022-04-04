import java.util.Random;

public abstract class AbstractBuffer<T> implements Buffer<T>{
    protected int size = 0;     //Anzahl von Objekten im Speicher.
    protected T[]array;

    //Generiert zufaellig die Groesse des Speichers.
    public AbstractBuffer() {
        Random rnd = new Random();
        this.array = (T[]) new Object[rnd.nextInt(98) + 3];
    }

    //Legt die Groesse des Speichers fest.
    public AbstractBuffer(int s) {
        this.array = (T[]) new Object[s];
    }

    //Speichert das neue Objekt auf den Stack.
    public void push(T i)throws IllegalArgumentException,StackOverFlowExceptions{
        if(size >= capacity()){
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
