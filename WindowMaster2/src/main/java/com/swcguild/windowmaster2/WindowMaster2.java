package com.swcguild.windowmaster2;

import java.util.Scanner;

public class WindowMaster2 {

    public static void main(String[] args) {
// declare variables for height and width
        float height;
        float width;
// declare String variables to hold the user's height and width
// input
        String stringHeight;
        String stringWidth;
// declare other variables
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

// Get input from user
        height = readValue("Please enter window height: ");
        width = readValue("Please enter window width");
// calculate area of window
        areaOfWindow = height * width;
// calculate the perimiter of the window
        perimeterOfWindow = 2 * (height + width);
// calculate total cost - use hard coded for material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));
        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }

    public static float readValue(String message){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(message);
        String input = sc.nextLine();
        float floatVal = Float.parseFloat(input);
        return floatVal;
    }
}
