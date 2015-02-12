package com.swcguild.datastructures.stack;

import java.util.Iterator;

public class GenArrayStack<Item> implements GenStack<Item> {

    private static final int DEFAULT_INITIAL_SIZE = 4;
    private Item[] items;
    private int numItems;

    public GenArrayStack(int size) {
        items = (Item[]) new Object[size];
    }

    public GenArrayStack() {
        this(DEFAULT_INITIAL_SIZE);
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
    public void push(Item item) {
        if(numItems == items.length){
            resize(items.length*2);
        }
        items[numItems++] = item;
    }

    @Override
    public Item pop() {
        if(numItems == 0){
            return null;
        }
        Item item = items[--numItems];
        items[numItems] = null;
        if(numItems > 0 && numItems<=(items.length/4)){
            resize(items.length/2);
        }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new reverseArrayIterator<Item>();
    }
    
    private void resize(int newSize){
        Item[] temp = (Item[]) new Object[newSize];
        for (int i = 0; i <numItems; i++){
            temp[i] = items[i];
        }
        items = temp;
    }
    
    private class reverseArrayIterator<Item> implements Iterator<Item>{

        private int i = numItems;
        
        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return (Item)items[--i];
        }
        
    }

}
