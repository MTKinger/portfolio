package com.swcguild.datastructures.queue;

import java.awt.ItemSelectable;
import java.util.Iterator;

public class ArrayQueueWardSolution implements Queue {

    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Object[] items;
    private int numItems = 0;
    private int head;
    private int tail;

    public ArrayQueueWardSolution() {
        this(DEFAULT_INITIAL_SIZE);
    }

    public ArrayQueueWardSolution(int size) {
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
    public void enqueue(Object item) {
        items[tail++] = item;

        //  Check to see if tail went off the end.
        if (tail == items.length) {
            tail = 0;
        }

        if (++numItems == items.length) {
            resize(2 * items.length);
        }

    }

    @Override
    public Object dequeue() {
        if (numItems == 0){
            return null;
        }
        Object returnObject = items[head];
        items[head++] = null;
    if (head == items.length){
        head = 0;
    }
    
    if(--numItems <= (items.length/4)){
        resize(items.length/2);
    }
    return returnObject;
    }
    

    @Override
    public Iterator iterator() {
        return new wrappedArrayIterator();
    }

    private void resize(int newSize) {
        Object [] temp = new Object[newSize];
        
        for (int i = 0, current = head; i < numItems; i++, current++){
        temp[i] = items[current % items.length];
    }

    }
    
    private class wrappedArrayIterator implements Iterator{
        
        private int i = numItems;
        private int current = head;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Object next() {
            i--;
            return items[(current++ % items.length)];
        }
        
    }

}
