package com.swcguild.lunchables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
    
    public static void main(String[] args) {
        Map<String, List<String>> taskMap = new HashMap<>();
        
        List<String> mondayList = new ArrayList<>();
        mondayList.add("pick up coffee");
        mondayList.add("wash the car");
        
        taskMap.put("Monday", mondayList);
        
        List<String> tuesdayList = new ArrayList<>();
        tuesdayList.add("doctor's appt");
        tuesdayList.add("haircut");
        
        taskMap.put("Tuesday", tuesdayList);
        
        List<String> mondayNew = taskMap.get("Monday");
        mondayNew.add("take the dog to the kennel");
        
        Set<String> days = taskMap.keySet();
        for(String currentDay : days){
            System.out.println("-" + currentDay + "-");
            List<String> todaysTasks = taskMap.get(currentDay);
            int taskNumber = 1;
            for(String currentTask : todaysTasks){
                System.out.println("\t" + taskNumber++ + ". "  + currentTask);
            }
            System.out.println("");
        }
    }

}
