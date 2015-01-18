package com.swcguild.arraysdrills;

public class ArraysDrills {

    public boolean firstLast6(int[] testArray) {
        boolean output = false;
        if (testArray[0] == 6 || testArray[testArray.length - 1] == 6) {
            output = true;
        }
        return output;
    }

    public boolean sameFirstLast(int[] testArray) {
        boolean output;
        if (testArray.length > 1 && testArray[0] == testArray[testArray.length - 1]) {
            output = true;
        } else {
            output = false;
        }
        return output;
    }

//    public int[] makePi(int n){
//        int[] piArray;
//        piArray = new int[n];
//        
//        for (int i = 0; i<n; i++){
//            piArray[i] = Math.PI;
//        }
    // NEED TO LEARN HOW TO WORK WITH PI
    // MAY BECOME IMPORTANT
    public boolean commonEnd(int[] testArray1, int[] testArray2) {
        boolean output = false;
        if (testArray1[0] == testArray2[0]
                || testArray1[testArray1.length - 1] == testArray2[testArray2.length - 1]) {
            output = true;
        }
        return output;
    }

    public int sum(int[] testArray) {
        int sum = 0;
        for (int i = 0; i < testArray.length; i++) {
            sum = sum + testArray[i];
        }
        return sum;
    }

    public int[] rotateLeft(int[] testArray) {
        int[] output;
        output = new int[testArray.length];
        output[output.length - 1] = testArray[0];
        for (int i = 0; i < output.length - 1; i++) {
            output[i] = testArray[i + 1];
        }
        return output;
    }

    public int[] reverse(int[] testArray) {
        int[] output;
        output = new int[testArray.length];
        for (int i = 0; i < testArray.length; i++) {
            output[i] = testArray[testArray.length - (1 + i)];
        }

        return output;
    }

    public int[] higherWins(int[] testArray) {
        int[] output;
        output = new int[testArray.length];
        if (testArray[0] > testArray[testArray.length - 1]) {
            for (int i = 0; i < testArray.length; i++) {
                output[i] = testArray[0];
            }
        } else {
            for (int i = 0; i < testArray.length; i++) {
                output[i] = testArray[testArray.length - 1];
            }
        }
        return output;
    }

    public int[] getMiddle(int[] testArray1, int[] testArray2) {
        int[] output;
        output = new int[2];
        output[0] = testArray1[(testArray1.length / 2)];
        output[1] = testArray2[(testArray2.length / 2)];
        return output;
    }

    public boolean hasEven(int[] tester) {
        boolean output = false;
        boolean check = false;
        for (int i = 0; i < tester.length && check == false; i++) {
            if (tester[i] % 2 == 0) {
                output = true;
                check = true;
            }
        }
        return output;
    }

    public int[] keepLast(int[] tester) {
        int[] output;
        output = new int[tester.length * 2];
        output[output.length - 1] = tester[tester.length - 1];
        return output;
    }

    public boolean double23(int[] tester) {
        boolean output = false;
        int check2 = 0;
        int check3 = 0;

        for (int i = 0; i < tester.length; i++) {
            if (tester[i] == 2) {
                check2++;
            } else if (tester[i] == 3) {
                check3++;
            }
        }
        if (check2 > 1 || check3 > 1) {
            output = true;
        }
        return output;
    }

    public int[] fix23(int[] tester) {
        int[] output;
        output = tester;
        for (int i = 0; i < tester.length; i++) {
            if (tester[i] == 2 && tester[i + 1] == 3) {
                output[i + 1] = 0;
            }
        }
        return output;
    }

    public boolean unlucky1(int[] tester) {
        boolean output = false;
        for (int i = 0; i < 2; i++) {
            if (tester[i] == 1 && tester[i + 1] == 3) {
                output = true;
            }
        }
        for (int i = tester.length - 2; i < tester.length - 1; i++) {
            if (tester[i] == 1 && tester[i + 1] == 3) {
                output = true;
            }
        }
        return output;
    }
    
    public int[]make2(int[] tester1, int[] tester2){
        int[] output = new int[2];
        if (tester1.length == 0){
            output[0] = tester2[0];
            output[1] = tester2[1];
        }else if (tester1.length == 1){
            output[0] = tester1[0];
            output[1] = tester2[0];
        }else{
            output[0] = tester1[0];
            output[1] = tester1[1];
        }
        return output;
    }

}
