package com.swcguild.stringdrills;

public class TakeOne {

    public static void main(String[] args) {

        StringsIO sio = new StringsIO();

        System.out.println(sio.takeOne("Hello", true));
        System.out.println(sio.takeOne("Hello", false));
        System.out.println(sio.takeOne("oh", true));
    }

}
