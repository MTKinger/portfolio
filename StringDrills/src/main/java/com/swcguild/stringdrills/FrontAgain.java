package com.swcguild.stringdrills;

public class FrontAgain {

    public boolean frontAgain(String a) {
        boolean output = false;
        if(a.length() <=2){
            output = false;
        }
        else if (a.substring(0, 2).equalsIgnoreCase(a.substring(a.length() - 2))) {
            System.out.println(a.substring(0, a.length() - 2));
            output = true;
        }
        return output;
    }

}
