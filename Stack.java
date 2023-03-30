package com.JavaCal;
import java.util.*;

public class Stack<T> implements StackInt<T> {
    private List<T> theData;
    public Stack(){
        theData = new ArrayList<>();
    }
    @Override
    public T push(T obj) {
        theData.add(obj);
        return obj;
    }

    @Override
    public T peek() {
        if(isEmpty()) throw new NoSuchElementException();
        return theData.get(theData.size()-1);
    }

    @Override
    public T pop() {
        if(isEmpty()) throw new NoSuchElementException();
        return theData.remove(theData.size()-1);
    }

    @Override
    public boolean isEmpty() {
        return theData.isEmpty();
    }

    @Override
    public String toString(){
        if(isEmpty()) throw new NoSuchElementException();
        return theData.toString();
    }
}
