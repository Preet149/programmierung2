import org.w3c.dom.ls.LSInput;

public class RVL<T> {
    Listenelement entry;
    private int size;

    //Innere Klasse
    class Listenelement{
        T data;
        Listenelement next = null; //Zeige auf das naechste Element.
        Listenelement prev = null; //Zeige auf das vorherige Element.

        Listenelement(T data){
            this.data = data;
        }
    }

    //Liefert true falls die Liste leer ist.
    public boolean isEmpty(){
        return this.entry == null;
    }

    //Liefert die Anzahl der Listenelemente.
    public int size(){
        return this.size;
    }

    //Fuegt das Element in der Liste hinzu.
    public void add(T e){// ?
        if(entry == null){
            entry = new Listenelement(e);
        }
        else if(this.size == 1){
            entry.next = entry.prev = entry;
        }
        else{
            Listenelement newelem = new Listenelement(e);
            entry.next = entry.prev = newelem;
            newelem.next = newelem.prev = entry;
        }
    }

    public T remove(){
        T value = entry.data;
        entry = entry.next;
        return value;
    }

    //Liefert den Inhalt des aktuellen Listenelements.
    public T element(){
        return entry.data;
    }

    //Verschiebt entry um s Schritte nach vorne.
    public void next(int s){
        int index = 0;
        Listenelement helper = entry;
        while (index != s){
            entry = entry.next;
            index ++;
        }
    }

    //Verschiebt entry um s Schritte nach hinten.
    public void prev(int s){
        int index = 0;
        Listenelement helper = entry;
        while (index != s){
            entry = entry.prev;
            index --;
        }
    }
}
