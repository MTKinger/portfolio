package com.swcguild.lunchables;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    
    public static void main(String[] args) {
        
        //  Create an ArrayList with Student Objects
        //  Student firstName, lastName, major
        //  fill the arrayList with 5 students
        //  iterate through and print names in 3 different ways.
        
        ArrayList<Student> studentList = new ArrayList<>();
        
        Student student = new Student();
        student.setFirstName("Mike");
        student.setLastName("King");
        student.setMajor("Engineering");
        studentList.add(student);
        
        student = new Student();
        student.setFirstName("Jess");
        student.setLastName("Gryn");
        student.setMajor("Art Education");
        studentList.add(student);
        
        student = new Student();
        student.setFirstName("Rudy");
        student.setLastName("Phleger");
        student.setMajor("Criminal Justice");
        studentList.add(student);
        
        student = new Student();
        student.setFirstName("JJ");
        student.setLastName("Grasso");
        student.setMajor("Business");
        studentList.add(student);
        
        student = new Student();
        student.setFirstName("Adam");
        student.setLastName("Day");
        student.setMajor("Chemestry");
        studentList.add(student);
        
        for (Student thisStudent : studentList){
            System.out.println(thisStudent.getFirstName() + " " + thisStudent.getLastName());
        }
        
        System.out.println("");
        
        for(int i = 0; i < studentList.size(); i++){
            System.out.println(studentList.get(i).getFirstName() + " " + studentList.get(i).getLastName());
        }
        
        System.out.println("");
        
        Iterator<Student> iter = studentList.iterator();
        
        while (iter.hasNext()){
            Student currentStudent  = iter.next();
            System.out.println(currentStudent.getFirstName() + " " + currentStudent.getLastName());
        }
        
    }

}
