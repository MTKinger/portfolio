package com.swcguild.logicdrillstest;

import java.util.Random;

public class LogicDrills {

    Random r = new Random();

    public boolean greatParty(int cigars, boolean isWeekend) {
        boolean output = false;
        if (isWeekend == true) {
            if (cigars >= 40) {
                output = true;
            }
        } else {
            if (cigars >= 40 && cigars <= 60) {
                output = true;
            }
        }
        return output;
    }

    public int canHazTables(int you, int date) {
        int output;
        if (you <= 2 || date <= 2) {
            output = 0;
        } else if (you >= 8 || date >= 8) {
            output = 2;
        } else {
            output = 1;
        }
        return output;
    }

    public boolean playOutside(int temp, boolean isSummer) {
        boolean output = false;
        if (isSummer == true && temp >= 60 && temp <= 100) {
            output = true;
        } else if (temp >= 60 && temp <= 90) {
            output = true;
        }
        return output;
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int output = 0;
        if (isBirthday == true) {
            if (speed > 65 && speed <= 85) {
                output = 1;
            } else if (speed > 85) {
                output = 2;
            }
        } else {
            if (speed > 60 && speed <= 80) {
                output = 1;
            } else if (speed > 80) {
                output = 2;
            }
        }
        return output;
    }

    public int skipSum(int a, int b) {
        int output;
        if (a + b > 9 && a + b < 21) {
            output = 20;
        } else {
            output = a + b;
        }
        return output;
    }

    public String alarmClock(int day, boolean onVacation) {
        String output;
        if (onVacation == true) {
            if (day >= 1 && day <= 5) {
                output = "10:00";
            } else {
                output = "Alarm Off";
            }
        } else {
            if (day >= 1 && day <= 5) {
                output = "7:00";
            } else {
                output = "10:00";
            }
        }
        return output;
    }

    public boolean loveSix(int a, int b) {
        boolean output = false;
        if (a == 6 || b == 6) {
            output = true;
        } else if (a + b == 6) {
            output = true;
        } else if (a - b == 6 || b - a == 6) {
            output = true;
        }
        return output;
    }

    public boolean inRange(int n, boolean outsideMode) {
        boolean output = false;
        if (outsideMode == false) {
            if (n >= 1 && n <= 10) {
                output = true;
            }
        }
        if (outsideMode == true) {
            if (n <= 1 || n >= 10) {
                output = true;
            }
        }
        return output;
    }

    public boolean specialEleven(int a) {
        boolean output = false;
        if (a % 11 == 0 || (a - 1) % 11 == 0) {
            output = true;
        }
        return output;
    }

    public boolean mod20(int a) {
        boolean output = false;
        if ((a - 1) % 20 == 0 || (a - 2) % 20 == 0) {
            output = true;
        }
        return output;
    }

    public boolean mod35(int a) {
        boolean output = false;
        if (a % 3 == 0 && a % 5 == 0) {
            output = false;
        } else if (a % 3 == 0 && a % 5 != 0) {
            output = true;
        } else if (a % 3 != 0 && a % 5 == 0) {
            output = true;
        }
        return output;
    }

    public boolean answerCall(boolean morning, boolean mom, boolean asleep) {
        boolean output = false;
        if (asleep == true) {
            output = false;
        } else if (morning == true && mom == false) {
            output = false;
        } else if (morning == true && mom == true) {
            output = true;
        } else if (morning == false && asleep == false) {
            output = true;
        }
        return output;
    }

    public boolean twoIsOne(int a, int b, int c) {
        boolean output = false;
        if (a + b == c || a + c == b || c + b == a) {
            output = true;
        }
        return output;
    }

    public boolean areInOrder(int a, int b, int c, boolean bOK) {
        boolean output = false;
        if (b > a && c > b) {
            output = true;
        } else if (bOK == true && c > a) {
            output = true;
        }
        return output;
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOK) {
        boolean output = false;
        if (b > a && c > b) {
            output = true;
        } else if (equalOK == true && b >= a && c >= b) {
            output = true;
        }
        return output;
    }

    public boolean lastDigit(int a, int b, int c) {
        boolean output = false;
        if (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) {
            output = true;
        }
        return output;
    }

    public int rollDice(int a, int b, boolean noDoubles) {
        int output = 0;
        if (a == b && b != 6 && noDoubles == true) {
            output = a + b + 1;
        } else if (a == b && b == 6 && noDoubles == true) {
            output = a + b - 5;
        } else {
            output = a + b;
        }
        return output;
    }

}
