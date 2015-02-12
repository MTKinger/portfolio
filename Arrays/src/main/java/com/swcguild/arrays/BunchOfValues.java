package com.swcguild.arrays;

public class BunchOfValues {

    public static void main(String[] args) {
        String[] arr1 = {"alpha", "bravo", "charlie, delta, echo"};

        System.out.print("The first array is filled with the following values:\n\t");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int[] arrLost = {4, 8, 15, 16, 23, 42};

        System.out.print("The second array is filled with the following values:\n\t");
        for (int i = 0; i < arrLost.length; i++) {
            System.out.print(arrLost[i] + "  ");
        }
        System.out.println("");
    }
}
