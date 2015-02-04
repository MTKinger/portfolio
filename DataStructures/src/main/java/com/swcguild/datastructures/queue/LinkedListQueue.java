package com.swcguild.datastructures.queue;

import java.util.Iterator;

public class LinkedListQueue implements Queue {

    private int numItems = 0;
    private Node first;
    private Node last;

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public void enqueue(Object object) {
        if (numItems == 0) {
            last = new Node();
            last.item = object;
            first = last;
            numItems++;
        } else {
            Node oldLast = last;
            last = new Node();
            last.item = object;
            oldLast.next = last;
            numItems++;

        }
    }

    @Override
    public Object dequeue() {
        Node current = first;
        Object item = current.item;
        first = first.next;
        numItems--;
        return item;
    }

    @Override
    public Iterator iterator() {
        return new linkedListiterator();
    }

    private class linkedListiterator implements Iterator {

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            if (current == null) {
                return null;
            }
            Object item = current.item;
            current = current.next;
            return item;
        }

    }

    private class Node {

        Object item;
        Node next;
    }

}
