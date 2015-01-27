package com.swcguild.masteryproject;

import UI.ConsoleIO;
import java.time.LocalDate;

public class TestArea {
    
    public static void main(String[] args) {
        
        ConsoleIO cio = new ConsoleIO();
        
        String year = cio.getString("Please enter the year of your order: ");
        String month = cio.getString("Please enter the month of your order: ");
        String day = cio.getString("Please enter the day of the month of your order: ");
        String toLocal = year+"-"+month+"-"+day;
        
        LocalDate ld = LocalDate.parse(toLocal);
        System.out.println(ld);
        
        if (ld.equals(LocalDate.now())){
            cio.printMessage("all good");
        }else{
            cio.printMessage("uh-oh");
        }
        
        
    }

}
