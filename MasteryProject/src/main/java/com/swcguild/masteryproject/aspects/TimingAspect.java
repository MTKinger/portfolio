package com.swcguild.masteryproject.aspects;

import org.aspectj.lang.ProceedingJoinPoint;

public class TimingAspect {
    
    public Object readProductTimer(ProceedingJoinPoint jp){
        Object ret = null;
        
        try{
            long start = System.currentTimeMillis();
            ret = jp.proceed();
            long end = System.currentTimeMillis();
            
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println(jp.getSignature().getName() + " took " + (end-start) + " ms.");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }catch(Throwable thr){
            System.out.println("Exception in simple timer aspect.");
        }
       return ret; 
    }
    
    public Object readTaxTimer(ProceedingJoinPoint jp){
        Object ret = null;
        
        try{
            long start = System.currentTimeMillis();
            ret = jp.proceed();
            long end = System.currentTimeMillis();
            
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println(jp.getSignature().getName() + " took " + (end-start) + " ms.");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }catch(Throwable thr){
            System.out.println("Exception in simple timer aspect.");
        }
       return ret;
    }
    
    public Object readOrdersTimer(ProceedingJoinPoint jp){
        Object ret = null;
        
        try{
            long start = System.currentTimeMillis();
            ret = jp.proceed();
            long end = System.currentTimeMillis();
            
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println(jp.getSignature().getName() + " took " + (end-start) + " ms.");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }catch(Throwable thr){
            System.out.println("Exception in simple timer aspect.");
        }
       return ret;
    }
    
    public Object writeOrdersTimer(ProceedingJoinPoint jp){
        Object ret = null;
        
        try{
            long start = System.currentTimeMillis();
            ret = jp.proceed();
            long end = System.currentTimeMillis();
            
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println(jp.getSignature().getName() + " took " + (end-start) + " ms.");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }catch(Throwable thr){
            System.out.println("Exception in simple timer aspect.");
        }
       return ret;
    }

}
