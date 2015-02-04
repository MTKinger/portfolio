/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.datastructures.queue;

/**
 *
 * @author apprentice
 */
public interface Queue extends Iterable{
    
    public boolean isEmpty();
    
    public int size();
    
    public void enqueue(Object object);
    
    public Object dequeue();
    
}
