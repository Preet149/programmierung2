public class Ringpuffer<T>{
    private int size;
    private int capacity;
    T[]data;
    private int pointer = 0;

    public Ringpuffer(int capacity){
        this.capacity = capacity;
        data = (T[]) new Object[capacity];
    }

    //Gibt die Anzahlelemente zurueck.
    public int size(){
        return this.size;
    }

    //Gibt ein Element von einer gewuenschten Position zurueck.
    public T get(int pos)throws IndexOutOfBoundsException{
        if(pos < 0 || pos > size-1){
            throw new IndexOutOfBoundsException();
        }
        return data[pos];
    }

    //Setzt das Element an Position pos und liefert den alten Wert.
    public T set(int pos,T e)throws IndexOutOfBoundsException{
        if(pos < 0 || pos > capacity-1){
            throw new IndexOutOfBoundsException();
        }
        T value = data[pos];
        data[pos] = e;
        return value;
    }

    //Fuegt das Element e vorne im Speicher ein.
    public void addFirst(T e){
        data[0] = e;
    }

    //Fuegt das Element e am Ende des Speichers hinzu.
    public void addLast(T e){
        if(pointer == data.length - 1){
            size = pointer % data.length;
        }
        data[size++] = e;
    }

    public T removeFirst(){
        T value = data[pointer];
        if(pointer == data.length - 1){
            pointer = pointer % data.length;
        }
        data[pointer++] = null;
        return value;
    }

    public T removeLast(){
        return null;
    }

}
