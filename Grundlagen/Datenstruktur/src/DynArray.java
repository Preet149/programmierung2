public class DynArray<T>{
    private int capacity = 1;   //Speichergroesse
    private T[]data;
    private int size = 0;       //Anzahl der belegten Plaetze.

    public DynArray(int capacity){
        data = (T[]) new Object[capacity];
    }

    //Liefert anzahl der belegten Plaetze.
    public int size(){
        return this.size;
    }

    //Liefert die Speichergroesse.
    public int capacity(){
        return this.capacity;
    }

    //Liefert einen Wert von belegten Positionen.
    public T get(int pos)throws IndexOutOfBoundsException{
        if(pos < 0 || pos > this.size){
            throw new IndexOutOfBoundsException();
        }
        return data[pos];
    }

    //Liefert den alten Wert zurueck und setzt den neuen Wert an einer gewuenschten Position.
    public T set(int pos,T e){
        T returnvalue = get(pos);
        data[pos] = e;
        return returnvalue;
    }





}
