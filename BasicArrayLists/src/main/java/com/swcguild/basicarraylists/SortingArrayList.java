package com.swcguild.basicarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SortingArrayList {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        ArrayList<Integer> myArray = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            myArray.add(10 + r.nextInt(90));
        }
        System.out.println(myArray);

        sortList(myArray);
        System.out.println(myArray);

    }

    public static ArrayList<Integer> sortList(ArrayList<Integer> myArray) {

        Collections.sort(myArray);
        Collections.reverse(myArray);
        return myArray;
    }

}
