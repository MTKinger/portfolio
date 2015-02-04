package com.swcguild.datastructures.linkedlist;

import com.swcguild.datastructures.queue.LinkedListQueue;
import com.swcguild.datastructures.stack.LinkedListStack;
import java.util.Iterator;

public class LinkedList implements LinkedListInterface {

    private int numItems = 0;
    private Node first;
    private Node last;

    //**TESTED**
    @Override
    public void prepend(Object object) {
        if (numItems == 0) {
            last = new Node();
            last.item = object;
            first = last;
            numItems++;
        } else {
            Node oldFirst = first;
            first = new Node();
            first.item = object;
            first.next = oldFirst;
            numItems++;
        }
    }

    //**TESTED**
    @Override
    public void append(Object object) {
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

    //**TESTED**
    @Override
    public void insert(Object object, int element) {
        if (element == 0) {
            last = new Node();
            last.item = object;
            first = last;
            numItems++;
        } else {
            Node current = first;
            Node inNode = new Node();
            for (int counter = 1; counter < element; counter++) {
                current = current.next;
            }
            inNode.item = object;
            inNode.next = current.next;
            current.next = inNode;
            numItems++;
        }
    }

    //**TESTED**
    @Override
    public Object get(int element) {
        Node current = first;
        for (int counter = 0; counter < element; counter++) {
            current = current.next;
        }
        return current.item;
    }

    //**TESTED**
    @Override
    public Object remove(int element) {
        Node current = first;
        Node currentNext = new Node();
        for (int counter = 1; counter < element; counter++) {
            current = current.next;
        }
        currentNext = current.next;
        Object object = currentNext.item;
        current.next = currentNext.next;
        numItems--;
        return object;

    }

    //**TESTED**
    @Override
    public int size() {
        return numItems;
    }

    //**TESTED**
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    //**TESTED**
    @Override
    public Iterator iterator() {
        return new linkedListIterator();
    }

    private class linkedListIterator implements Iterator {

        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
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
