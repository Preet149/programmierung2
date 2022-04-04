/*Im Gegensatz dazu gibt ein Fifo-Objekt das zuerst eingegebene Objekt auch als erstes
 * wieder aus (First-in-First-out).
 */

public class Fifo<T> extends AbstractBuffer<T>{

    public Fifo(){
        super();
    }

    public Fifo(int s) {
        this.array = (T[]) new Object[s];
    }

    //Gibt das aller erstes Objekt zurueck.
    public T pop()throws ArrayIndexOutOfBoundsException {
        if(size() == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        T value = array[0];

        //Jedes Objekt um einen Index nach links verschieben.
        for(int i = 0;i < size-1;i++) {
            array[i] = array[i+1];
        }
        size--;
        return value;
    }
}
