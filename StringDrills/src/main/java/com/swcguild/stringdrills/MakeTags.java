package com.swcguild.stringdrills;

public class MakeTags {
    public static void main(String[] args) {
        StringsIO sio = new StringsIO();
        
        System.out.println(sio.makeTags("i", "Yay"));
        System.out.println(sio.makeTags("i", "Hello"));
        System.out.println(sio.makeTags("cite", "Yay"));
    }

}
