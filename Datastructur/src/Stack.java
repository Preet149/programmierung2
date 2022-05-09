import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    List<T>stack = new LinkedList<>();
    private int size=0;

    public void push(T e){
        this.size++;
        stack.add(e);
    }

    public T pop()throws EmptyStackException{
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.remove(--this.size);
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
}
