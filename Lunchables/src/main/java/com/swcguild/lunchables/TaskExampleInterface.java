/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.lunchables;

import java.util.List;
import java.util.Map;

/**
 *
 * @author apprentice
 */
public interface TaskExampleInterface {
    
    public void addTask(String task, String category,String day);
    public void removeTask(String task, String category,String day);
//    public void addDay(String day);
//    public void removeDay(String day);
//    public void addCategory(String category,String day);
//    public void removeCategory(String category,String day);
    public void editTask(String oldTask, String newTask, String category,String day);
    public void moveTask(String task, String category,String day, String newCategory, String newDay);
    public void repeatTask(String task, String category,String days);
    public void repeatCategory(String category,String days);
    public Map<String, List<String>> displayTasksByDay(String day);
    public List<String> displayTasksByCategory(String category);
    
}
