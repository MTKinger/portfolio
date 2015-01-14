package com.swcguild.stringdrills;

public class EndsWithLy {

    public static void main(String[] args) {

        StringsIO sio = new StringsIO();
        
        if (sio.EndsWithLy("oddly") == true){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        if (sio.EndsWithLy("buggy") == true){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        if (sio.EndsWithLy("proudly") == true){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
        
    }
}
