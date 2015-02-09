package com.swcguild.lunchables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TaskExample2 {
    
    public static void main(String[] args) {
        //Map to hold all tasks
        Map<String, Map<String, List<String>>> taskMap = new HashMap<>();
        
        String takeBossToLunchTask = "Take boss to lunch";
        //List to hold monday work tasks
        List<String> mondayWorkTaskList = new ArrayList<>();
        mondayWorkTaskList.add(takeBossToLunchTask);
        //map to hold all monday tasks
        Map<String, List<String>> mondayTaskMap = new HashMap<>();
        mondayTaskMap.put("Work", mondayWorkTaskList);
        
        taskMap.put("Monday", mondayTaskMap);
        
        mondayWorkTaskList.add("File TPS Reports");
        
        String takeOutGarbageTask = "Take out garbage";
        List<String> mondayHomeTaskList = new ArrayList<>();
        mondayHomeTaskList.add(takeOutGarbageTask);
        mondayTaskMap.put("Home", mondayHomeTaskList);
        
        
        Map<String, List<String>> tuesdayTaskMap = new HashMap<>();
        
        List<String> tuesdayErrands = new ArrayList<>();
        tuesdayErrands.add("Grocery shopping");
        tuesdayErrands.add("Stop at the post office");
        
        tuesdayTaskMap.put("Errands", tuesdayErrands);
        
        taskMap.put("Tuesday", tuesdayTaskMap);
        
        String dropOffHomeworkTask = "Drop off homework";
        String pickUpKidsFromSoccer = "Pick up kids from soccer";
        
        List<String> schoolTaskList = new ArrayList<>();
        schoolTaskList.add(dropOffHomeworkTask);
        schoolTaskList.add(pickUpKidsFromSoccer);
        
        tuesdayTaskMap.put("School", schoolTaskList);
        
        Set<String> daysOfWeek = taskMap.keySet();
        for(String currentDay : daysOfWeek){
            System.out.println("*" + currentDay + "*\n");
            Map<String, List<String>> currentDaysMap = taskMap.get(currentDay);
            Set<String> typeOfList = currentDaysMap.keySet();
            for(String currentList : typeOfList){
                System.out.println("\t-" + currentList + "-");
                List<String> errands = currentDaysMap.get(currentList);
                for(String currentErrand : errands){
                    System.out.println("\t" + currentErrand);
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        
        
    }

}
