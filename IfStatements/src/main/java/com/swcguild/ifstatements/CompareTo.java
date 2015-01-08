package com.swcguild.ifstatements;

import java.util.Scanner;

public class CompareTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Comparing \"axe\" with \"dog\" produces ");
        int i = "axe".compareTo("dog");
        System.out.println(i);
        System.out.print("Comparing\"Mike\" with \"King\" produces ");
        int j = "Mike".compareTo("King");
        System.out.println(j);
        System.out.print("Comparing \"Philadelphia\" with \"Akron\" produces ");
        int k = "Philadelphia".compareTo("Akron");
        System.out.println(k);
        System.out.print("Comparing \"Chip\" with \"Kelly\" produces ");
        int l = "Chip".compareTo("Kelly");
        System.out.println(l);
        System.out.print("Comparing \"giraffe\" with \"tigers\" produces ");
        int m = "giraffe".compareTo("tigers");
        System.out.println(m);
        System.out.print("Comparing \"zebra\" with \"lion\" produces ");
        int n = "zebra".compareTo("lion");
        System.out.println(n);
        System.out.print("Comparing \"java\" with \"code\" produces ");
        int o = "java".compareTo("code");
        System.out.println(o);
        System.out.print("Comparing \"Jesus\" with \"Buddha\" produces ");
        int p = "Jesus".compareTo("Buddha");
        System.out.println(p);
        System.out.print("Comparing \"ass\" with \"butt\" produces ");
        int q = "ass".compareTo("butt");
        System.out.println(q);
        System.out.print("Comparing \"Able\" with \"Cain\" produces ");
        int r = "Able".compareTo("Cain");
        System.out.println(r);
        
    }

}
