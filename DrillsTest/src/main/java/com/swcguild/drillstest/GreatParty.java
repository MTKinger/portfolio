package com.swcguild.drillstest;

public class GreatParty {

    public boolean greatParty(int cigars, boolean isWeekend) {
        //between 40 and 60 cigars inclusive
        //if it's the weekend there is no upper bound on the
        //number of cigars.

        if (isWeekend) {
            if (cigars >= 40) {
                return true;
            } else {
                return false;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            } else {
                return false;
            }
        }

    }
}
