package com.swcguild.vendmachinelab;

public class Change {

    int totalBack;
    int quarters;
    int dimes;
    int nickles;
    int pennies;

    Change(int totalBack) {
        this.totalBack = totalBack;
        while (this.totalBack >= 25) {
            quarters += 1;
            this.totalBack -= 25;
        }
        while (this.totalBack >= 10) {
            dimes += 1;
            this.totalBack -= 10;
        }
        while (this.totalBack >= 5) {
            nickles += 1;
            this.totalBack -= 5;
        }
        while (this.totalBack > 0) {
            pennies += 1;
            this.totalBack -= 1;
        }
    }

    public String changeToString() {
        return "Here is your change in the form of " + quarters + " quarters, "
                + dimes + " dimes, " + nickles + " nickles and " + pennies
                + " pennies.";
    }
    
//    public int convertToInt(double userInput){
//        int toInt = (int) (userInput * 100);
//        return toInt;
//    }
//    
//    public double convertToDouble(int userInput){
//        double toDouble = (double)(userInput / 100);
//        return toDouble;
//    }
    
    
}
