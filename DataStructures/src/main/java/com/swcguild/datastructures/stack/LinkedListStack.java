package com.swcguild.datastructures.stack;

import java.util.Iterator;

public class LinkedListStack implements Stack {
    
    private int numItems = 0;
    private Node first;
    

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return numItems;
    }

    @Override
    public void push(Object object) {
        Node oldFirst = first;
        first = new Node();
        first.item = object;
        first.next = oldFirst;
        numItems++;
    }

    @Override
    public Object pop() {
        Node current = first;
        Object item = current.item;
        first = first.next;
        numItems--;
        return item;
    }

    @Override
    public Iterator iterator() {
        return new linkedListIterator();
    }
    
    private class Node {
        Object item;
        Node next;
        
    }
    
    private class linkedListIterator implements Iterator{
        
        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Object next() {
            if(current == null){
                return null;
            }
            Object item = current.item;
            current = current.next;
            return item;
        }
        
    }
    
    

}
