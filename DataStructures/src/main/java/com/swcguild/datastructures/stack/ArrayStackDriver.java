package com.swcguild.datastructures.stack;

public class ArrayStackDriver {
    
    public static void main(String[] args){
        
        Stack st = new ArrayStack();
        String a  = "a";
        String b  = "b";
        String c  = "c";
        String d  = "d";
        String e  = "e";
        int foo = 10;
        double bar = 10.257;
        
        st.push(a);
        st.push(b);
        st.push(c);
        st.push(d);
        st.push(e);
        st.push(foo);
        st.push(bar);
        
        for (Object o : st){
            System.out.println(o);
        }
        
    }

}
