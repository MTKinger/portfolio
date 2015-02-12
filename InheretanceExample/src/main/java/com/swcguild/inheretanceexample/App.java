package com.swcguild.inheretanceexample;

public class App {
    
    public static void main(String[] args) {
        
        Manager mgmt = new Manager("Tom", "9876");
        SummerIntern intern = new SummerIntern("Mike", "6497", "Drexel");
        
        Employee emp1 = new Manager("Jess", "4815");
        emp1.doWork();
        emp1.createObjectives();
        
        Manager mgmt1 = (Manager) emp1;
        mgmt1.fire();
        mgmt1.setName("Jessica");
        
        System.out.println(emp1.getName());
        
    }

}
