package com.swcguild.olympian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        /**SkiJumper jumper = ctx.getBean("superSkiJumper", SkiJumper.class);
        jumper.competeInEvent();
        
        Olympian olympian = new Olympian(new SkiJumpEvent());
        olympian.competeInEvent();*/
        
        Olympian usaSkiJumper = ctx.getBean("usaSkiJumper", Olympian.class);
        Olympian usaSpeedSkater = ctx.getBean("usaSpeedSkater", Olympian.class);
        Olympian canadianSpeedSkater = ctx.getBean("canadianSpeedSkater", Olympian.class);
        
        usaSkiJumper.competeInEvent();
        usaSpeedSkater.competeInEvent();
        canadianSpeedSkater.competeInEvent();
    }

}
