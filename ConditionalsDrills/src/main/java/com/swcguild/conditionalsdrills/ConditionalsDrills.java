package com.swcguild.conditionalsdrills;

public class ConditionalsDrills {

    public boolean mischeviousChildren(boolean aSmile, boolean bSmile) {
        boolean output = false;
        if (aSmile == true && bSmile == true) {
            output = true;
        }
        if (aSmile == false && bSmile == false) {
            output = true;
        }
        return output;
    }

    public boolean sleepingIn(boolean isWeekday, boolean onVacation) {
        boolean output = false;
        if (isWeekday == false || onVacation == true) {
            output = true;
        }
        return output;
    }

    public int sumDouble(int a, int b) {
        int output;
        if (a == b) {
            output = (a + b) * 2;
        } else {
            output = a + b;
        }
        return output;
    }

    public int diff21(int a) {
        int output;
        if (a > 21) {
            output = (2 * (Math.abs(21 - a)));
        } else {
            output = Math.abs(21 - a);
        }
        return output;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        boolean output = false;
        if (talking == true) {
            if (hour < 7 || hour > 20) {
                output = true;
            }
        }
        return output;
    }

    public boolean makes10(int a, int b) {
        boolean output = false;
        if (a == 10 || b == 10) {
            output = true;
        } else if (a + b == 10) {
            output = true;
        }
        return output;
    }

    public boolean nearHundred(int a) {
        boolean output = false;
        if (Math.abs(100 - a) <= 10 || Math.abs(200 - a) <= 10) {
            output = true;
        }
        return output;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        boolean output = false;
        if (a < 0 && b >= 0 && negative == false) {
            output = true;
        } else if (a >= 0 && b < 0 && negative == false) {
            output = true;
        } else if (a < 0 && b < 0 && negative == true) {
            output = true;
        }
        return output;
    }

    public String notString(String a) {
        String output;
        if (a.length() < 3) {
            output = "not " + a;
        } else if (a.substring(0, 3).equalsIgnoreCase("not")) {
            output = a;
        } else {
            output = "not " + a;
        }
        return output;
    }

    public String missingChar(String a, int n) {
        String output;
        output = a.substring(0, n) + a.substring(n + 1);
        return output;
    }

    public String frontBack(String a) {
        String output;
        if (a.length() == 1) {
            output = a;
        } else if (a.length() == 2) {
            output = a.substring(1) + a.substring(0, 1);
        } else {
            output = a.substring(a.length() - 1) + a.substring(1, a.length() - 1)
                    + a.substring(0, 1);
        }
        return output;
    }

    public String front3(String a) {
        String output;
        if (a.length() < 3) {
            output = a + a + a;
        } else {
            output = a.substring(0, 3) + a.substring(0, 3) + a.substring(0, 3);
        }
        return output;
    }

    public String backAround(String a) {
        String output;
        output = a.substring(a.length() - 1) + a + a.substring(a.length() - 1);
        return output;
    }

    public boolean multiple3or5(int a) {
        boolean output = false;
        if (a % 3 == 0 || a % 5 == 0) {
            output = true;
        }
        return output;
    }

    public boolean startHi(String a) {
        boolean output = false;
        if (a.length() < 2) {
            output = false;
        } else if (a.length() == 2) {
            if (a.equalsIgnoreCase("hi")) {
                output = true;
            }
        } else if (a.substring(0, 3).equalsIgnoreCase("hi ")) {
            output = true;
        }
        return output;
    }

    public boolean icyHot(int a, int b) {
        boolean output = false;
        if (a > 100 && b < 0) {
            output = true;
        } else if (a < 0 && b > 100) {
            output = true;
        }
        return output;
    }

    public boolean between10and20(int a, int b) {
        boolean output = false;
        if (a >= 10 && a <= 20) {
            output = true;
        } else if (b >= 10 && b <= 20) {
            output = true;
        }
        return output;
    }

    public boolean hasTeen(int a, int b, int c) {
        boolean output = false;
        if (a >= 13 && a <= 19) {
            output = true;
        } else if (b >= 13 && b <= 19) {
            output = true;
        } else if (c >= 13 && c <= 19) {
            output = true;
        }
        return output;
    }

    public boolean soAlone(int a, int b) {
        boolean output = false;
        if (a >= 13 && a <= 19) {
            if (b < 13 || b > 19) {
                output = true;
            }
        } else if (b >= 13 && b <= 19) {
            if (a < 13 || a > 19) {
                output = true;
            }
        }
        return output;
    }

    public String removeDel(String a) {
        String output;
        if (a.length() < 4) {
            output = a;
        } else if (a.substring(1, 4).equalsIgnoreCase("del")) {
            output = a.substring(0, 1) + a.substring(4);
        } else {
            output = a;
        }
        return output;
    }

    public boolean ixStart(String a) {
        boolean output = false;
        if (a.length() < 3) {
            output = false;
        } else if (a.substring(1, 3).equalsIgnoreCase("ix")) {
            output = true;
        }
        return output;
    }

    public String startOz(String a) {
        String output = "";
        if (a.length() == 0) {
            output = "";
        } else if (a.length() == 1) {
            if (a.equalsIgnoreCase("o")) {
                output = a;
            }
        } else {
            if (a.substring(0, 1).equalsIgnoreCase("o")
                    && a.substring(1, 2).equalsIgnoreCase("z")) {
                output = a.substring(0, 2);
            } else if (a.substring(0, 1).equalsIgnoreCase("o")
                    && !a.substring(1, 2).equalsIgnoreCase("z")) {
                output = a.substring(0, 1);
            } else if (!a.substring(0, 1).equalsIgnoreCase("o")
                    && a.substring(1, 2).equalsIgnoreCase("z")) {
                output = a.substring(1, 2);
            }
        }
        return output;
    }

    public int max(int a, int b, int c) {
        int output;
        if (a >= b && a >= c) {
            output = a;
        } else if (b >= a && b >= c) {
            output = b;
        } else {
            output = c;
        }
        return output;
    }

    public int closer(int a, int b) {
        int output = 0;
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            output = a;
        } else if (Math.abs(10 - b) < Math.abs(10 - a)) {
            output = b;
        }
        return output;
    }

    public boolean howManyE(String a) {
        boolean output = false;
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.substring(i, i + 1).equalsIgnoreCase("e")) {
                counter++;
            }
        }
        if (counter >= 1 && counter <= 3) {
            output = true;
        }
        return output;
    }

    public String endUp(String a) {
        String output;
        if (a.length() <= 3) {
            output = a.toUpperCase();
        } else {
            output = a.substring(0, a.length() - 3)
                    + a.substring(a.length() - 3).toUpperCase();
        }
        return output;
    }

    public String everyNth(String a, int n){
        String output = a.substring(0, 1);
        for ( int i = n; i < a.length(); i+=n){
            output = output + a.substring(i, i+1);
        }
        return output;
    }

}
