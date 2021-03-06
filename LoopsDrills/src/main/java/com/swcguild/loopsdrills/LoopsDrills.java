package com.swcguild.loopsdrills;

public class LoopsDrills {

    public String stringTimes(String a, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output = output + a;
        }
        return output;
    }

    public String frontTimes(String a, int n) {
        String input;
        String output = "";
        if (a.length() < 3) {
            input = a;
        } else {
            input = a.substring(0, 3);
        }
        for (int i = 0; i < n; i++) {
            output = output + input;
        }
        return output;
    }

    public int countXX(String a) {
        int output = 0;
        if (a.length() < 1) {
            output = 0;
        } else {
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.substring(i, i + 2).equalsIgnoreCase("xx")) {
                    output++;
                }
            }
        }

        return output;
    }

    public boolean doubleX(String a) {
        boolean check = false;
        int count = 0;
        boolean output = false;
        for (int i = 0; check == false && i < a.length(); i++) {
            if (a.substring(i, i + 1).equalsIgnoreCase("x")) {
                check = true;
            }
            count++;
        }
        if (check == true && a.substring(count - 1, count + 1).equalsIgnoreCase("xx")) {
            output = true;
        }

        return output;
    }

    public String everyOther(String a) {
        String output = "";

        if (a.length() < 3) {
            output = a.substring(0, 1);
        } else {
            for (int i = 0; i < a.length(); i += 2) {
                output = output + a.substring(i, i + 1);
            }
        }
        return output;
    }

    public String stringSplosion(String a) {
        String output = "";

        for (int i = 0; i < a.length(); i++) {
            output = output + a.substring(0, 1 + (1 * i));
        }

        return output;
    }

    public int countLast2(String a) {
        int output = 0;

        for (int i = 0; i < a.length() - 2; i++) {
            if (a.substring(i, i + 2).equalsIgnoreCase(a.substring(a.length() - 2))) {
                output++;
            }
        }
        return output;
    }

    public int count9(int[] testArray) {
        int output = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (testArray[i] == 9) {
                output++;
            }
        }
        return output;
    }

    public boolean arrayFront9(int[] testArray) {
        boolean output = false;
        boolean check = false;
        for (int i = 0; i < 4 && check == false; i++) {
            if (testArray[i] == 9) {
                output = true;
                check = true;
            }
        }
        return output;
    }

    public boolean array123(int[] testArray) {
        boolean output = false;
        boolean check = false;
        for (int i = 0; i < testArray.length - 2 && check == false; i++) {
            if (testArray[i] == 1 && testArray[i + 1] == 2 && testArray[i + 2] == 3) {
                output = true;
                check = true;
            }
        }
        return output;
    }

    public int substringMatch(String a, String b) {
        int shortWord;
        int output = 0;
        if (a.length() > b.length()) {
            shortWord = b.length();
        } else {
            shortWord = a.length();
        }
        for (int i = 0; i < shortWord - 1; i++) {
            if (a.substring(i, i + 2).equalsIgnoreCase(b.substring(i, i + 2))) {
                output++;
            }
        }
        return output;
    }

    public String stringX(String a) {
        String output = a;
        int count = 0;
        if (a.length() < 3) {
            output = a;
        } else {
            for (int i = 1; i < (a.length() - count) - 1;) {
                if (output.substring(i, i + 1).equalsIgnoreCase("x")) {
                    output = output.substring(0, i) + output.substring(i + 1);
                    count++;
                } else {
                    i++;
                }
            }
        }
        return output;
    }

    public String altPairs(String a) {
        String output = "";
        for (int i = 0; i < a.length(); i += 4) {
            if (i + 1 < a.length()) {
                output = output + a.substring(i, i + 2);
            } else {
                output = output + a.substring(i);
            }
        }
        return output;
    }

    public String doNotYak(String a) {
        String output = a;
        for (int i = 0; i < output.length() - 2;) {
            if (output.substring(i, i + 3).equalsIgnoreCase("yak")) {
                output = output.substring(0, i) + output.substring(i + 3);
            } else {
                i++;
            }
        }

        return output;
    }

    public int array667(int[] testArray) {
        int counter = 0;
        for (int i = 0; i < testArray.length - 1; i++) {
            if ((testArray[i] == 6 && testArray[i + 1] == 6)
                    || (testArray[i] == 6 && testArray[i + 1] == 7)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean noTripples(int[] testArray) {
        boolean output = true;
        if (testArray.length < 3) {
            output = true;
        } else {
            for (int i = 0; i < testArray.length - 2; i++) {
                if (testArray[i] == testArray[i + 1] && testArray[i] == testArray[i + 2]) {
                    output = false;
                }
            }
        }
        return output;
    }

    public boolean pattern51(int[] testArray) {
        boolean output = false;
        boolean check = false;
        if (testArray.length < 3) {
            output = false;
        } else {
            for (int i = 0; i < testArray.length - 2 && check == false; i++) {
                if (testArray[i] + 5 == testArray[i + 1] && testArray[i] - 1 == testArray[i + 2]) {
                    output = true;
                    check = true;
                }
            }
        }
        return output;
    }
}
