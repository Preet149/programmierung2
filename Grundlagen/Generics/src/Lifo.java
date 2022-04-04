
/* Die Klasse Lifo implementiert ein Speicher-Objekt (Kellerspeicher, Stack), welches Integer
 * Objekte aufnimmt und ausgibt. Dabei wird das zuletzt eingegebene Objekt zuerst wieder ausgegeben (last-in-rst-out).
 */

public class Lifo<T> extends AbstractBuffer<T>{

    public Lifo(){
        super();
    }

    public Lifo(int s) {
        this.array = (T[]) new Object[s];
    }

    //Gibt das letzte Objekt zurueck.
    public T pop()throws ArrayIndexOutOfBoundsException {
        if(size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.array[--size];
    }
}
