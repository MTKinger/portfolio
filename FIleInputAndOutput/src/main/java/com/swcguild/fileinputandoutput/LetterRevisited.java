package com.swcguild.fileinputandoutput;

import java.io.FileWriter;
import java.io.PrintWriter;

public class LetterRevisited {
    public static void main( String[] args) throws Exception{
        
        PrintWriter out = new PrintWriter(new FileWriter("OutLetter.txt"));
        
        out.println("+------------------------------+");
        out.println("|                          ####|");
        out.println("|                          ####|");
        out.println("|                          ####|");
        out.println("|                              |");
        out.println("|                              |");
        out.println("|                 Mike King    |");
        out.println("|                 1383 Brook   |");
        out.println("|                 Jamison      |");
        out.println("|                              |");
        out.println("+------------------------------+");
        out.flush();
        out.close();
        
        
        // That sucked
    
}

}
