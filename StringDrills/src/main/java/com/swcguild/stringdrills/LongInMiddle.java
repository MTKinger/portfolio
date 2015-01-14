package com.swcguild.stringdrills;

public class LongInMiddle {
    
    public static void main(String[] args) {
        
        StringsIO sio = new StringsIO();
        
        System.out.println(sio.longInMiddle("Hello", "hi"));
        System.out.println(sio.longInMiddle("hi", "Hello"));
        System.out.println(sio.longInMiddle("aaa", "b"));
    }

}
