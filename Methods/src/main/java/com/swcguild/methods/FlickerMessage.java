package com.swcguild.methods;

import java.util.Random;

public class FlickerMessage {

    public static void main(String[] args)  throws Exception{

        Random r = new Random();
        int rando;

        for (int i = 0; i < 100; i++) {
            rando = 1 + r.nextInt(5);

            if (rando == 1) {
                first();
            } else if (rando == 2) {
                second();
            } else if (rando == 3) {
                third();
            } else if (rando == 4) {
                fourth();
            } else if (rando == 5) {
                fifth();
            }

        }
        System.out.println("\nI pledge allegiance to the flag.");
    }

    public static void first() throws Exception{
        System.out.print("I                                \r");
        Thread.sleep(250);
    }

    public static void second() throws Exception{
        System.out.print("  pledge                         \r");
        Thread.sleep(250);
    }

    public static void third() throws Exception{
        System.out.print("         allegiance              \r");
        Thread.sleep(250);
    }

    public static void fourth() throws Exception{
        System.out.print("                    to the       \r");
        Thread.sleep(250);
    }

    public static void fifth() throws Exception{
        System.out.print("                           flag.\r");
        Thread.sleep(250);
    }

}
