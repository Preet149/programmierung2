import java.util.List;

public class EVL<T>{
    Listenelement first = null;   //Zeige auf das erste Element.
    Listenelement last = null;    //Zeige auf das letzte Element.
    private int size = 0;

    //Innere Klasse
    class Listenelement{
        T data;
        Listenelement next = null; //Zeige auf das naechste Element.

        Listenelement(T data){
            this.data = data;
        }
    }

    //Liefert das erste Element zurueck.
    public T getFirst()throws NullPointerException{
        if(first == null){
            throw new NullPointerException();
        }
        return first.data;
    }

    //Liefert das letzte Element zurueck.
    public T getLast()throws NullPointerException{
        if(first == null){
            throw new NullPointerException();
        }
        return last.data;
    }

    //Fuegt das Element e am Ende der Liste hinzu.
    public void addLast(T e){
        this.size++;
        Listenelement newelem = new Listenelement(e);
        if(first == null){
            first = newelem;
            last = newelem;
        }
        else {
            Listenelement helper = first;
            while(helper.next != null){
                helper = helper.next;
            }
            helper.next = newelem;
            last = newelem;
        }
    }

    //Löscht und liefert das Element.
    public T removeLast()throws NullPointerException{
        int index = 0;
        if(first == null){
            throw new NullPointerException();
        }
        Listenelement helper = first;
        while(index != this.size - 2){//Suche das vorletzte Element.
            helper = helper.next;
        }
        T value = helper.data; //Last element found.
        last = helper;
        helper.next = null;
        this.size--;
        return value;
    }

    //Checkt ob das Element e in der Liste gebe.
    public boolean contains(T e)throws NullPointerException{
        if(first == null){
            throw new NullPointerException();
        }
        Listenelement helper = first;
        while(helper.data != e){
            if(helper.next == null){
                return false;
            }
            helper = helper.next;
        }
        return true;
    }

    //Liefert die Anzahl der Elemente zurueck.
    public int size(){
        return this.size;
    }

}
