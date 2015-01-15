package com.swcguild.statecapitalslab;

import java.util.HashMap;
import java.util.Set;

public class StateCapitals2 {

    public static void main(String[] args) {

        HashMap<String, State> map = new HashMap<String, State>();
        ConsoleIO cio = new ConsoleIO();

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

        st1.setPopulation(32660);
        st2.setPopulation(1513000);
        st3.setPopulation(479686);
        st4.setPopulation(649495);
        st5.setPopulation(186411);
        st6.setPopulation(214237);
        st7.setPopulation(18793);

        st1.setSquareMiles(2717);
        st2.setSquareMiles(517);
        st3.setSquareMiles(101);
        st4.setSquareMiles(155);
        st5.setSquareMiles(103);
        st6.setSquareMiles(80);
        st7.setSquareMiles(58);

        map.put(st1.getName(), st1);
        map.put(st2.getName(), st2);
        map.put(st3.getName(), st3);
        map.put(st4.getName(), st4);
        map.put(st5.getName(), st5);
        map.put(st6.getName(), st6);
        map.put(st7.getName(), st7);

        Set<String> keys = map.keySet();
        for (String keyName : keys) {
            System.out.println("State: " + keyName);
            State st = map.get(keyName);
            System.out.println("Capital: " + st.getCapital());
            System.out.println("Population: " + st.getPopulation());
            System.out.println("Square Milage: " + st.getSquareMiles());
            System.out.println("");
        }
        int minPop = cio.getInt("What minimum population would you like to use?\n");
        System.out.println("");
        for (String keyName : keys) {
            State st = map.get(keyName);
            if (st.getPopulation() > minPop) {
                System.out.println("Capital: " + st.getCapital());
                System.out.println("");
            }
        }

    }

}
