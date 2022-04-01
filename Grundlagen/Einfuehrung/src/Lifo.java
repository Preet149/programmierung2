
/* Die Klasse Lifo implementiert ein Speicher-Objekt (Kellerspeicher, Stack), welches Integer
 * Objekte aufnimmt und ausgibt. Dabei wird das zuletzt eingegebene Objekt zuerst wieder ausgegeben (last-in-rst-out).
 */

public class Lifo extends AbstractIntegerBuffer{

    public Lifo(int s) {this.array = new Integer[s];}

    //Gibt das letzte Objekt zurueck.
    public Integer pop()throws ArrayIndexOutOfBoundsException {
        if(size == 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.array[--size];
    }
}
