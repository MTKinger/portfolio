package com.swcguild.masteryproject;

import UI.ConsoleIO;
import java.time.LocalDate;

public class TestArea {
    
    public static void main(String[] args) {
        
        ConsoleIO cio = new ConsoleIO();
        
       double test = cio.getDouble("gimme a double");
        System.out.println(test);
        
        String testSt = cio.getString("gimme a string");
        System.out.println(testSt);
        
    }

}
