/*Im Gegensatz dazu gibt ein Fifo-Objekt das zuerst eingegebene Objekt auch als erstes
 * wieder aus (First-in-First-out).
 */

public class Fifo extends AbstractIntegerBuffer{

    public Fifo(){
        super();
    }

    public Fifo(int s) {
        this.array = new Integer[s];
    }

    //Gibt das aller erstes Objekt zurueck.
    public Integer pop()throws ArrayIndexOutOfBoundsException {
        if(size() < 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Integer value = array[0];

        //Jedes Objekt um einen Index nach links verschieben.
        for(int i = 0;i < size;i++) {
            array[i] = array[i+1];
        }
        size--;
        return value;
    }
}
