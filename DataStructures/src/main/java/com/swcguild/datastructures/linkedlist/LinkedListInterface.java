package com.swcguild.datastructures.linkedlist;

public interface LinkedListInterface extends Iterable {

    public void prepend(Object object);

    public void append(Object object);

    public void insert(Object object, int element);

    public Object get(int element);

    public Object remove(int element);

    public int size();

    public boolean isEmpty();

}
