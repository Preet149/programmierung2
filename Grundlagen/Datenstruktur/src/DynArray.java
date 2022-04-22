import jdk.jshell.execution.JdiExecutionControl;

import java.util.NoSuchElementException;

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

    //Verdoppelt die Speichergroesse.
    public void increase(){
        T[]tmp = (T[]) new Object[this.capacity * 2];

        //Elemente auf den neuen Array kopieren.
        for(int i = 0;i < this.size;i++){
            tmp[i] = data[i];
        }
        data = tmp;
    }

    //Halbiert die Speichergroesse.
    public void decrease(){
        T[]tmp = (T[]) new Object[this.capacity/2];

        for(int i = 0;i < size;i++){
            tmp[i] = data[i];
        }
        data = tmp;
    }

    //Fuegt das Element e am Beginn des Speichers hinzu.
    public void addFirst(T e){
        if(size == capacity){
            increase();
        }

        //Alle Elemente um einen Index nach rechts verschieben.
        for(int i = 0;i < size;i++){
            data[i+1] = data[i];
        }
        data[0] = e;
    }

    //Fuegt das Element e am Ende des Speichers hinzu.
    public void addLast(T e){
        if(size == capacity){
            increase();
        }
        data[size++] = e;
    }

    //Löscht das 1.Element vom Speichert und liefert es zurueck.
    public T removeFirst()throws NoSuchElementException {
        if(size == 0){
            throw new NoSuchElementException();
        }
        T returnvalue = data[0];

        for(int i = 0;i < size-1;i++){ // 1 2 3 4  ----> 2 3 4
            data[i] = data[i+1];
        }

        if(4 * size <= capacity){
            decrease();
        }
        size--;
        return returnvalue;
    }

    //Löscht das letzte Element vom Speicher und liefert es zurueck.
    public T removeLast()throws NoSuchElementException{
        if(size == 0){
            throw new NoSuchElementException();
        }
        T returnvalue = data[--size];

        if(4 * size <= capacity){
            decrease();
        }
        return returnvalue;
    }




}
