package com.swcguild.datastructures.queue;

import java.util.Iterator;

public class ArrayQueue implements Queue {

    private Object[] items;
    private static final int DEFAULT_INITIAL_SIZE = 4;
    private int numItems;
    private int head = 0;
    private int tail = -1;

    public ArrayQueue(int size) {
        items = new Object[size];
    }

    public ArrayQueue() {
        items = new Object[DEFAULT_INITIAL_SIZE];
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
    public void enqueue(Object object) {
        Object[] temp;
        int tempSlot = 0;
        if (tail == (items.length - 1) && numItems != items.length) {
            tail = -1;
            items[++tail] = object;
        } else if (numItems == items.length) {
            resize(items.length * 2);
            tail = numItems;
            items[tail] = object;
        } else {
            items[++tail] = object;
        }
        numItems++;
    }

    @Override
    public Object dequeue() {
        if (numItems == 0) {
            return null;
        }
        Object item = items[head];
        items[head] = null;
        head++;
        numItems--;
        if (numItems > 0 && numItems <= (items.length / 4)) {
            resize(items.length / 2);
            head = 0;
            tail = numItems;
        }
        return item;
    }

    @Override
    public Iterator iterator() {
        return new wrappedArrayIterator();
    }

    private void resize(int newSize) {
        Object[] temp = new Object[newSize];
        int tempSlot = 0;
        if (numItems == items.length) {
            for (int i = head; i < items.length; i++) {
                temp[tempSlot] = items[i];
                tempSlot++;
            }
            for (int j = 0; j <= tail; j++) {
                temp[tempSlot] = items[j];
                tempSlot++;
            }

        }

        items = temp;
    }

    public int returnArraySize() {
        return items.length;
    }

    private class wrappedArrayIterator implements Iterator {

        //**NEED TO BE REDESIGNED AFTER TESTING**
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < numItems;
        }

        @Override
        public Object next() {
            return items[i++];
        }
    }

}
