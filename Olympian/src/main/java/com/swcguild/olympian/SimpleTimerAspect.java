package com.swcguild.olympian;

import org.aspectj.lang.ProceedingJoinPoint;

public class SimpleTimerAspect {
    
    public Object timeMethod(ProceedingJoinPoint jp){
        Object ret = null;
        
        try{
            long start = System.currentTimeMillis();
            ret = jp.proceed();
            long finish = System.currentTimeMillis();
            
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println(jp.getSignature().getName() + "took " + (finish-start) + " ms.");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        }catch(Throwable thr){
            System.out.println("Exception in simple timer aspect.");
        }
        return ret;
    }

}
