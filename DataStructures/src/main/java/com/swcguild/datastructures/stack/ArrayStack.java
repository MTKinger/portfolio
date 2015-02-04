package com.swcguild.datastructures.stack;

import java.util.Iterator;

public class ArrayStack implements Stack {

    private Object[] items;
    private static final int DEFAULT_INITIAL_SIZE = 4;
    private int numItems;

    public ArrayStack() {
        this(DEFAULT_INITIAL_SIZE);
    }

    public ArrayStack(int size) {
        items = new Object[size];
    }

    @Override
    public boolean isEmpty() {
        return numItems == 0;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public void push(Object item) {
        if(numItems == items.length){
            resize(items.length*2);
        }
        items[numItems++] = item;
    }

    @Override
    public Object pop() {
        if(numItems == 0){
            return null;
        }
        Object item = items[--numItems];
        items[numItems] = null;
        if(numItems > 0 &&  numItems <= (items.length/4)){
            resize(items.length/2);
        }
        return item;
    }

    @Override
    public Iterator iterator() {
        return new reverseArrayIterator();
    }
    
    private void resize(int newSize){
        Object[] temp = new Object[newSize];
        for (int i =0 ; i< numItems; i++){
            temp[i] = items[i];
        }
        items = temp;
    }
    
    private class reverseArrayIterator implements Iterator{
        
        private int i = numItems;
        
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Object next() {
            return items[--i];
        }
        
        
        
    }

}
