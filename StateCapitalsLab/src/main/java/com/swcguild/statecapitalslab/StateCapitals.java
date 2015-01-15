package com.swcguild.statecapitalslab;

import java.util.HashMap;
import java.util.Set;

public class StateCapitals {
    
    public static void main(String[] args) {
        
        HashMap<String, State> map = new HashMap<String, State>();
        
        State st1 = new State();
        State st2 = new State();
        State st3 = new State();
        State st4 = new State();
        State st5 = new State();
        State st6 = new State();
        State st7 = new State();
        
        st1.setName("Alaska");
        st2.setName("Arizona");
        st3.setName("California");
        st4.setName("Colorado");
        st5.setName("Florida");
        st6.setName("Idaho");
        st7.setName("Maine");
        
        st1.setCapital("Juneau");
        st2.setCapital("Phoenix");
        st3.setCapital("Sacramento");
        st4.setCapital("Denver");
        st5.setCapital("Tallahassee");
        st6.setCapital("Boise");
        st7.setCapital("Augusta");
        
        map.put(st1.getName(),st1);
        map.put(st2.getName(),st2);
        map.put(st3.getName(),st3);
        map.put(st4.getName(),st4);
        map.put(st5.getName(),st5);
        map.put(st6.getName(),st6);
        map.put(st7.getName(),st7);
        
        Set <String> keys = map.keySet();
        for(String keyName : keys){
            System.out.println("State: " + keyName);
            State st = map.get(keyName);
            System.out.println("Capital: " + st.getCapital());
            System.out.println("");
        }
        
    }

}
