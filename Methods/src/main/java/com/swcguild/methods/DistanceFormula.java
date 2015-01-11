package com.swcguild.methods;

public class DistanceFormula {

    public static void main(String[] args) {

        double d1 = distance(-2, 1, 1, 5);
        System.out.println("2,1 to 1,5 ==> " + d1);
        double d2 = distance(-2, -3, -4, 4);
        System.out.println("-2,-3 to -4,4 ==> " + d2);
        double d3 = distance(2,-3,-1,-2);
        System.out.println("2,-3 to -1,-2 ==> " +d3);
        double d4 = distance(4,4,4,4);
        System.out.println("4,4 to 4,4 ==>" + d4);
    }
    
    //Same as last excercise.  If i feel comfortable, I'm going to move
    //on without doing every last itteration of the assignment.

    public static double distance(int x1, int y1, int x2, int y2) {
        int xDiff = (x2 - x1);
        int yDiff = (y2 - y1);
        double squareX = Math.pow(xDiff, 2);
        double squareY = Math.pow(yDiff, 2);
        double distance = Math.sqrt((squareX + squareY));

        return distance;
    }

}
